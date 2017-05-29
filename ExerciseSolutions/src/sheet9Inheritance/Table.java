package sheet9Inheritance;

public class Table extends FurnitureParent{
	//member variables
	private boolean isExpandable;
	private String shape;	
	//static / class variables
	public static final boolean IS_EXPANDABLE = true;
	public static final boolean IS_NOT_EXPANDABLE = false;
	//constructors
	public Table(){
	}
	public Table(String colour, String materialType, String shape, boolean isExpandable ){
		super(colour,materialType);
		this.shape = shape;
		setExpandable(isExpandable);
	}
	//methods, setters & getters
	public boolean isExpandable() {
		return isExpandable;
	}
	public void setExpandable(boolean isExpandable) {
		this.isExpandable = isExpandable;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	//toString
	@Override
	public String toString() {
		return super.toString() +
				"\nTable shape : " + shape +
				"\nisExpandable : " + isExpandable;
	}
}
