package Game;

public class EquipItem extends Item {
	
	private int mSlotidx = 0;
	private boolean mIsEqipped = false;
	
	public EquipItem(String name, int itemCode, long guid, int itemCount, int slotidx) {
		super(name, itemCode, guid, itemCount);
		mSlotidx = slotidx;
		mIsEqipped = false;
	}
	
	public void equip(boolean isEquipped) {
		mIsEqipped = isEquipped;
}
}