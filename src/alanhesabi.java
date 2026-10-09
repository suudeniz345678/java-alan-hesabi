import java.util.Scanner;
public class alanhesabi {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double boyOlcusu = scanner.nextDouble();
double enOlcusu = scanner.nextDouble();
double area = boyOlcusu * enOlcusu;
double metreKareninFiyati = scanner.nextDouble();
double tumHalininFiyati = area * metreKareninFiyati;
System.out.println("Halının boyu=" + boyOlcusu);
System.out.println("Halının eni=" + enOlcusu);
System.out.println("Halının m\u00B2'si=" + area);
System.out.println("m\u00B2'nin fiyatı=" + metreKareninFiyati);
System.out.println("Halının ücreti=" + tumHalininFiyati);
	}

}
