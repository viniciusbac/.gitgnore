package entities;

public class Converter {
	public double price;
	public double quantity;
	
	public double convercao() {
		return (price + (price * 0.06)) * quantity;
	}
	
}
