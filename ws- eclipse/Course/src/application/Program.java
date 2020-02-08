package application;

import java.util.Locale;
import java.util.Scanner;

import entities.retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		retangulo retan;
		retan = new retangulo();
		
		System.out.println("Digite a largura e altura do retangulo:");
		retan.largura = sc.nextDouble();
		retan.altura = sc.nextDouble();
		
		double area = retan.area();
		double perimetro = retan.perimetro();
		double diagonal = retan.diagonal();
		
		System.out.println("AREA = " + area);
		System.out.println("PERIMETRO = " + perimetro);
		System.out.println("DIAGONAL = " + diagonal);
		
		sc.close();
	}

}