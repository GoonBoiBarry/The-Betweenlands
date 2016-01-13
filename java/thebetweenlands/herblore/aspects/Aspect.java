package thebetweenlands.herblore.aspects;

import net.minecraft.nbt.NBTTagCompound;

public class Aspect implements Comparable<Aspect> {
	public final IAspectType aspect;
	public final float amount;

	public Aspect(IAspectType aspect, float amount) {
		if(aspect == null) throw new RuntimeException("Aspect can't be null");
		this.aspect = aspect;
		this.amount = amount;
	}

	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		nbt.setString("aspect", this.aspect.getName());
		nbt.setFloat("amount", this.amount);
		return nbt;
	}

	public static Aspect readFromNBT(NBTTagCompound nbt) {
		String aspectName = nbt.getString("aspect");
		float amount = nbt.getFloat("amount");
		IAspectType aspectType = AspectManager.getAspectTypeFromName(aspectName);
		if(aspectType != null) {
			return new Aspect(aspectType, amount);
		}
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(this.amount);
		result = prime * result + ((this.aspect == null) ? 0 : this.aspect.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aspect other = (Aspect) obj;
		if (Float.floatToIntBits(this.amount) != Float.floatToIntBits(other.amount))
			return false;
		if (this.aspect == null) {
			if (other.aspect != null)
				return false;
		} else if (!this.aspect.equals(other.aspect))
			return false;
		return true;
	}

	@Override
	public int compareTo(Aspect other) {
		return this.hashCode() - other.hashCode();
	}
}
