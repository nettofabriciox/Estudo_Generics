package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TipoCuringa {

	public static void main(String[] args) {

		List<Integer> inteiros = Arrays.asList(5, 2, 10);
		List<String> nomes = Arrays.asList("Maria","Luiz","Silvio");
		 
		printLista(inteiros);
		printLista(nomes);
	}

	public static void printLista(List<?> lista) {
		for (Object obj: lista) {
			System.out.println(obj);
		}
	}
}
