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
		System.out.print("[ ");
		if(!agenda.isEmpty()) {
			System.out.print(agenda.get(0));
		}
		for(int i=1; i<agenda.size(); i++) {
			System.out.print(", " + agenda.get(i));
		}
		System.out.println(" ]");
	}
}
