package thebetweenlands.common.entity.projectiles;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thebetweenlands.common.registries.ItemRegistry;

public class EntitySapSpit extends EntityThrowable {
	public EntitySapSpit(World worldIn) {
		super(worldIn);
	}

	public EntitySapSpit(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleStatusUpdate(byte id) {
		if(id == 3) {
			for(int i = 0; i < 8; ++i) {
				this.world.spawnParticle(EnumParticleTypes.ITEM_CRACK, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D, Item.getIdFromItem(ItemRegistry.SAP_BALL));
			}
		}
	}

	@Override
	protected void onImpact(RayTraceResult result) {
		if(result.entityHit != this.thrower) {
			if(result.entityHit != null) {
				result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 3.0F);
			}

			if(!this.world.isRemote) {
				this.world.setEntityState(this, (byte)3);
				this.setDead();
			}
		}
	}
}
