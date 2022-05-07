package atividade;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int a,b,c,r,s,d;
		
		System.out.println("Digite o primeiro número inteiro e positivo:");
		a = reader.nextInt();
		
		System.out.println("Digite o segundo número inteiro e positivo: ");
		b = reader.nextInt();
		
		System.out.println("Digite o terceiro número inteiro e positivo: ");
		c = reader.nextInt();
		
		r = (int) Math.pow((a+b), 2);
		s = (int) Math.pow((b+c), 2);
		d = (r+s)/2;
		
		System.out.println("O resultado da expressão é :"+d);
		
	}
}
