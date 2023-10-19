package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VetorListas {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		List<String> agencia = new ArrayList<>();
		agencia.add("Luiz - 111-346262");
		agencia.add("Mauro - 31-346262");
		agencia.add("Maria - 112-386292");
		System.out.println("Tamanho da lista [" + agencia.size() + "]");

		int n = agencia.size();
		int i;
		for (i = 0; i < n; i++) {
			System.out.println("Posição=" + (i + 1) + " Contatos= " + agencia.get(i));
		}

		System.out.printf("\nInforme a posição a ser excluída:\n");
		i = ler.nextInt();

		try {
			// [ D ] remove o i-ésimo contato da agenda
			agencia.remove(i);
		} catch (IndexOutOfBoundsException e) {
			// exceção lançada para indicar que um índice (i)
			// está fora do intervalo válido (de 0 até agenda.size()-1)
			System.out.printf("\nErro: posição inválida (%s).", e.getMessage());

		}
	}
}

