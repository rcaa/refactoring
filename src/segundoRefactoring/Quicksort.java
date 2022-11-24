package segundoRefactoring;

import java.io.IOException;

public class Quicksort {

	public static void main(String[] args) throws IOException {
		int tamanho = 10_000;
		int[] vetor = gerarVetorDeInteirosAleatorios(tamanho);
		
		System.out.println("Vetor desordenado: ");
		imprimirVetor(vetor);

		quickSort(vetor, 0, vetor.length - 1);

		System.out.println("\nVetor ordenado: ");
		imprimirVetor(vetor);
	}

	private static int[] gerarVetorDeInteirosAleatorios(int tamanho) {
		int[] vetor = new int[tamanho];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * tamanho);
		}
		return vetor;
	}

	private static void imprimirVetor(int[] vetor) {
		for (int i : vetor) {
			System.out.print(i + " ");
		}
	}

	private static void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio >= fim) {
			return;
		}
		int posicaoPivo = partitionarLista(vetor, inicio, fim);
		quickSort(vetor, inicio, posicaoPivo - 1);
		quickSort(vetor, posicaoPivo + 1, fim);
	}

	private static int partitionarLista(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1;
		int f = fim;

		while (f > i) {
			if (pivo > vetor[i])
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
		return f;
	}
}
