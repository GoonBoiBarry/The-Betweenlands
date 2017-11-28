package thebetweenlands.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javax.annotation.Nullable;
import javax.vecmath.Matrix4f;
import javax.vecmath.Vector4f;

import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.model.pipeline.UnpackedBakedQuad;
import net.minecraftforge.common.model.TRSRTransformation;

public class QuadBuilder {
	static class Vertex {
		public final Vec3d pos;
		public final float u;
		public final float v;
		public final TextureAtlasSprite sprite;
		public final boolean switchUV;
		public final TRSRTransformation transformation;
		public final float[] color;
		public final Vec3d normal;
		public final int blockLight, skyLight;

		private Vertex(Vec3d pos, float u, float v, TextureAtlasSprite sprite, boolean switchUV, TRSRTransformation transformation, float[] color, Vec3d normal, int blockLight, int skyLight) {
			this.pos = pos;
			this.u = u;
			this.v = v;
			this.sprite = sprite;
			this.switchUV = switchUV;
			this.transformation = transformation;
			this.color = color;
			this.normal = normal;
			this.blockLight = blockLight;
			this.skyLight = skyLight;
		}
	}

	public final VertexFormat format;
	private TextureAtlasSprite sprite;
	private boolean switchUV = false;
	private TRSRTransformation transformation;
	private float[] color = new float[]{1f, 1f, 1f, 1f};
	private Vec3d normal;

	private final List<Vertex> vertices;

	private int blockLight = -1, skyLight = -1;
	private boolean hasLightmapElement;
	
	public QuadBuilder(VertexFormat format) {
		this(50, format);
	}

	public QuadBuilder(int vertices, VertexFormat format) {
		this.vertices = new ArrayList<Vertex>(vertices);
		this.format = new VertexFormat(format);
		this.hasLightmapElement = this.format.getElements().contains(DefaultVertexFormats.TEX_2S);
	}

	/**
	 * Sets the lightmap values
	 * @param blockLight
	 * @param skyLight
	 * @return
	 */
	public QuadBuilder setLightmap(int blockLight, int skyLight) {
		this.blockLight = blockLight;
		this.skyLight = skyLight;
		if(!this.hasLightmapElement) {
			this.format.addElement(DefaultVertexFormats.TEX_2S);
			this.hasLightmapElement = true;
		}
		return this;
	}
	
	/**
	 * Removes the lightmap values and uses the default ones
	 * @return
	 */
	public QuadBuilder removeLightmap() {
		this.blockLight = -1;
		this.skyLight = -1;
		return this;
	}
	
	/**
	 * Sets the normal.
	 * Set to null for cross product normal.
	 * @param normal
	 * @return
	 */
	public QuadBuilder setNormal(Vec3d normal) {
		this.normal = normal;
		return this;
	}

	/**
	 * Returns the normal
	 * @return
	 */
	public Vec3d getNormal() {
		return this.normal;
	}

	/**
	 * Sets the color
	 * @param r
	 * @param g
	 * @param b
	 * @param a
	 * @return
	 */
	public QuadBuilder setColor(float r, float g, float b, float a) {
		this.color = new float[4];
		this.color[0] = r;
		this.color[1] = g;
		this.color[2] = b;
		this.color[3] = a;
		return this;
	}

	/**
	 * Returns the current color
	 * @return
	 */
	public float[] getColor() {
		return this.color;
	}

	/**
	 * Sets the transformation
	 * @param transformation
	 * @return
	 */
	public QuadBuilder setTransformation(TRSRTransformation transformation) {
		this.transformation = transformation;
		return this;
	}

	/**
	 * Returns the current transformation
	 * @return
	 */
	public TRSRTransformation getTransformation() {
		return this.transformation;
	}

	/**
	 * Sets the sprite
	 * @param sprite
	 * @return
	 */
	public QuadBuilder setSprite(TextureAtlasSprite sprite) {
		this.sprite = sprite;
		return this;
	}

	/**
	 * Returns the current sprite
	 * @return
	 */
	public TextureAtlasSprite getSprite() {
		return this.sprite;
	}

	/**
	 * Sets whether the UV coordinates should be switched (U -> V, V -> U)
	 * @return
	 */
	public QuadBuilder setSwitchUV(boolean switchUV) {
		this.switchUV = switchUV;
		return this;
	}

	/**
	 * Returns whether the UV coordinates are currently switched
	 * @return
	 */
	public boolean getSwitchUV() {
		return this.switchUV;
	}

	/**
	 * Adds a vertex with UV coordinates
	 * @param x
	 * @param y
	 * @param z
	 * @param u
	 * @param v
	 * @return
	 */
	public QuadBuilder addVertex(double x, double y, double z, float u, float v) {
		return this.addVertex(new Vec3d(x, y, z), u, v);
	}

	/**
	 * Adds a vertex
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public QuadBuilder addVertex(double x, double y, double z) {
		return this.addVertex(new Vec3d(x, y, z));
	}

	/**
	 * Adds a vertex with UV coordinates
	 * @param pos
	 * @param u
	 * @param v
	 * @return
	 */
	public QuadBuilder addVertex(Vec3d pos, float u, float v) {
		this.vertices.add(new Vertex(pos, u, v, this.sprite, this.switchUV, this.transformation, this.color, this.normal, this.blockLight, this.skyLight));
		return this;
	}

	/**
	 * Adds a vertex
	 * @param pos
	 * @return
	 */
	public QuadBuilder addVertex(Vec3d pos) {
		this.vertices.add(new Vertex(pos, 0.0F, 0.0F, this.sprite, this.switchUV, this.transformation, this.color, this.normal, this.blockLight, this.skyLight));
		return this;
	}

	/**
	 * Adds a vertex and infers the UV coordinates from the vertex index
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public QuadBuilder addVertexInferUV(double x, double y, double z) {
		return this.addVertexInferUV(new Vec3d(x, y, z));
	}

	/**
	 * Adds a vertex and infers the UV coordinates from the vertex index
	 * @param pos
	 * @return
	 */
	public QuadBuilder addVertexInferUV(Vec3d pos) {
		int relIndex = this.vertices.size() % 4;
		float u = 0.0F;
		float v = 0.0F;
		switch(relIndex) {
		default:
		case 0:
			break;
		case 1:
			v = 16.0F;
			break;
		case 2:
			u = 16.0F;
			v = 16.0F;
			break;
		case 3:
			u = 16.0F;
			break;
		}
		this.vertices.add(new Vertex(pos, u, v, this.sprite, this.switchUV, this.transformation, this.color, this.normal, this.blockLight, this.skyLight));
		return this;
	}

	/**
	 * Builds the quads.
	 * Specify a consumer to modify the quads
	 * @param quadConsumer
	 * @return
	 */
	public List<BakedQuad> build(@Nullable Consumer<UnpackedBakedQuad.Builder> quadConsumer) {
		List<BakedQuad> quads = new ArrayList<BakedQuad>(this.vertices.size() / 4);
		if(this.vertices.size() % 4 != 0)
			throw new RuntimeException("Invalid number of vertices");
		for(int i = 0; i < this.vertices.size(); i += 4) {
			Vertex vert1 = this.vertices.get(i);
			Vertex vert2 = this.vertices.get(i + 1);
			Vertex vert3 = this.vertices.get(i + 2);
			Vertex vert4 = this.vertices.get(i + 3);
			quads.add(this.createQuad(this.format, vert1, vert2, vert3, vert4, quadConsumer));
		}
		this.vertices.clear();
		return quads;
	}

	/**
	 * Builds the quads
	 * @return
	 */
	public List<BakedQuad> build() {
		return this.build(null);
	}

	private void putVertex(TRSRTransformation transformation, VertexFormat format, UnpackedBakedQuad.Builder builder, 
			Vec3d quadNormal, double x, double y, double z, float u, float v, @Nullable TextureAtlasSprite sprite, 
			boolean switchUV, float[] color, Vec3d vertexNormal, int blockLight, int skyLight) {
		for (int e = 0; e < format.getElementCount(); e++) {
			switch (format.getElement(e).getUsage()) {
			case POSITION:
				float[] positionData = new float[]{ (float) x, (float) y, (float) z, 1f };
				if(transformation != null && transformation != TRSRTransformation.identity()) {
					Vector4f vec = new Vector4f(positionData);
					transformation.getMatrix().transform(vec);
					vec.get(positionData);
				}
				builder.put(e, positionData);
				break;
			case COLOR:
				builder.put(e, color);
				break;
			case NORMAL:
				float[] normalData;
				if(vertexNormal != null) {
					normalData = new float[]{ (float) vertexNormal.x, (float) vertexNormal.y, (float) vertexNormal.z, 0f };
				} else {
					normalData = new float[]{ (float) -quadNormal.x, (float) -quadNormal.y, (float) -quadNormal.z, 0f };
				}
				if(transformation != null && transformation != TRSRTransformation.identity()) {
					Vector4f vec = new Vector4f(normalData);
					Matrix4f matrix = transformation.getMatrix();
					matrix.invert();
					matrix.transpose();
					matrix.transform(vec);
					vec.get(normalData);
				}
				float dx = normalData[0];
				float dy = normalData[1];
				float dz = normalData[2];
				float len = (float) Math.sqrt(dx*dx+dy*dy+dz*dz);
				normalData[0] = dx / len;
				normalData[1] = dy / len;
				normalData[2] = dz / len;
				normalData[3] = 0f;
				builder.put(e, normalData);
				break;
			case UV:
				if (format.getElement(e).getIndex() == 0) {
					if(sprite != null) {
						float pu = u;
						float pv = v;
						u = sprite.getInterpolatedU(switchUV ? pv : pu);
						v = sprite.getInterpolatedV(switchUV ? pu : pv);
					}
					builder.put(e, u, v, switchUV ? 1f : 0f, switchUV ? 0f : 1f);
					break;
				} else if (blockLight >= 0 && skyLight >= 0 && format.getElement(e).getIndex() == 1){
					builder.put(e, ((float)blockLight * 0x20) / 0xFFFF, ((float)skyLight * 0x20) / 0xFFFF);
					break;
				}
			default:
				builder.put(e);
				break;
			}
		}
	}

	private BakedQuad createQuad(VertexFormat format, Vertex vert1, Vertex vert2, Vertex vert3, Vertex vert4, @Nullable Consumer<UnpackedBakedQuad.Builder> quadConsumer) {
		Vec3d quadNormal = null;
		if(vert1.normal == null || vert2.normal == null || vert3.normal == null || vert4.normal == null)
			quadNormal = vert1.pos.subtract(vert2.pos).crossProduct(vert3.pos.subtract(vert2.pos));
		UnpackedBakedQuad.Builder builder = new UnpackedBakedQuad.Builder(format);
		builder.setTexture(vert1.sprite);
		putVertex(vert1.transformation, format, builder, quadNormal, vert1.pos.x, vert1.pos.y, vert1.pos.z, vert1.u, vert1.v, vert1.sprite, vert1.switchUV, vert1.color, vert1.normal, vert1.blockLight, vert1.skyLight);
		builder.setTexture(vert2.sprite);
		putVertex(vert2.transformation, format, builder, quadNormal, vert2.pos.x, vert2.pos.y, vert2.pos.z, vert2.u, vert2.v, vert2.sprite, vert2.switchUV, vert2.color, vert2.normal, vert2.blockLight, vert2.skyLight);
		builder.setTexture(vert3.sprite);
		putVertex(vert3.transformation, format, builder, quadNormal, vert3.pos.x, vert3.pos.y, vert3.pos.z, vert3.u, vert3.v, vert3.sprite, vert3.switchUV, vert3.color, vert3.normal, vert3.blockLight, vert3.skyLight);
		builder.setTexture(vert4.sprite);
		putVertex(vert4.transformation, format, builder, quadNormal, vert4.pos.x, vert4.pos.y, vert4.pos.z, vert4.u, vert4.v, vert4.sprite, vert4.switchUV, vert4.color, vert4.normal, vert4.blockLight, vert4.skyLight);
		if(quadConsumer != null)
			quadConsumer.accept(builder);
		return builder.build();
	}
}
