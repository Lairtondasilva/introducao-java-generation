package atividade;

import java.util.Scanner;

public class Question1 {

	public static void main (String[] args) {
		
		Scanner reader =new Scanner(System.in);
		
		System.out.println("Digite quantos anos voc� tem: ");
		int years = reader.nextInt();
		
		System.out.println("digite quantos meses j� se passaram do seu �ltimo anivers�rio: ");
		int months = reader.nextInt();
		
		System.out.println("digite quantos dias j� se passaram do dia da data do seu anivers�rio: ");
		int days = reader.nextInt();
		
		int daysOld = (years*365)+(months*30)+days;
		
		System.out.println("Voc� tem aproximadamente: "+daysOld+" dias de idade.");
	}
}
