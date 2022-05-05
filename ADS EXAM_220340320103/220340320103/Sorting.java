import java.util.Scanner;
class Sorting{
	
	void insertionSort(int a1[]){
		int n = a1.length;
		for(int i=n-1; i>=0; i--){
			int temp = a1[n-1];
			int j = i-1;
			while(j>=0 && a1[j]>temp){
				a1[j+1]=a1[j];
				j--;
				display(a1);
			}
			a1[j+1] = temp;
			
			if(i==n-1)
			display(a1);
		}
	}
	
	void display(int a1[]){
		int n = a1.length;
		for(int i=0; i<n; i++){
			System.out.print(a1[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		Sorting s1 = new Sorting();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a1[] =new int[n];
		int key=0;
		for(int i=0; i<n; i++){
			a1[i] = sc.nextInt();
		}
		System.out.println();
		
		s1.insertionSort(a1);
		
		
		
		/*//display
		for(int i=0; i<n; i++){
			System.out.print(a1[i]+" ");
			key = a1[n-1];
		}
			//System.out.println(key);
			*/
		
			
		}
}