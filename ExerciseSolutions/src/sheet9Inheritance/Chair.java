package sheet9Inheritance;

public class Chair  extends FurnitureParent{
	//member variables
	private boolean hasGasLift;
	private String type;	
	//constructors	
	public Chair() {
	}
	public Chair(String colour, String materialType, String type, boolean hasGasLift) {
		super(colour, materialType);
		this.type = type;
		setHasGasLift(hasGasLift);
	}
	//methods, setters & getters
	public boolean isHasGasLift() {
		return hasGasLift;
	}
	public void setHasGasLift(boolean hasGasLift) {
		this.hasGasLift = hasGasLift;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	//toString
	@Override
	public String toString() {
		return super.toString() +
				"\nHas GasLift : " + hasGasLift + 
				"\ntype : " + type;
	}
}
