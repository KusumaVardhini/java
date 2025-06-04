import java.util.ArrayDeque;
import java.util.Deque;
public class DequeExample{
	public static void main(String[] args){
		Deque<Integer> deque=new ArrayDeque<>();
		deque.addFirst(10);
		deque.addLast(20);
		deque.offerFirst(5);
		deque.offerLast(25);
		System.out.println("Deque:"+deque);
		System.out.println("removed Front:"+deque.pollFirst());
		System.out.println("removed Rear:"+deque.pollLast());
		System.out.println("Front element:"+deque.peekFirst());
		System.out.println("Rear element:"+deque.peekLast());
		System.out.println("Final Deque:"+deque);
	}
}