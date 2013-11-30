package org.acg.criptocesar;

public class LetraAlf {

	private char letra;
	private int pos;
	
	public LetraAlf(){
		letra = ' ';
		pos = 0;
	}
	
	public LetraAlf(char pChar, int pPos){
		letra = pChar;
		pos = pPos;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char pLetra) {
		letra = pLetra;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pPos) {
		pos = pPos;
	}
	
	
}
