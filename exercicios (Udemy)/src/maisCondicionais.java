import java.util.Scanner;
import java.util.Locale;
public class maisCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite: ");
		int minutos = sc.nextInt();
		double conta = 50.0;
		if (minutos > 100) {
			conta = conta + (minutos - 100) * 2.0;
		}
		System.out.printf("Valor da conta = R$ %.2f %n", conta);
		sc.close();
	}

}
