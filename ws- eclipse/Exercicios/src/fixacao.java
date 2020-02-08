import java.util.Locale;
import java.util.Scanner;

public class fixacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, i, x, y, z;
		
		System.out.println("Digite um numero: ");
		n = sc.nextInt();
		
		for (i=1; i<=n; i++) {
			x = i;
			y = i * i;
			z = i * i * i;
			
			System.out.printf("%d %d %d%n", x, y, z);
			
			}
		
		sc.close();
	}
}
