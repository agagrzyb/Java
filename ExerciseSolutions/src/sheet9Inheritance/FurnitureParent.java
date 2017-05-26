package sheet9Inheritance;

public class FurnitureParent {
	//member variables
	private String colour;
	private String materialType;
	
	
	//constructors

	public FurnitureParent() {
	
	}
	public FurnitureParent(String colour, String materialType) {
		this.colour = colour;
		this.materialType = materialType;
	}
	
	
	//methods, setters & getters
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getMaterialType() {
		return materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}


	//toString
	@Override
	public String toString() {
		return "FurnitureParent :"	+ 
				"\nColour : " + colour + 
				"\nMaterialType : " + materialType ;
	}
}
