package br.com.dominio;

public class Fila {
	
	private String[] elementos;
	public void tamanho(Integer valor) {
		elementos = new String[valor];
	}
	public void enfileirar(String valor) {
		int ultimoElemento = 0;
		for (String elemento: elementos) {
			if (elemento != null) {
				ultimoElemento++;
			}
		}
		elementos[ultimoElemento] = valor;
	}
	public void desenfileirar() {
		int cont = 0;
		elementos[0] = null;
		String[] aux = new String[elementos.length];
		for (String elemento: elementos) {
			if (elemento != null) {
				aux[cont] = elemento;
				cont++;
			}
		}
		elementos = aux;
	}
	public void imprimir() {
		String fila = "[";
		for (int i = 0; i < elementos.length; i++) {
			String elemento = elementos[i];
			if (elemento != null) {
				fila += elemento;
				fila += ", ";
			}
		}
		if (fila.length() > 2)
			fila = fila.substring(0,fila.lastIndexOf(","));
		fila += "]";
		System.out.print(fila);
	}
}
