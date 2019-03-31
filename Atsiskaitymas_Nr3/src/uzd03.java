import java.util.Scanner;

public class uzd03 {

	public static int day(int day) {
		Scanner reader = new Scanner(System.in);

		System.out.println("iveskite savaites diena");
		day = reader.nextInt();
		switch (day) {
		case 1:
			System.out.println("Pirmadienis");
			break;

		case 2:
			System.out.println("Antradienis");
			break;

		case 3:
			System.out.println("Treciadienis");
			break;

		case 4:
			System.out.println("Ketvirtadienis");
			break;

		case 5:
			System.out.println("Penktadienis");
			break;

		case 6:
			System.out.println("Šeštadeinis");
			break;

		case 7:
			System.out.println("Sekamadienis");
			break;
		default:
			System.out.println("ivedimo klaida");
		}
		return day;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		double getPrice; // mokestis uz stovejima(duration, zoneMin, zoneMinPrice);
		// – mokamo laiko trukmė.
		int zoneMin; // – minimali stovėjimo trukmė.
		double zoneMinPrice; // – rinkliavos dydis.

		System.out.println("kokia stovejimo zona (1-M, 2-R, 3-G, 4-Z)");
		int zone = reader.nextInt();
		System.out.println("kokia savaites diena");
		int day = reader.nextInt();
		int zoneStartTimeh = 0;
		int zoneStartTimemin = 0;
		int zoneEndTimeh = 0;
		int zoneEndTimemin = 0;

		if (zone == 1 && day >= 1 && day <= 7) {
			getPrice = getDuration(zoneStartTimeh, zoneStartTimemin, zoneEndTimeh, zoneEndTimemin) / 12 * 0.5;
			System.out.println("moketi " + getPrice + " eu");
		} else if (zone == 2 && day >= 1 && day <= 6) {
			getPrice = getDuration(zoneStartTimeh, zoneStartTimemin, zoneEndTimeh, zoneEndTimemin) / 12 * 0.3;
			System.out.println("moketi " + getPrice + " eu");
		} else if (zone == 3 && day >= 1 && day <= 6) {
			getPrice = getDuration(zoneStartTimeh, zoneStartTimemin, zoneEndTimeh, zoneEndTimemin) / 10 * 0.1;
			System.out.println("moketi " + getPrice + " eu");
		} else if (zone == 4 && day >= 1 && day <= 6) {
			getPrice = getDuration(zoneStartTimeh, zoneStartTimemin, zoneEndTimeh, zoneEndTimemin) / 20 * 0.1;
			System.out.println("moketi " + getPrice + " eu");

		} else
			System.out.println("blogai ivedete zonos numeri arba savaites diena");
		reader.close();
	}

	public static int getDuration(int zoneStartTimeh, int zoneStartTimemin, int zoneEndTimeh, int zoneEndTimemin) {
		Scanner reader = new Scanner(System.in);

		int getDuration = 0;

		System.out.println("Kada pradėjo val:");
		zoneStartTimeh = reader.nextInt();

		System.out.println("Kada pradėjo min:");
		zoneStartTimemin = reader.nextInt();

		System.out.println("Kada baigė val:");
		zoneEndTimeh = reader.nextInt();

		System.out.println("Kada baige min:");
		zoneEndTimemin = reader.nextInt();

		int laikas = (zoneEndTimeh * 60 + zoneEndTimemin) - (zoneStartTimeh * 60 + zoneStartTimemin);
		System.out.println(laikas);

		getDuration = getDuration + laikas;

		System.out.println(" stovejimo laikas minutemis: " + getDuration);

		return getDuration;

	}
}
