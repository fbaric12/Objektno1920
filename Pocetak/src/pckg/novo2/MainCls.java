package pckg.novo2;

public class MainCls {
	
	public static void main(String[] args) {
		Shape sh = new Shape();
		Triangle tr = new Triangle();
		Pravokutnik rt = new Pravokutnik();
		
		sh.rotate();
		sh.playSound();
		tr.rotate();
		tr.playSound();	
		rt.rotate();
		rt.playSound();
		
	}
	
	
}
