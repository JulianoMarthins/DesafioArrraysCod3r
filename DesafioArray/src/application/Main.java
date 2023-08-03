package application;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Numero de notas a serem lançadas para este aluno: ");
		int quantidade = sc.nextInt();
		sc.nextLine();

		double notas[] = new double[quantidade];

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota da %d° primeira nota do aluno:  ", i + 1);
			notas[i] = sc.nextDouble();
		}

		System.out.println("\nAs notas digitadas foram: \n" + Arrays.toString(notas));
		System.out.println();

		double soma = 0.0;

		for (double x : notas) {
			soma += x;
		}

		double media = soma / quantidade;

		if (media <= 10 && media >= 7) {
			System.out.printf("Parabéns, você tirou uma excelente nota: %.2f", media);
		} else if (media < 6.9 && media > 6) {
			System.out.printf("Parabéns, você foi aprovado: %.2f", media);
		} else if (media <= 5.9 && media >= 4) {
			System.out.printf("Atençao, você ficou em recuperação: %.2f", media);
		} else if (media <= 3.0 && media >= 0) {
			System.out.printf("Lamentamos, você foi reprovado: %.2f", media);
		} else {
			System.out.printf("Por favor, verifique a digitação das notas... \nO aluno ficou com média %.2f",
					media);
			System.out.printf( " sendo impossivel ficar abaixo de zero ou acima de dez.");

		}

		sc.close();
	}

}
