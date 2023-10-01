package view;

import controller.EscalonadorControle;
import model.Fila;
import model.Processo;

public class Principal {

	public static void main(String[] args) {
		Fila<Processo> fila = new Fila<>();
		String vet[] = {"notepad.exe;14","write.exe;35","chrome.exe;27","acrobat.exe;52","firefox.exe;18","word.exe;25"};
		EscalonadorControle e = new EscalonadorControle();
		
		for(String string:vet) {
			Processo p = new Processo();
			String[] split = string.split(";");
			p.nome = split[0];
			p.qtdRetornos = Integer.parseInt(split[1]);
			fila.insert(p);
		}
		e.escalonador(fila);

	}

}
