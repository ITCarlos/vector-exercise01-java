package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many persons? ");
		int n = input.nextInt();
		Person[] vect = new Person[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println((i+1) + "# person:");
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Age: ");
			int age = input.nextInt();
			System.out.print("Height: ");
			double height = input.nextDouble();
			vect[i] = new Person(name, age, height);
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i].getHeight();
		}
		
		double averageHeight = sum / n;
		System.out.println("\nAverage height: " + String.format("%.2f", averageHeight));
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (vect[i].getAge() < 16) {
				count += 1;
			}
		}
		
		double percentage = 100.0 * count / n;
		System.out.print("Persons under 16 years old: " + String.format("%.2f", percentage) + "%");
		
		for (int i = 0; i < n; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println("\n" + vect[i].getName());
			}
		}
		
		input.close();

	}

}
