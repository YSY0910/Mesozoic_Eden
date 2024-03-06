package Collections_Generics;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class T4 {

	public static void main(String[] args) {
		
		// Queue Test
//		Queue<String> queue = new LinkedList<>();
//		
//		queue.add("TANK1");
//		queue.add("TANK2");
//		queue.add("TANK3");
//
//		System.out.println(queue.element());

		Deque<String> queue = new LinkedList<>();
		
		queue.addLast("Tank 1");
		queue.offer("Tank 2");
		
		queue.addFirst("Tank 3");
		queue.offerFirst("Tank 4");
		//System.out.println(queue.element());
		System.out.println("순서는: " + queue + " 이다.");
		for(String rank : queue) {
			System.out.println(rank);
		}
		
		System.out.println();
		
		String head = queue.peek(); // 맨 위에 값 머리를 가져온다.
		
		System.out.println("Head is " + head);
		
		String removedElement = queue.poll();
		
		System.out.println("Remove: " + removedElement);
		
		for(String rank : queue) {
			System.out.println(rank);
		}
	}

}
