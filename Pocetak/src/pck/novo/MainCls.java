package pck.novo;

public class MainCls {
	
	

	public static void main(String[] args) {
		
//		PrvaKlasa pk1 = new PrvaKlasa();
//		PrvaKlasa pk2 = new PrvaKlasa("Evo me");
//		PrvaKlasa pk3 = new PrvaKlasa(3, 5);
		Special sp1 = new Special();
		sp1.nekaPametnaMetoda("opis neceg", 100);
		sp1.drugaMetoda("Opis 2", 500);
		sp1.special();
		sp1.setDescription("Evo ga postavljen");
		sp1.setValue(125);
		sp1.special();
//		PrvaKlasa pk = pk1;
		
	}
}
