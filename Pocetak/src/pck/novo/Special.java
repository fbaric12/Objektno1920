package pck.novo;

public class Special {
	
	private String description;
	private int value;
	
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	void nekaPametnaMetoda(String description, int value) {
		System.out.println(description);
		System.out.println(value);
		
	}
		
		
	public void drugaMetoda(String desc, int vl) {
		description = desc;
		value = vl;
		System.out.println("Description -> " + description);
		System.out.println("Value -> " + value);	
	}
	public void special() {
		System.out.println(description);
		System.out.println(value);
	}
}	
