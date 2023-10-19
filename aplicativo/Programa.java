package aplicativo;

import java.util.Scanner;

import listas.ClasseGenericos;

public class Programa {

	public static void main(String[] args) {

		Scanner capturarDados = new Scanner(System.in);

		ClasseGenericos cg = new ClasseGenericos();
		System.out.println("Entre com quantidade de valores? ");
		Integer valor = capturarDados.nextInt();
		for (int i = 0; i < valor; i++) {
			Integer valores = capturarDados.nextInt();
			cg.addLista(valores);
		}
		
		cg.printar();
		System.out.println("Primeiro valor adicionado foi: "+cg.primeiroDado());

	}
}

