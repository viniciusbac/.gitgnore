package entities;

public class aluno {
	public String Name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	
	public double notaFinal() {
		double notaFinal = nota1 + nota2 + nota3;
		return notaFinal;
	}
	public double notaMedia() {
		double notaMedia = 100 * 0.6;
		return notaMedia;
	}
		
	public double result() {
			double result = notaFinal() * 0.6;
			return result;
		}
	public double resto() {
		double resto = notaFinal() - notaMedia();
		return resto;
	}
	
	}
	

	
	

