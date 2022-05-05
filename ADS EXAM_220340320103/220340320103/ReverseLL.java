import java.util.Scanner;
class ReverseLL{
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int d){
			data = d;
			next = null;
		}
	}
	
	//display
	void display(){
		Node node = head;
		while(node!=null){
			System.out.println(node.data);
			node = node.next; 
		}
	}
	
	//insertion
	void insertAtStart(int data){
			Node new_node = new Node(data);
			new_node.next=head;
			head = new_node;
			
		}
	
	
	//reverse
	Node reverse(Node n, Node prev){     
		if(head ==null)
			return head;
		
		if(n.next == null){
			head = n;
			n.next =prev;
			return head;
		}
		Node temp = n.next;
		n.next = prev;
		
		reverse(temp, n);
		return head;
	}
	
	
	public static void main(String args[]){
		ReverseLL r1 = new ReverseLL();
		
		Scanner sc = new Scanner (System.in);
		//no. of test cases
		int t = sc.nextInt();
		//no. of elements
		int n = sc.nextInt();
		
		for(int i=0; i<=n-1 ; i++){
		int num = sc.nextInt();
		r1.insertAtStart(num);
		}
		
		System.out.println();
		
		r1.reverse(r1.head, null);
		r1.display();
		
		//Node rev = r1.reverse(r1.head, null);
		//System.out.println(rev);
	}
}