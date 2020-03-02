package pck.novo;

import java.util.Scanner;

public class PrvaKlasa {
	
	Scanner sc = new Scanner(System.in);
	
	public PrvaKlasa() {
		System.out.println("Prvi konstruktor!");
	}

	public PrvaKlasa(String name) {
		System.out.println("Drugi konstruktor! -> " + name);
	}
		
	public PrvaKlasa(int n1, int n2) {
		System.out.println("Unijeli ste dva parametra za konstruktor " + n1 + " i " + n2);
	
	}
	
}	
	




