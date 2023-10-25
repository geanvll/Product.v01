package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
	//Programa que ler dados de um produto, adiciona e remove quantidades destes produtos e mostram o estoque atualizado
		
		Locale.setDefault(Locale.US);
		Scanner t = new Scanner(System.in);
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String name = t.nextLine();
		System.out.print("Preço: ");
		double price = t.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantity = t.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		product.setName("Notebook");
		System.out.println("Dados atualizados: " + product.getName());
		
		product.setPrice(4200.00);
		System.out.println("Dados atualizados: " + product.getPrice());
		
		System.out.println();
		System.out.println("Dados do produto: " + product);
		
		System.out.println();
		System.out.print("Entre com o número de produtos adicionados ao estoque: ");
		quantity = t.nextInt();
		product.addProduct(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		
		System.out.println();
		System.out.print("Entre com o número de produtos removidos do estoque: ");
		quantity = t.nextInt();
		product.removeProduct(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		
		
	}

}
