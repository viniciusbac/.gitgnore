package application;
import java.util.Locale;
import java.util.Scanner;

import entities.funcionario;

public class programaFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		funcionario x;
		x = new funcionario();
		System.out.print("name: ");
		x.Name = sc.nextLine();
		System.out.print("Gross Salary: ");
		x.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		x.Tax = sc.nextDouble();
		double SalarioLiquido =  x.NetSalary();
		System.out.println();
		System.out.printf("Funcionario: " + x.Name + ", $ " + "%.2f%n", SalarioLiquido);
		System.out.println();
		System.out.print("Digite a porcentagem a ser incrementada: ");
		x.porcentagem = sc.nextDouble();
		double porcentagem = x.increaseSalary();
		double salarioIncrease = porcentagem + SalarioLiquido;
		System.out.println();
		System.out.printf("Updated data: " + x.Name + ", $ " + "%.2f%n", salarioIncrease);
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}
