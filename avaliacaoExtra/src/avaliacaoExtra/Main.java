package avaliacaoExtra;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        String [] palavra = new String[10];
        System.out.println("Digite 10 Strings: ");
        for (int i = 0; i < palavra.length; i++) {           
            palavra[i] = scanner.nextLine();
        }
        Collections.sort(Arrays.asList(palavra));
        
        System.out.print("Vetor ordenado de String em ordem:\n");
        System.out.println(Arrays.toString(palavra));
        
        scanner.close();
    }
}