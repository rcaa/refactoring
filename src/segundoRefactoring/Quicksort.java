package segundoRefactoring;

import java.io.IOException;

public class Quicksort {

	public static void main(String[] args) throws IOException {
		int quantidade = 10000;
		int[] vetor = new int[quantidade];

		vetor = preencherTextoVetorAleatorio(vetor);

		textVetor(vetor, "Vetor desordenado: ");
		quickSort(vetor, 0, vetor.length - 1);
		textVetor(vetor, "Vetor ordenado: ");

	}

	private static int[] preencherTextoVetorAleatorio(int[] vetor) {
		return null;
	}

	private static void textVetor(int[] vetor, String string) {
	}

	private static int[] preencherTextoVetorAleatorio(int[] vetorvetor, int[] vetor, double quantidade) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
		}

		return vetor;
	}

	private static void printVetor(vetor, texto) {
		System.out.print(texto);
		for (int i : vetor) {
			System.out.print(i + " ");
		}
	}

	private static void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int pivo = vetor[inicio];
			int i = inicio + 1, f = fim;
			while (i <= f) {
				if (vetor[i] <= pivo)
					i++;
				else if (pivo < vetor[f])
					f--;
				else {
					int troca = vetor[i];
					vetor[i] = vetor[f];
					vetor[f] = troca;
					i++;
					f--;
				}
			}
			vetor[inicio] = vetor[f];
			vetor[f] = pivo;
			int posicaoPivo = f;
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);
		}
	}
}
