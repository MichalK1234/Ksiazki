package zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	// PROGRAM WYKONANY W RAMACH SZKOLENIA KM-PROGRAMS
	// http://km-programs.pl/

	private static List<Book> booksList = new ArrayList<>();

	public static Book findMaxPrice(List<Book> booksList) {

		Collections.sort(booksList, (o1, o2) -> (o2.getNumberOfPages() - o1.getNumberOfPages()));
		System.out.print("Book whith the biggest number of pages: ");
		return booksList.get(0);
	}

	public static int priceRange(List<Book> booksList) {

		int counter = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Insert a: ");
		double a = Double.parseDouble(sc.nextLine());
		System.out.print("Insert b: ");
		double b = Double.parseDouble(sc.nextLine());

		for (Book k : booksList) {
			if (k.getPrice() >= a && k.getPrice() <= b) {
				counter++;
			}
		}

		sc.close();
		System.out.print("Amount of books which price is between <" + a + " , " + b + "> : ");
		return counter;

	}

	public static void main(String[] args) {

		Book k1 = new Book("Slowacki", "Mickiewicz", 341, 29.99);
		Book k2 = new Book("Stas", "Nel", 96, 45.99);
		Book k3 = new Book("Abecadlo", "Praca Zbiorowa", 50, 9.99);

		booksList.add(k1);
		booksList.add(k2);
		booksList.add(k3);

		System.out.println(findMaxPrice(booksList));
		System.out.println(priceRange(booksList));

	}

}
