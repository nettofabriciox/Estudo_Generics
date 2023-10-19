package listas;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericos {

	List<Integer> agenda = new ArrayList<>();
	
	public void addLista(Integer valor) {
		agenda.add(valor);
	}
	
	public Integer primeiroDado() {
		if(agenda.isEmpty()) {
			throw new IllegalStateException("lista vazia");
		}
		return agenda.get(0);
	}
	
	public void printar() {
		System.out.print("[ "
				+ "");
		for(Integer x: agenda) {
			System.out.print(x + " ");
		}
		System.out.println("]");
	}
}
