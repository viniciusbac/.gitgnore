import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double renda, imposto = 0;

		System.out.println("Digite sua renda: ");
		renda = sc.nextDouble();

		if (renda <= 2000) {
		} 
		else if (renda <= 3000.00) {
			imposto = (renda - 2000) * 0.08;
		} 
		else if (renda <= 4500.00) {
			imposto = (renda - 3000) * 0.18 + 1000 * 0.08;
		} 
		else if (renda > 4500) {
			imposto = (renda - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
			;
		}
		
		System.out.printf("R$ %.2f%n", imposto);

		sc.close();
	}

}
