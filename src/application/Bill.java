package application;

import java.util.Locale;
import java.util.Scanner;

import util.bill;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		bill bill = new bill();
		System.out.print("Sexo: ");
		bill.gender = sc.nextLine();
		
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.printf("RELATÓRIO: ");
		System.out.println();
		System.out.printf("Consumo = %.2f%n", bill.feeding);
		System.out.println();
		System.out.printf("Cuvert = %.2f%n", bill.Couvert);
		System.out.println();
		System.out.printf("INgresso = %.2f%n", bill.ticket);
		System.out.println();
		System.out.printf("Valor a Pagar = %.2f%n", bill.total);
		
		
		
		sc.close();
	}

}
