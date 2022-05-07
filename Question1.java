package atividade;

import java.util.Scanner;

public class Question1 {

	public static void main (String[] args) {
		
		Scanner reader =new Scanner(System.in);
		
		System.out.println("Digite quantos anos você tem: ");
		int years = reader.nextInt();
		
		System.out.println("digite quantos meses já se passaram do seu último aniversário: ");
		int months = reader.nextInt();
		
		System.out.println("digite quantos dias já se passaram do dia da data do seu aniversário: ");
		int days = reader.nextInt();
		
		int daysOld = (years*365)+(months*30)+days;
		
		System.out.println("Você tem aproximadamente: "+daysOld+" dias de idade.");
	}
}
