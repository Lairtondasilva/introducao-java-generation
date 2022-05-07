package atividade;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		int years,months,days,daysOld;
		
		System.out.println("Digite quantos dias de idade você tem:");
		daysOld = reader.nextInt();
		
		years = (int) daysOld/365;
		months = (int)(daysOld%365)/30;
		days = (int)(daysOld%365)%30;
		
		System.out.println("*******Sua Idade********\n");
		System.out.println("Anos: "+years);
		System.out.println("Meses: "+months);
		System.out.println("Dias: "+days);
	}

}
