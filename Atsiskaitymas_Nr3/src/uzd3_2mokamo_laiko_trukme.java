import java.util.Scanner;

public class uzd3_2mokamo_laiko_trukme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		int getDuration = 0;

		System.out.println("Kada pradėjo val:");
		int zoneStartTimeh = reader.nextInt();

		System.out.println("Kada pradėjo min:");
		int zoneStartTimemin = reader.nextInt();

		System.out.println("Kada baigė val:");
		int zoneEndTimeh = reader.nextInt();

		System.out.println("Kada baige min:");
		int zoneEndTimemin = reader.nextInt();

		int laikas = (zoneEndTimeh * 60 + zoneEndTimemin) - (zoneStartTimeh * 60 + zoneStartTimemin);
		System.out.println(laikas);

		getDuration = getDuration + laikas;

		System.out.println(" stovejimo laikas minutemis: " + getDuration);
	}
}
