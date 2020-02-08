package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class programClient {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char letra;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println();
		Client x = new Client(number, name);

		System.out.print("Is there na initial deposit (y/n)? ");
		letra = sc.next().charAt(0);
		System.out.println();
		if (letra == 'y' || letra == 'Y') {

			System.out.print("Enter initial deposit value: ");
			double valorInicial = sc.nextDouble();
			x.setValorInicial(valorInicial);
			System.out.println("Account data: ");
			System.out.printf(x.toString() + "%.2f%n", x.getValorInicial());
		} else if (letra == 'n' || letra == 'N') {
			System.out.println("Account data: ");
			System.out.println(x.toString() + "0");
		}
		System.out.println();

		System.out.print("Enter a deposit value: ");
		double Deposit = sc.nextDouble();
		x.addDeposit(Deposit);
		System.out.println("Updated account data: ");
		System.out.println(x.toString() + x.getValorInicial());
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		x.removeWithdraw(withdraw);
		System.out.printf(x.toString() + "%.2f%n", x.getValorInicial());

		sc.close();

	}

}
