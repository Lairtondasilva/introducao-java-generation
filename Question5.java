package atividade;

import java.util.Scanner;

public class Question5 {
	public static void main (String[] args) {
		
		Scanner reader = new Scanner (System.in);
		double n1,n2,n3,media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = reader.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		n2 = reader.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		n3 = reader.nextDouble();
		
		media = (n1*2+n2*3+n3*5)/10;
		
		System.out.println("\n****Média do Aluno****\n");
		System.out.printf("media final: %.1f",media);
	}
}
