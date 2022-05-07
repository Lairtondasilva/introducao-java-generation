package atividade;

import java.util.Scanner;

public class Question7 {
	public static void main (String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Digite o valor de 'a': ");
		a = reader.nextDouble();
		
		System.out.println("Digite o valor de 'b': ");
		b = reader.nextDouble();
		
		System.out.println("Digite o valor de 'c': ");
		c = reader.nextDouble();
		
		System.out.println("Digite o valor de 'd': ");
		d = reader.nextDouble();
		
		System.out.println("Digite o valor de 'e': ");
		e = reader.nextDouble();
		
		System.out.println("Digite o valor de 'f': ");
		f = reader.nextDouble();
		
		x = (c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		
		System.out.printf("O valor de x é: %.2f\n",x);
		System.out.printf("O valor de y é: %.2f",y);
		
		
	}
}
