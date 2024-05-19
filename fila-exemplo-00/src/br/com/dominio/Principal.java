package br.com.dominio;

public class Principal {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.tamanho(10);
		
		fila.enfileirar("George");
		fila.enfileirar("não");
		fila.enfileirar("é");
		fila.desenfileirar();
		fila.enfileirar("legal");
		fila.desenfileirar();
		fila.desenfileirar();
		fila.enfileirar("Saul");
		fila.desenfileirar();
		fila.enfileirar("Saul");
		fila.enfileirar("não");
		fila.desenfileirar();
		fila.desenfileirar();
		fila.enfileirar("Saul");
		fila.enfileirar("é");
		fila.enfileirar("legal");
		fila.enfileirar("bonito");
		fila.enfileirar("elegante");
		fila.enfileirar("inteligente");
		fila.enfileirar("distinto");
		fila.desenfileirar();
				
		fila.imprimir();		
	}
}
