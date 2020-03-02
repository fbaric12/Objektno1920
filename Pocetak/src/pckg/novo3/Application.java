package pckg.novo3;

public class Application {

	public static void main(String[] args) {
		
		Student s1 = new Student(22, "Špiro");
		Student s2 = new Student(23, "Petar");
		
		
//		System.out.println(s1.toString());
//		System.out.println(s2.toString());
		
		s1.setHeight(195);
		s1.setDescOOP("Nevalja");
		s2.setHeight(180);
		s2.setDescOOP("Isti vrag");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	
		s1.Sumiraj(23, 40);
	
	}
	
}
