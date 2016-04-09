package thebetweenlands.client.model.entity;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import thebetweenlands.client.model.AdvancedModelRenderer;
import thebetweenlands.client.model.MowzieModelBase;
import thebetweenlands.client.model.MowzieModelRenderer;
import thebetweenlands.entities.mobs.EntityGiantToad;

/**
 * Giant Toad.tcn - TechneToTabulaImporter Created using Tabula 5.1.0
 */
public class ModelGiantToad extends MowzieModelBase {
	private MowzieModelRenderer torso1;
	private MowzieModelRenderer torso2;
	private MowzieModelRenderer torso3;
	private MowzieModelRenderer wart1;
	private MowzieModelRenderer wart2;
	private MowzieModelRenderer wart3;
	private MowzieModelRenderer wart4;
	private MowzieModelRenderer wart6;
	private MowzieModelRenderer leftback1;
	private MowzieModelRenderer rightback1;
	private MowzieModelRenderer head1;
	private AdvancedModelRenderer blowbag;
	private MowzieModelRenderer wart5;
	private MowzieModelRenderer rightfront1;
	private MowzieModelRenderer leftfront1;
	private MowzieModelRenderer head2;
	private MowzieModelRenderer jaw;
	private MowzieModelRenderer eyeright;
	private MowzieModelRenderer eyeleft;
	private MowzieModelRenderer head3;
	private MowzieModelRenderer rightfront2;
	private MowzieModelRenderer fingerright1;
	private MowzieModelRenderer fingerright2;
	private MowzieModelRenderer fingerright3;
	private MowzieModelRenderer fingerright4;
	private MowzieModelRenderer leftfront2;
	private MowzieModelRenderer fingerleft1;
	private MowzieModelRenderer fingerleft2;
	private MowzieModelRenderer fingerleft3;
	private MowzieModelRenderer fingerleft4;
	private MowzieModelRenderer leftback3;
	private MowzieModelRenderer leftback2;
	private MowzieModelRenderer toeleft1;
	private MowzieModelRenderer toeleft2;
	private MowzieModelRenderer toeleft3;
	private MowzieModelRenderer toeleft4;
	private MowzieModelRenderer rightback3;
	private MowzieModelRenderer rightback2;
	private MowzieModelRenderer toeright1;
	private MowzieModelRenderer toeright2;
	private MowzieModelRenderer toeright3;
	private MowzieModelRenderer toeright4;

	public ModelGiantToad() {
		textureWidth = 256;
		textureHeight = 128;
		fingerright4 = new MowzieModelRenderer(this, 126, 49);
		fingerright4.setRotationPoint(-0.31379044166210157F, 8.8061654224323F, -0.7765218036083823F);
		fingerright4.addBox(-0.55F, -0.6654515650498887F, -2.0983721273696885F, 1, 1, 2, 0.0F);
		setRotateAngle(fingerright4, 0.7344449900106578F, 0.018017657933442677F, 0.49508593405566365F);
		toeright2 = new MowzieModelRenderer(this, 140, 102);
		toeright2.setRotationPoint(-1.12F, 0.0F, -10.37F);
		toeright2.addBox(-0.29F, -0.27F, -4.82F, 1, 1, 4, 0.0F);
		setRotateAngle(toeright2, 0.16615534478986016F, 0.18430676901060122F, -0.024260076602721177F);
		fingerleft2 = new MowzieModelRenderer(this, 105, 36);
		fingerleft2.setRotationPoint(-0.8040715405465768F, 8.357017687212181F, 0.11715089972271453F);
		fingerleft2.addBox(-0.30389959102152764F, -0.6046005723943783F, -4.606827024121399F, 1, 1, 4, 0.0F);
		setRotateAngle(fingerleft2, 0.7091565631947856F, 0.45820936019591596F, -0.27752041656293613F);
		head1 = new MowzieModelRenderer(this, 60, 0);
		head1.setRotationPoint(0.0F, -1.8648365551505552F, -7.600814734130431F);
		head1.addBox(-6.0F, -1.0F, -6.800000190734863F, 12, 6, 7, 0.0F);
		setRotateAngle(head1, 0.37176751648566314F, 0.0F, 0.0F);
		fingerright1 = new MowzieModelRenderer(this, 126, 30);
		fingerright1.setRotationPoint(0.8040715405465804F, 8.141289664371701F, 0.5682178794068156F);
		fingerright1.addBox(-0.67F, -0.5086127764703343F, -4.722404526684608F, 1, 1, 4, 0.0F);
		setRotateAngle(fingerright1, 0.8661799615262494F, -0.9036053236642796F, -0.07874763757483264F);
		fingerleft3 = new MowzieModelRenderer(this, 105, 43);
		fingerleft3.setRotationPoint(-0.8040715405465768F, 7.925561641531221F, 1.0192848590909174F);
		fingerleft3.addBox(-0.09220952730470877F, -0.6260526705077232F, -3.328972060474952F, 1, 1, 3, 0.0F);
		setRotateAngle(fingerleft3, 2.55159134010879F, 1.0263018024876738F, 1.8818065513350215F);
		wart2 = new MowzieModelRenderer(this, 13, 55);
		wart2.setRotationPoint(0.0F, -15.91414726631615F, 3.426356196603342F);
		wart2.addBox(0.0F, 0.0F, 9.0F, 2, 2, 2, 0.0F);
		setRotateAngle(wart2, -1.868900522911263F, -0.661456806360009F, 1.2780249415324643F);
		toeright4 = new MowzieModelRenderer(this, 140, 115);
		toeright4.setRotationPoint(0.77F, 0.26F, -9.64F);
		toeright4.addBox(-0.71F, -0.58F, -2.39F, 1, 1, 2, 0.0F);
		setRotateAngle(toeright4, 0.08342673824532895F, -1.0269517318734636F, 0.2162462943220974F);
		toeleft1 = new MowzieModelRenderer(this, 105, 94);
		toeleft1.setRotationPoint(0.363151972191341F, 0.16998736358929278F, -10.351411736633487F);
		toeleft1.addBox(-0.4498272675481868F, -0.8672771560607322F, -6.55111616578897F, 1, 1, 6, 0.0F);
		setRotateAngle(toeleft1, 0.16700116764937212F, 0.14745780766400934F, -0.019266282487987146F);
		leftback1 = new MowzieModelRenderer(this, 105, 60);
		leftback1.setRotationPoint(6.0F, 0.0F, 0.0F);
		leftback1.addBox(0.0F, -2.78F, -8.47F, 4, 7, 9, 0.0F);
		setRotateAngle(leftback1, -1.4774212118132F, -0.41085050591946515F, 0.1897172896917836F);
		fingerleft4 = new MowzieModelRenderer(this, 105, 49);
		fingerleft4.setRotationPoint(0.3137904416621051F, 8.806165422432304F, -0.7765218036083815F);
		fingerleft4.addBox(-0.45154335046827F, -0.6783392980839538F, -2.101958490983F, 1, 1, 2, 0.0F);
		setRotateAngle(fingerleft4, 0.7344449900106578F, -0.01801765793344278F, -0.4950859340556636F);
		rightfront1 = new MowzieModelRenderer(this, 126, 0);
		rightfront1.setRotationPoint(-6.0F, 0.8848323711609876F, -3.9009065196368957F);
		rightfront1.addBox(-2.2734975390540435F, -1.1571814462239514F, -3.276068745239699F, 3, 9, 7, 0.0F);
		setRotateAngle(rightfront1, 0.3569706700836078F, -0.08044083562866376F, 0.3633435826042925F);
		toeleft4 = new MowzieModelRenderer(this, 105, 115);
		toeleft4.setRotationPoint(-0.7729115599482164F, 0.26290408091881545F, -9.635013708590904F);
		toeleft4.addBox(-0.29F, -0.5777257825249443F, -2.3941860636848444F, 1, 1, 2, 0.0F);
		setRotateAngle(toeleft4, 0.08338752234656743F, 1.0269009849126767F, -0.2161523828535107F);
		wart3 = new MowzieModelRenderer(this, 22, 55);
		wart3.setRotationPoint(0.0F, -15.91414726631615F, 3.426356196603342F);
		wart3.addBox(2.0F, 1.0F, 10.0F, 3, 3, 3, 0.0F);
		setRotateAngle(wart3, -1.5629339485676794F, -0.5433285972544869F, 0.7595731655627334F);
		fingerleft1 = new MowzieModelRenderer(this, 105, 30);
		fingerleft1.setRotationPoint(-0.8040715405465768F, 8.141289664371701F, 0.5682178794068163F);
		fingerleft1.addBox(-0.3232679600291237F, -0.4949685484030818F, -4.743973544156542F, 1, 1, 4, 0.0F);
		setRotateAngle(fingerleft1, 0.8650463221935659F, 0.8955032875245438F, 0.09486485246225353F);
		toeleft2 = new MowzieModelRenderer(this, 105, 102);
		toeleft2.setRotationPoint(1.12F, -0.0F, -10.37F);
		toeleft2.addBox(-0.71F, -0.27F, -4.82F, 1, 1, 4, 0.0F);
		setRotateAngle(toeleft2, 0.16615534478986016F, -0.18430676901060122F, 0.024260076602721177F);
		jaw = new MowzieModelRenderer(this, 60, 29);
		jaw.setRotationPoint(0.0F, 5.4618331171067895F, -1.8989623727997489F);
		jaw.addBox(-5.5F, -0.7712831764167255F, -8.666211262568043F, 11, 2, 9, 0.0F);
		setRotateAngle(jaw, -0.2602285914723545F, 0.0F, 0.0F);
		toeright1 = new MowzieModelRenderer(this, 140, 94);
		toeright1.setRotationPoint(-0.36F, 0.17F, -10.35F);
		toeright1.addBox(-0.55F, -0.87F, -6.55F, 1, 1, 6, 0.0F);
		setRotateAngle(toeright1, 0.16702800941585733F, -0.14748032179352083F, 0.019198621771937624F);
		torso2 = new MowzieModelRenderer(this, 0, 26);
		torso2.setRotationPoint(0.0F, -14.397852788162519F, 0.8377559849984679F);
		torso2.addBox(-7.0F, -2.9256798897276703F, -7.663624278370741F, 14, 9, 7, 0.0F);
		setRotateAngle(torso2, -1.2639674442942934F, 0.0F, 0.0F);
		toeleft3 = new MowzieModelRenderer(this, 105, 109);
		toeleft3.setRotationPoint(-0.3739288631031581F, 0.1878153175668622F, -10.213956266394803F);
		toeleft3.addBox(-0.3187732768701985F, -0.8490541608595603F, -3.7224212709104147F, 1, 1, 3, 0.0F);
		setRotateAngle(toeleft3, 0.2535981964579903F, 0.5891992117656539F, -0.08679987773538123F);
		leftback3 = new MowzieModelRenderer(this, 105, 60);
		leftback3.setRotationPoint(2.0F, 1.65F, -7.0F);
		leftback3.addBox(-2.2F, -1.14F, -1.33F, 4, 4, 9, 0.0F);
		setRotateAngle(leftback3, -0.17749998492782332F, 0.0F, 0.0F);
		eyeleft = new MowzieModelRenderer(this, 69, 41);
		eyeleft.setRotationPoint(6.0F, -0.44F, -2.97F);
		eyeleft.addBox(-0.64F, -1.0F, -1.45F, 2, 3, 3, 0.0F);
		setRotateAngle(eyeleft, -0.06213372137099814F, 0.24870941840919195F, 0.19390607989657F);
		rightback3 = new MowzieModelRenderer(this, 140, 60);
		rightback3.setRotationPoint(-2.0F, 1.65F, -7.0F);
		rightback3.addBox(-1.8F, -1.14F, -1.33F, 4, 4, 9, 0.0F);
		setRotateAngle(rightback3, -0.17749998492782332F, 0.0F, 0.0F);
		wart1 = new MowzieModelRenderer(this, 0, 55);
		wart1.setRotationPoint(0.0F, -15.91414726631615F, 3.426356196603342F);
		wart1.addBox(0.0F, 0.0F, 5.0F, 3, 3, 3, 0.0F);
		setRotateAngle(wart1, -1.3385710545923228F, 0.3777492894402732F, -0.744251434820979F);
		wart4 = new MowzieModelRenderer(this, 35, 55);
		wart4.setRotationPoint(0.0F, -15.91414726631615F, 3.426356196603342F);
		wart4.addBox(-2.0F, -1.0F, 4.0F, 2, 2, 2, 0.0F);
		setRotateAngle(wart4, -1.4346331772667835F, -0.4520120937725302F, 1.144874260372176F);
		fingerright3 = new MowzieModelRenderer(this, 126, 43);
		fingerright3.setRotationPoint(0.8040715405465804F, 7.925561641531221F, 1.0192848590909165F);
		fingerright3.addBox(-0.8857103718407947F, -0.6432983333400368F, -3.321296914509203F, 1, 1, 3, 0.0F);
		setRotateAngle(fingerright3, 2.55159134010879F, -1.0263018024876738F, -1.881806551335022F);
		eyeright = new MowzieModelRenderer(this, 80, 41);
		eyeright.setRotationPoint(-6.0F, -0.44450064867962613F, -2.9668871183992493F);
		eyeright.addBox(-0.6427260658304494F, -1.0046911427088632F, -1.451806407804073F, 2, 3, 3, 0.0F);
		setRotateAngle(eyeright, -0.06218720544903793F, -0.24869898343622796F, -0.19387781076082392F);
		torso3 = new MowzieModelRenderer(this, 0, 43);
		torso3.setRotationPoint(0.0F, -15.914147266316151F, 3.426356196603341F);
		torso3.addBox(-7.5F, -3.799999952316284F, 13.5F, 15, 8, 3, 0.0F);
		setRotateAngle(torso3, -1.8565717431324602F, 0.0F, 0.0F);
		rightback2 = new MowzieModelRenderer(this, 140, 77);
		rightback2.setRotationPoint(0.0F, 0.39F, 6.47F);
		rightback2.addBox(-1.32F, -0.64F, -11.38F, 3, 3, 12, 0.0F);
		setRotateAngle(rightback2, 0.7285004297824331F, -0.0024434609527920616F, -0.31852258848896514F);
		leftfront2 = new MowzieModelRenderer(this, 105, 17);
		leftfront2.setRotationPoint(0.7953284049119762F, 6.0753679355679076F, -1.417380603183676F);
		leftfront2.addBox(-1.71F, 0.11572802284047948F, -1.3510669796841015F, 3, 9, 3, 0.0F);
		setRotateAngle(leftfront2, -0.5481572088161846F, 0.10827898550115952F, 0.8123639740633787F);
		wart6 = new MowzieModelRenderer(this, 53, 55);
		wart6.setRotationPoint(0.0F, -15.91414726631615F, 3.426356196603342F);
		wart6.addBox(-3.0F, 2.0F, 9.0F, 2, 2, 2, 0.0F);
		setRotateAngle(wart6, -1.362873468606727F, 0.16675468550564912F, -0.2914590652016741F);
		leftfront1 = new MowzieModelRenderer(this, 105, 0);
		leftfront1.setRotationPoint(6.0F, 0.88F, -3.9F);
		leftfront1.addBox(-0.73F, -1.16F, -3.28F, 3, 9, 7, 0.0F);
		setRotateAngle(leftfront1, 0.3569198320328404F, 0.0804596785169386F, -0.3633775502652194F);
		rightback1 = new MowzieModelRenderer(this, 140, 60);
		rightback1.setRotationPoint(-6.0F, 0.0F, 0.0F);
		rightback1.addBox(-4.0F, -2.78F, -8.47F, 4, 7, 9, 0.0F);
		setRotateAngle(rightback1, -1.4774212118132F, 0.41085050591946515F, -0.1897172896917836F);
		toeright3 = new MowzieModelRenderer(this, 140, 109);
		toeright3.setRotationPoint(0.37F, 0.19F, -10.21F);
		toeright3.addBox(-0.68F, -0.85F, -3.72F, 1, 1, 3, 0.0F);
		setRotateAngle(toeright3, 0.25359634031477607F, -0.5892231554732855F, 0.08674286382411818F);
		blowbag = new AdvancedModelRenderer(this, 60, 41);
		blowbag.setRotationPoint(0.0F, 0.13081383404200864F, -5.097341242336366F);
		blowbag.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
		setRotateAngle(blowbag, 0.587303293296092F, 0.0F, 0.0F);
		head3 = new MowzieModelRenderer(this, 60, 23);
		head3.setRotationPoint(0.0F, 0.0F, 0.0F);
		head3.addBox(-5.5F, -5.690000057220459F, -10.600000381469727F, 11, 3, 2, 0.01F);
		setRotateAngle(head3, 0.2602502703666687F, 0.0F, 0.0F);
		rightfront2 = new MowzieModelRenderer(this, 126, 17);
		rightfront2.setRotationPoint(-0.7971919151552658F, 6.071401102223955F, -1.4151232124182087F);
		rightfront2.addBox(-1.2798076802332874F, 0.10308023548254841F, -1.3546180554845817F, 3, 9, 3, 0.0F);
		setRotateAngle(rightfront2, -0.5481862395053009F, -0.10831791365576936F, -0.8123225285730391F);
		torso1 = new MowzieModelRenderer(this, 0, 0);
		torso1.setRotationPoint(0.0F, 19.0F, 12.0F);
		torso1.addBox(-8.0F, -15.900862985435756F, -7.594266525596751F, 16, 14, 11, 0.0F);
		setRotateAngle(torso1, 1.040914365889418F, -0.0F, 0.0F);
		head2 = new MowzieModelRenderer(this, 60, 14);
		head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		head2.addBox(-5.5F, -3.299999952316284F, -9.800000190734863F, 11, 4, 4, 0.02F);
		setRotateAngle(head2, 0.37178610265254974F, 0.0F, 0.0F);
		leftback2 = new MowzieModelRenderer(this, 105, 77);
		leftback2.setRotationPoint(-0.0F, 0.39F, 6.47F);
		leftback2.addBox(-1.32F, -0.64F, -11.38F, 3, 3, 12, 0.0F);
		setRotateAngle(leftback2, 0.7285004297824331F, 0.0024434609527920616F, 0.31852258848896514F);
		wart5 = new MowzieModelRenderer(this, 44, 55);
		wart5.setRotationPoint(0.0F, -2.925679889727671F, -0.6636242783707436F);
		wart5.addBox(4.0F, -3.0F, -2.0F, 2, 2, 2, 0.0F);
		setRotateAngle(wart5, 0.413152072959955F, 0.44296408096345513F, 0.4558410715725386F);
		fingerright2 = new MowzieModelRenderer(this, 126, 36);
		fingerright2.setRotationPoint(0.8040715405465804F, 8.357017687212181F, 0.11715089972271375F);
		fingerright2.addBox(-0.7019497955107638F, -0.6076997138028108F, -4.6015864879393F, 1, 1, 4, 0.0F);
		setRotateAngle(fingerright2, 0.7091565631947856F, -0.458209360195916F, 0.27752041656293625F);
		rightfront2.addChild(fingerright4);
		rightback2.addChild(toeright2);
		leftfront2.addChild(fingerleft2);
		torso2.addChild(head1);
		rightfront2.addChild(fingerright1);
		leftfront2.addChild(fingerleft3);
		torso1.addChild(wart2);
		rightback2.addChild(toeright4);
		leftback2.addChild(toeleft1);
		torso1.addChild(leftback1);
		leftfront2.addChild(fingerleft4);
		torso2.addChild(rightfront1);
		leftback2.addChild(toeleft4);
		torso1.addChild(wart3);
		leftfront2.addChild(fingerleft1);
		leftback2.addChild(toeleft2);
		head1.addChild(jaw);
		rightback2.addChild(toeright1);
		torso1.addChild(torso2);
		leftback2.addChild(toeleft3);
		leftback1.addChild(leftback3);
		head1.addChild(eyeleft);
		rightback1.addChild(rightback3);
		torso1.addChild(wart1);
		torso1.addChild(wart4);
		rightfront2.addChild(fingerright3);
		head1.addChild(eyeright);
		torso1.addChild(torso3);
		rightback3.addChild(rightback2);
		leftfront1.addChild(leftfront2);
		torso1.addChild(wart6);
		torso2.addChild(leftfront1);
		torso1.addChild(rightback1);
		rightback2.addChild(toeright3);
		torso2.addChild(blowbag);
		head2.addChild(head3);
		rightfront1.addChild(rightfront2);
		head1.addChild(head2);
		leftback3.addChild(leftback2);
		torso2.addChild(wart5);
		rightfront2.addChild(fingerright2);
		parts = new MowzieModelRenderer[] { torso1, torso2, torso3, wart1, wart2, wart3, wart4, wart6, leftback1, rightback1, head1, blowbag, wart5, rightfront1, leftfront1, head2, jaw, eyeright, eyeleft, head3, rightfront2, fingerright1, fingerright2, fingerright3, fingerright4, leftfront2, fingerleft1, fingerleft2, fingerleft3, fingerleft4, leftback3, leftback2, toeleft1, toeleft2, toeleft3, toeleft4, rightback3, rightback2, toeright1, toeright2, toeright3, toeright4 };
		setInitPose();
	}

	public void setRotateAngle(ModelRenderer modelRenderer, float rotateAngleX, float rotateAngleY, float rotateAngleZ) {
		modelRenderer.rotateAngleX = rotateAngleX;
		modelRenderer.rotateAngleY = rotateAngleY;
		modelRenderer.rotateAngleZ = rotateAngleZ;
	}

	@Override
	public void render(Entity entity, float ticksExisted, float swing, float speed, float yaw, float pitch, float scale) {
		GL11.glScalef(1.3f, 1.3f, 1.3f);
		GL11.glTranslatef(0f, -0.4f, 0f);
		torso1.render(scale);
	}

	@Override
	public void setLivingAnimations(EntityLivingBase entity, float yaw, float pitch, float partialRenderTicks) {
		EntityGiantToad toad = (EntityGiantToad) entity;
		setToInitPose();
		float frame = toad.ticksExisted + partialRenderTicks;
		float leapingProgress = toad.getLeapProgress(partialRenderTicks);
		float swimProgress = toad.getSwimProgress(partialRenderTicks);

		float bagScale = (1 + 3.5F * (MathHelper.sin(0.12F * frame - MathHelper.cos(0.12F * frame)) + 1) / 2);
		blowbag.setScale(bagScale);

		if(entity.isInWater()) {
			torso1.rotateAngleX += 0.4;
			torso2.rotateAngleX -= 0.3;
			head1.rotateAngleX += -0.1;
			
			leftback1.rotateAngleX += 0.4;
			rightback1.rotateAngleX += 0.4;
			
			leftfront1.rotateAngleX -= 0.5;
			rightfront1.rotateAngleX -= 0.5;
			leftfront2.rotateAngleY -= 0.4;
			rightfront2.rotateAngleY += 0.4;
		}
		
		//Swimming
		torso1.rotateAngleX += 0.3 * swimProgress;
		torso2.rotateAngleX -= 0.2 * swimProgress;
		
		leftback1.rotateAngleY += -0.8F * swimProgress;
		rightback1.rotateAngleY += 0.8F * swimProgress;
		leftback1.rotateAngleX += 2.1 * swimProgress;
		rightback1.rotateAngleX += 2.1 * swimProgress;
		leftback1.rotateAngleZ -= 0.2 * swimProgress;
		rightback1.rotateAngleZ += 0.2 * swimProgress;
		leftback3.rotateAngleX -= 2 * swimProgress;
		rightback3.rotateAngleX -= 2 * swimProgress;
		leftback2.rotateAngleX += 2 * swimProgress;
		rightback2.rotateAngleX += 2 * swimProgress;

		leftfront1.rotateAngleX += 0.8*2 * swimProgress;
		leftfront1.rotateAngleZ -= 0.4*2 * swimProgress;
		leftfront2.rotateAngleY -= 1.8*2 * swimProgress;
		rightfront1.rotateAngleX += 0.8*2 * swimProgress;
		rightfront1.rotateAngleZ += 0.4*2 * swimProgress;
		rightfront2.rotateAngleY += 1.8*2 * swimProgress;


		//Jumping
		torso1.rotateAngleX += 0.3 * leapingProgress;
		torso2.rotateAngleX -= 0.2 * leapingProgress;

		leftback1.rotateAngleX += 2.3 * leapingProgress;
		rightback1.rotateAngleX += 2.3 * leapingProgress;
		leftback1.rotateAngleZ -= 0.2 * leapingProgress;
		rightback1.rotateAngleZ += 0.2 * leapingProgress;
		leftback3.rotateAngleX -= 2 * leapingProgress;
		rightback3.rotateAngleX -= 2 * leapingProgress;
		leftback2.rotateAngleX += 2 * leapingProgress;
		rightback2.rotateAngleX += 2 * leapingProgress;

		leftfront1.rotateAngleX -= 0.8 * leapingProgress;
		rightfront1.rotateAngleX -= 0.8 * leapingProgress;
		leftfront2.rotateAngleZ -= 0.8 * leapingProgress;
		rightfront2.rotateAngleZ += 0.8 * leapingProgress;
	}
}
