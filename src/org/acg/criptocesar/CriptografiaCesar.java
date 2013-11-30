package org.acg.criptocesar;
import java.util.HashMap;

import org.acg.linkedqueue.QueueLinked;

public class CriptografiaCesar {

	public CriptografiaCesar() {
		//Clase de servicio
	}

	public String codificar(String s,QueueLinked<Integer> key){
		//Pre: caracteres en minuscula
		HashMap<Integer,Character> alf = obtenerAlfabeto();
		String res = "";
		int aKey;
		char letra;
		int letraCodificada;
		for (int i = 0; i < s.length(); i++) {
			letra = s.charAt(i);
			if (letra == ' ') {
				res += ' ';
			} else {
				aKey = key.remove();
				letraCodificada = bIndice(((int) letra)-96, aKey); 
				res += alf.get(letraCodificada);
				key.insert(aKey);
			}
		}
		return res;
	}

	private int bIndice(Integer pCharValue, int pAKey) {
		int indexNewChar = pCharValue + pAKey;
		if (indexNewChar < 1 || indexNewChar > 26) {
			if (indexNewChar == 0){
				return 1;
			}else{
				int a = indexNewChar % 26;
				if (a > 0) {
					return a;
				} else{
					return 26+a;
				}
			}
		} else {
			return indexNewChar;
		}
		
	}

	private HashMap<Integer, Character> obtenerAlfabeto() {
		HashMap<Integer, Character> alfabeto = new HashMap<Integer, Character>(
				26);
		alfabeto.put(1, 'a');
		alfabeto.put(2, 'b');
		alfabeto.put(3, 'c');
		alfabeto.put(4, 'd');
		alfabeto.put(5, 'e');
		alfabeto.put(6, 'f');
		alfabeto.put(7, 'g');
		alfabeto.put(8, 'h');
		alfabeto.put(9, 'i');
		alfabeto.put(10, 'j');
		alfabeto.put(11, 'k');
		alfabeto.put(12, 'l');
		alfabeto.put(13, 'm');
		alfabeto.put(14, 'n');
		alfabeto.put(15, 'o');
		alfabeto.put(16, 'p');
		alfabeto.put(17, 'q');
		alfabeto.put(18, 'r');
		alfabeto.put(19, 's');
		alfabeto.put(20, 't');
		alfabeto.put(21, 'u');
		alfabeto.put(22, 'v');
		alfabeto.put(23, 'w');
		alfabeto.put(24, 'x');
		alfabeto.put(25, 'y');
		alfabeto.put(26, 'z');
		return alfabeto;
	}
}
