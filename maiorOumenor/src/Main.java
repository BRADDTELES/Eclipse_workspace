import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1, n2, n3, maior;
		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro numero: ");
		n3 = sc.nextInt();
		if (n1 > n2 && n1 > n3) {
			maior = n1;
			System.out.println("O Primeiro é o Maior: número "+maior);
		}else if(n2 > n1 && n2 > n3){
			maior = n2;
			System.out.println("O Segundo é o Maior: número "+maior);
		}else {
			maior = n3;
			System.out.println("O Terceiro é o Maior: número "+maior);
		}
		
		sc.close();
	}

}
