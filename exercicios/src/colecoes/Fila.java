package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Ana");
		fila.offer("Stanley");
		fila.offer("Carlos");
		fila.offer("Rafaela");
		fila.offer("Daniel");
		
		
//		System.out.println(fila.peek());
//		System.out.println(fila.peek());
//		System.out.println(fila.element());
//		System.out.println(fila.element());
		
		System.out.println(fila.size());
		//fila.clear()
		System.out.println(fila.isEmpty());
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}
