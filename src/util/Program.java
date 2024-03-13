package util;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bill bill = new Bill();
		
		System.out.println("Sexo: ");
		String input = sc.nextLine();
		bill.gender = input.charAt(0);
		System.out.println("Quantidade de cerverjas: ");
		bill.beer = sc.nextInt();
		System.out.println("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.println("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		System.out.println();

		System.out.println("Relatorio: ");
		System.out.println("Consumo: "+bill.feeding());	
		System.out.println("Ingresso: "+bill.ticket());
		System.out.println("Valor a pagar: R$"+bill.total());

		
		
		
		sc.close();
	}
}