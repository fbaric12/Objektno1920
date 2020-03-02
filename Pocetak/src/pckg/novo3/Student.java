package pckg.novo3;

public class Student {

	private String name;
	private int age;
	private int height;
	private String descOOP;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + ", descOOP=" + descOOP + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getDescOOP() {
		return descOOP;
	}

	public void setDescOOP(String descOOP) {
		this.descOOP = descOOP;
	}
	
	public void Sumiraj(double n1, double n2) {
		System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
	}
	
	
}
