package listas;

import java.util.ArrayList;
import java.util.List;

public class VetorListas {

	public static void main(String[] args) {

		List<String> agencia = new ArrayList<>();
		agencia.add("Luiz - 111-346262");
		agencia.add("Mauro - 31-346262");
		agencia.add("Maria - 112-386292");
		System.out.println("Tamanho da lista [" + agencia.size()+ "]");
		
		int n = agencia.size();
		int i;
		for(i=0; i< n; i++) {
			System.out.println("Posição=" + (i+1) + " Contatos= " + agencia.get(i));
		}
	}

}
