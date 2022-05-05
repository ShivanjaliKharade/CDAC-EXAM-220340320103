class Stack{
	int capacity;
	int a1[];
	int top1;
	int top2;
	
	Stack(int limit){
		capacity = limit;
		a1 = new int[capacity];
		top1=top2=-1;
	}
	
	void push1(int data){
		if(top1>=capacity-1)
			return;
		top1++;
		a1[top1]=data;
	}
	
	void push2(int data){
		if(top2>=capacity-1)
			return;
		top2++;
		a1[top2]=data;
	}
	
	int pop1(){
		
		if(top1<0)
			return -1;
		
		int remove1 = a1[top1];
		
		top1--;
		
		return remove1;
		
	}
	
	int pop2(){
		
		if(top2<0)
			return -1;
		
		int remove2 = a1[top2];
		
		top2--;
		
		return remove2;
		
	}
	
	public static void main(String args[]){
		Stack s1 = new Stack(4);
		Stack s2 = new Stack(4);
		
		s1.push1(5); 
		s2.push2(10); 
		s2.push2(15); 
		s1.push1(11); 
		s2.push2(7); 
		s2.push2(40);
		
		System.out.println("Popped element from stack1 is "+s1.pop1());
		System.out.println("Popped element from stack2 is "+s2.pop2());
		
	}
}