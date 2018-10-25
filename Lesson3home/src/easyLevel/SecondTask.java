package easyLevel;

import java.util.Scanner;

public class SecondTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input apartment number and press Enter: ");
		int apartnum = sc.nextInt(); // квартира
		int floor; // этаж
		int entrance; // подъезд

		entrance = (apartnum - 1) / 36 + 1;

		if (entrance > 4) {
			System.out.println("Etrance not found!");
		} else {
			System.out.println("Entrance: " + entrance);
		}

		switch (entrance) {
		case 1:
			if (apartnum % 4 != 0) {
				floor = (apartnum / 4) + 1;
				System.out.println("Floor: " + floor);
			} else {
				floor = apartnum / 2 - (apartnum / 4);
				System.out.println("Floor: " + floor);
			}
			break;
		case 2:
			if (apartnum % 4 != 0) {
				floor = ((apartnum - 36) / 4) + 1;
				System.out.println("Floor: " + floor);
			} else {
				floor = (apartnum - 36) / 4;
				System.out.println("Floor: " + floor);
			}
			break;
		case 3:
			if (apartnum % 4 != 0) {
				floor = ((apartnum - 36 * 2) / 4) + 1;
				System.out.println("Floor: " + floor);
			} else {
				floor = (apartnum - 36 * 2) / 4;
				System.out.println("Floor: " + floor);
			}
			break;
		case 4:
			if (apartnum % 4 != 0) {
				floor = ((apartnum - 36 * 3) / 4) + 1;
				System.out.println("Floor: " + floor);
			} else {
				floor = (apartnum - 36 * 3) / 4;
				System.out.println("Floor: " + floor);
			}
			break;
		default:
			System.out.println("Floor not found!");

		}

	}

}
