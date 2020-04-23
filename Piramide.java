import java.util.*;

public class Piramide {
	int filas;
	
	public Piramide() {
	}
	
	public void obtieneFilas() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero de filas: ");
		filas = sc.nextInt();
		sc.close();
	}
	
	/*
	// NUEVA FORMA (PERO CASI MAL)
	public void formaPiramide() {
			obtieneFilas();
			int num2=0;
			for (int i = 0; i < filas; i++) {
				int num=0;
				while(num<=num2) {
					System.out.print("*");
					num++;
				}
				num2++;
				System.out.println();
			}
		}
	*/
	// FORMA SEGURA
	
	public void formaPiramide() {
		obtieneFilas();
		for (int i = 1; i <= filas; i++) {
			for (int j = 0; j <= filas-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i*2)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Piramide obj = new Piramide();
		obj.formaPiramide();
	}
}
