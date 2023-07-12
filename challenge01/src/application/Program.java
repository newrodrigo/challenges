package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> pairs = new ArrayList<>();
		List<Integer> odds = new ArrayList<>();

		int n = sc.nextInt();

		if (n >=1 && n <= 105) {
			for (int i = 1; i <= n; i++) {
				int number = sc.nextInt();

				if (number % 2 == 0) {
					pairs.add(number);
				} else {
					odds.add(number);
				}
			}

			Collections.sort(pairs);
			Collections.sort(odds, Comparator.reverseOrder());

			System.out.println();
			for (int pair : pairs) {
				System.out.println(pair);
			}
			for (int odd : odds) {
				System.out.println(odd);
			}
		} else {
			System.out.println("Erro: N precisa ser positivo e menor que 105");
		}
		sc.close();
	}
}