package sheet9Inheritance;

public class Bed  extends FurnitureParent{
	//member variables
	private String size;
	//private boolean hasHeadbord || ENUMS : private Headbord hasHeadbord;public enum Headbord {YES, NO};
	
	private Headbord hasHeadbord;	
	public enum Headbord {YES, NO};
	//constructors
	public Bed() {
	}
	public Bed(String colour, String materialType, String size, Headbord hasHeadbord) {
		super(colour, materialType);
		this.size = size;
		setHeadbord(hasHeadbord);
	}
	//methods, setters & getters
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Headbord getHeadbord() {
		return hasHeadbord;
	}
	public void setHeadbord(Headbord hasHeadbord) {
		this.hasHeadbord = hasHeadbord;
	}
	//toString
	@Override
	public String toString() {
		return super.toString() +
					"\nBed size : " + size + 
					"\nHas Headbord : " + hasHeadbord ;
	}
}
