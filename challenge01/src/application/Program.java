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

		for (int pair : pairs) {
			System.out.println(pair);
		}
		for (int odd : odds) {
			System.out.println(odd);
		}
		sc.close();
	}
}