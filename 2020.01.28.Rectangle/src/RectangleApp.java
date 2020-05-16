import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleApp {
	static int secim = 0;
	static Rectangle rect;
	static boolean dongu = true;
	private static double width;
	private static double height;

	public static void main(String[] args) {
		while (dongu) {
			try {
				menu();
			} catch (MenuException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static void menu() throws MenuException {
		Scanner komut = new Scanner(System.in);
		System.out.println("1-Parametrik Constructor");
		System.out.println("2-Parametresiz Constructor");
		System.out.println("3-Çýkýþ");
		System.out.print("Seçim yapýnýz: ");
		try {
			secim = komut.nextInt();
		} catch (InputMismatchException e) {

			throw new MenuException();
		}
		int islem = 0;

		if (secim == 1) {
			Scanner komut1 = new Scanner(System.in);
			Rectangle rect = new Rectangle();
			double width = 0;
			double height = 0;
			try {
				System.out.print("En giriniz: ");
				width = komut1.nextDouble();
				System.out.print("Boy giriniz: ");
				height = komut1.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Geçersiz girdi.");
			}
			if (width < 0)
				rect.setWidth(0);
			else
				rect.setWidth(width);
			if (height < 0)
				rect.setHeight(0);
			else
				rect.setHeight(height);

			System.out.println("Dikdörtgenin alaný: " + rect.getArea());
			System.out.println("Dikdörtgenin çevresi: " + rect.getCircumference());
		}

		else if (secim == 2) {
			Scanner komut1 = new Scanner(System.in);
			Rectangle rect = new Rectangle();
			System.out.print("En giriniz: ");
			try {
				rect.setWidth(komut1.nextDouble());
				System.out.print("Boy giriniz: ");
				rect.setHeight(komut1.nextDouble());
			} catch (InputMismatchException e) {
				System.out.println("Geçersiz girdi.");
			}

			System.out.println("Alan: " + rect.getArea());
			System.out.println("Çevre: " + rect.getCircumference());
		}

		else if (secim == 3) {
			Scanner komut1 = new Scanner(System.in);
			System.out.println("Güle güle...");
			dongu = false;
		} else
			throw new MenuException();
	}
}