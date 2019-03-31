import java.util.Scanner;

public class uzd3_4_mokestis_pagal_zonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		int getDuration =60;
		double getPrice; // mokestis uz stovejima(duration, zoneMin, zoneMinPrice);
		 // – mokamo laiko trukmė.
		int zoneMin; // – minimali stovėjimo trukmė.
		double zoneMinPrice; // – rinkliavos dydis.

		System.out.println("kokia stovejimo zona (1-M, 2-R, 3-G, 4-Z)");
		int zone = reader.nextInt();

		if (zone == 1) {
			getPrice = getDuration / 12 * 0.5;
			System.out.println("moketi " + getPrice + " eu");
		} else if (zone == 2) {
			getPrice = getDuration / 12 * 0.3;
			System.out.println("moketi " + getPrice + " eu");
		} else if (zone == 3) {
			getPrice = getDuration / 10 * 0.1;
			System.out.println("moketi " + getPrice + " eu");
		} else if (zone == 4) {
			getPrice = getDuration / 20 * 0.1;
			System.out.println("moketi " + getPrice + " eu");

		} else
			System.out.println("blogai ivedete zonos numeri");
		reader.close();
	}
}


