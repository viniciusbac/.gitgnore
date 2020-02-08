package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class programQuartos {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		
		Quartos[] vect = new Quartos[10];
		
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			vect[room] = new Quartos(name, email);
		}
		
			System.out.println();
			System.out.println("Busy rooms:");
			
			for (int i=0; i<10; i++) {
				if (vect[i] != null) {
						System.out.println(i + ": " + vect[i]);
				}
			}
			
			
			
			sc.close();

	}

}
