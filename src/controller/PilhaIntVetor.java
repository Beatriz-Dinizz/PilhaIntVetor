package controller;

import br.edu.fateczl.pilhaIntString.PilhaInt;

public class PilhaIntVetor {
	
	public int carregarVetor(int[] vetor) throws Exception {
		PilhaInt pilha = new PilhaInt();
		
		for(int valor : vetor) {
			if(valor >= 0) {
				pilha.push(valor);
			} else {
				if(pilha.size() >= 2) {
					int valor1 = pilha.pop();
					int valor2 = pilha.pop();
					int soma = valor1 + valor2;
					
					pilha.pop();
				}
			}
		}
		
		return pilha.size();
	}
}
