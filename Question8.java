package atividade;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int factoryCost;
		double distributorPercentage, tax;

		System.out.println("Digite o custo de fábrica do carro: ");
		factoryCost = reader.nextInt();

		distributorPercentage = (factoryCost * 0.28);
		tax = (factoryCost * 0.45);

		System.out.printf("O valor do carro ao consumidor é de: %.2f", factoryCost + distributorPercentage + tax," Reais");
	}
}
