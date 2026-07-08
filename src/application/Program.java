package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {
	
	public void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		Rent[] rent = new Rent[10];
		
		for(int i=0; i<n; i++) {
			int x = i+1;
			System.out.println("Rent #" + x + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rent[room] = new Rent(name, email);
			sc.nextLine();
			System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		
		for(int i=0; i<10; i++) {
			if (rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}
		
		sc.close();
	}

}
