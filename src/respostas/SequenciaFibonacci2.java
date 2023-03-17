package respostas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenciaFibonacci2 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		try {
			System.out.print("Digite um número inteiro: ");
			int n = read.nextInt();
			read.close();

			int i = 0;
			int proximoValor = 0;

			List<Integer> lista = new ArrayList<>();
			lista.add(0);
			lista.add(1);

			for (i = 0; proximoValor <= n; i++) {
				proximoValor = lista.get(i) + lista.get(i + 1);
				lista.add(proximoValor);
			}

			if (lista.contains(n) == true) {
				System.out.println("\no número " + n + " pertence a sequência Fibonacci.");
			} else {
				System.out.println("\no número " + n + " não pertence a sequência Fibonacci.");
			}
		} catch (Exception e) {
			System.out.println("\nInforme um número inteiro.");
		}

		read.close();

	}

}

/*
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 
 * e o próximo valor sempre será a soma dos 2 valores anteriores 
 * (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
 * escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci 
 * e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
*/
