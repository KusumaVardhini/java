import java.util.PriorityQueue;
public class PriorityQueueExample{
	public static void main(String[] args){
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.offer(30);
		pq.offer(10);
		pq.offer(20);
		System.out.println("PriorityQueue(Min-Heap):");
		while(!pq.isEmpty()){
			System.out.println(pq.poll());
		}
		PriorityQueue<Integer> maxPq=new PriorityQueue<>((a,b)-> b-a);
		maxPq.offer(10);
		maxPq.offer(30);
		maxPq.offer(20);
		System.out.println("PriorityQueue(Max-Heap):");
		while(!maxPq.isEmpty()){
			System.out.println(maxPq.poll());
		}
	}
}