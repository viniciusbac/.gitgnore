package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Converter;

public class programCcaulculator {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Converter dolar;
		dolar = new Converter();
		System.out.print("Qual o preço do dolar? ");
		dolar.price = sc.nextDouble();
		System.out.print("Qual o valor a ser comprado? ");
		dolar.quantity = sc.nextDouble();
		
		System.out.printf("Valor em reais a pagar é = %.2f%n", dolar.convercao());
		
		
		
		
		sc.close();
	}

}
