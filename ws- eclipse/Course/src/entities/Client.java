package entities;

public class Client {

	
	private int number;
	private String name;
	private double valorInicial;
	
	
	
		public Client(int number, String name, double valorInicial) {
		this.number = number;
		this.name = name;
		this.valorInicial = valorInicial;
	}
		
		
		public Client(int number, String name) {
			this.number = number;
			this.name = name;
		}



		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}



		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}

	
		
		public double getValorInicial() {
			return valorInicial;
		}
		public void setValorInicial(double valorInicial) {
			this.valorInicial = valorInicial;
		}


		
		public void addDeposit(double Deposit) {
			this.valorInicial += Deposit;
		}
		
		
		public void removeWithdraw(double withdraw) {
			this.valorInicial = valorInicial - 5.00 - withdraw;
		}


		public String toString() {
		return "Account " 
			+ number
			+ ", "
			+ "Holder: " 
			+ name + ", " 
			+ "Balance: $ ";
	}

}

