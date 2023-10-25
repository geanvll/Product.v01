package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public Product() {
		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		double total = price * quantity;
		return total;
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "Produto: "
				+ name
				+ " / Valor: $"
				+ String.format("%.2f", price)
				+ " / Quantidade: "
				+ quantity
				+ " unidades / Total: $"
				+ String.format("%.2f", totalValueInStock());
	}

}
