package org.acg.criptocesar;
import java.util.HashMap;

import org.acg.linkedqueue.QueueLinked;

public class CriptografiaCesar {

	public CriptografiaCesar() {
		//Clase de servicio
	}

	//Formato Unicode
	public String codificar(String s,QueueLinked<Integer> key){
	   String res = "";
	   int aKey;
	   for (int i = 0; i < s.length(); i++) {
	      aKey = key.remove();
	      res += (char) ((int) s.charAt(i) + aKey);
	      key.insert(aKey);
	   }
	   return res;
	}
}
