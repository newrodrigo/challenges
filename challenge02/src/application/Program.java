package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double value = sc.nextDouble();

		int[] banknotes = { 100, 50, 20, 10, 5, 2 };
		int[] coins = { 100, 50, 25, 10, 5, 1 };

		System.out.println("NOTAS:");
		for (int i = 0; i < banknotes.length; i++) {
			int quantity = (int) (value / banknotes[i]);
			System.out.printf("%d nota(s) de R$ %.2f%n", quantity, (double) banknotes[i]);
			value %= banknotes[i];
		}

		int cents = (int) (value * 100);
		System.out.println("MOEDAS:");
		for (int i = 0; i < coins.length; i++) {
			int quantity = cents / coins[i];
			System.out.printf("%d moeda(s) de R$ %.2f%n", quantity, (double) coins[i] / 100);
			cents %= coins[i];
		}
		sc.close();
	}
}