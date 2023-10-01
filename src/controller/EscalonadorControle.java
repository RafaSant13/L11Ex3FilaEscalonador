package controller;

import model.Fila;
import model.Processo;

public class EscalonadorControle {

	public EscalonadorControle() {
		super();
	}
	
	public void escalonador(Fila<Processo> fila) {
		while (!fila.isEmpty()){
			try {
				Processo p = fila.remove();
				if(p.qtdRetornos>0) {
					p.qtdRetornos--;
					System.out.println("Processo: "+p.nome+", Vezes p/ repetir: "+p.qtdRetornos);
					fila.insert(p);
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		} 
		
	}

}
