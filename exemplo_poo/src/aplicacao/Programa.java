package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("Digite as informações do produto: ");
		
		System.out.println("Produto: ");
		produto.nome = teclado.next();
		
		System.out.println("Preço:");
		produto.preco = teclado.nextDouble();
		
		System.out.println("Quantidade em estoque: ");
		produto.quantidade = teclado.nextDouble();
		
		System.out.print("Confirmação: "+produto.nome+", preço atual é "
				+produto.preco+" e o estoque atual é: "
				+produto.quantidade+"\nO total em estoque é R$");
		System.out.printf("%.2f",produto.quantidade * produto.preco);
		
		// Adicionar Produtos
		System.out.println("\nDeseja acrescentar produtos ao estoque ?");
		int quantidade = teclado.nextInt();
		produto.addProduto(quantidade);
		
		System.out.print("Atualização após a inserção: "+produto.nome+", preço atual é "
				+produto.preco+" e o estoque atual é: "
				+produto.quantidade+"\nO total em estoque é R$");
		System.out.printf("%.2f",produto.quantidade * produto.preco);
		
		// Remover Produtos
		System.out.println("\nDeseja remover produtos ao estoque ?");
		quantidade = teclado.nextInt();
		produto.removeProduto(quantidade);
		
		System.out.print("Atualização após a remoção: "+produto.nome+", preço atual é "
				+produto.preco+" e o estoque atual é: "
				+produto.quantidade+"\nO total em estoque é R$");
		System.out.printf("%.2f",produto.quantidade * produto.preco);
		
		teclado.close();
	}

}
