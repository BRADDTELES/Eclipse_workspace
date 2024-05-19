import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();// Clicar no inicio da linha >> Run >> Toggle Breakpoint (vai aparecer um Ponto azul no inicio desta linha)
/* Executar o Debug As >> Java Apliccation >> irá Perguntar se quer mudar para a Pespectiva Debug, Apertar 'Sim'
PARA COMEÇAR O DEBUG: Apertar 'Step Over'(na aba Run) >>>Sempre aperte 'Step Over', colocar o comando no console e aperte Enter + 'Step Over' + console + Enter e vice-versa
*/		
		int soma = 0;
		for (int i = 0; i < N; i++) { // for ( início ; condição ; incremento) { O Início Executa somente na primeira vez; A Condição Verdadeira: Executa o que está dentro das chaves e Volta. Falso: pula fora; No Incremento Executa toda vez depois de voltar, ou seja acrescentando mais um valor na letra i
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);

		sc.close();
	}

}
