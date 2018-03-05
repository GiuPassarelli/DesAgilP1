package br.pro.hashi.ensino.desagil.tequilada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main (String[] args) {
		
		String texto;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("Texto.txt"));
			while ((texto = br.readLine()) != null){
				StringBuilder textoNovo = new StringBuilder(texto);
				int i = 0;
				while (i < textoNovo.length()){
					if (textoNovo.charAt(i) == '#') textoNovo.setCharAt(i, 'X');
					i++;
				}

			System.out.println(textoNovo);
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}