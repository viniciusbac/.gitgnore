package application;

import java.util.Locale;
import java.util.Scanner;

import entities.aluno;

public class programAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		aluno x;
		x = new aluno();
		System.out.print("Nome do aluno: ");
		x.Name = sc.nextLine();
		System.out.println("Notas obtidas nos 3 trimestres: ");
		x.nota1 = sc.nextDouble();
		x.nota2 = sc.nextDouble();
		x.nota3 = sc.nextDouble();
		System.out.println("FINAL GRADE = " + x.notaFinal());
		
		if (x.notaFinal() > x.notaMedia() ) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.print("MISSING " + x.resto() + " POINTS");
		}
		
		sc.close();

	}

}
