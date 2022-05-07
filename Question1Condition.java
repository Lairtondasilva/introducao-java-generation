package atividade;

import java.util.Scanner;

public class Question1Condition {

	public static void main(String[]args) {
		Scanner reader = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Digite o primeiro valor: ");
		a = reader.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = reader.nextInt();
		System.out.println("Digite o terceiro valor: ");
		c = reader.nextInt();
		
		if(a>=b && a>c) {
			System.out.println("Maior valor: "+a);
		}
		else if(b>a && b>=c) {
			System.out.println("Maior valor: "+b);
		}
		else {
			System.out.println("Maior valor: "+c);
		}
	}
}
