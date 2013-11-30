package org.acg.criptocesar;

import org.acg.linkedqueue.QueueLinked;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CriptografiaCesar criptografo = new CriptografiaCesar();
		QueueLinked<Integer> queue = new QueueLinked<Integer>();
		queue.insert(-10);
		queue.insert(23);
		queue.insert(-1);
		queue.insert(-8);
		System.out.println(criptografo.codificar("Esto se convertirá en un mensaje cifrado",queue));

	}

}
