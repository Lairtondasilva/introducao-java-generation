package atividade;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		
		double x1,x2,y1,y2,distance;
		
		System.out.println("Digita a coordenada x do ponto 1: ");
		x1 = reader.nextDouble();
		System.out.println("Digita a coordenada y do ponto 1: ");
		y1 = reader.nextDouble();
		System.out.println("Digita a coordenada x do ponto 2: ");
		x2 = reader.nextDouble();
		System.out.println("Digita a coordenada y do ponto 2: ");
		y2 = reader.nextDouble();
		
		distance = Math.sqrt((Math.pow((x2-x1), 2)-Math.pow((y2-y1), 2)));
		
		System.out.printf("A distância entre os pontos é: %.2f",distance);
	}
}