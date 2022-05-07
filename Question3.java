package atividade;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		int secondsEvent, hours, minutes, seconds;
		
		System.out.println("Quantos segundos o evento da fábrica durou: ");
		secondsEvent = reader.nextInt();
		
		hours = (int) secondsEvent/60/60;
		minutes = (int) (secondsEvent/60)%60;
		seconds = (int) (secondsEvent%60)%60;
		
		System.out.println("Tempo do evento: ");
		System.out.println("Horas: "+hours);
		System.out.println("minutos: "+minutes);
		System.out.println("segundos: "+seconds);
		
		

	}

}
