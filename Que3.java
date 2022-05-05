//Q3:Java program to implement two stacks in a single array.
import java.util.*;
class stacks{
	
	int [] arr;
	int size;
	int top1;
	int top2;
	
	stacks(int n){
		size=n;
		arr=new int[n];
		top1= n/2+1;
		top2= n/2;
	}
	void push1(int x ){
		if(top1> 0){

			top1--;
		arr[top1]=x;
		}
		
	
	} 
	
	void push2(int x ){
		if(top2 < size - 1){

			top2++;
		arr[top2]=x;
		}
		
	
	} 
	
	
	int pop1(){
		if(top1<=size / 2){
			
			int x= arr[top1];
			top1++;
			return x;
		}
		else
		{
			System.out.println("Stack underflow");
		}
		return 0;
	}
	
	int pop2(){
		if(top2 >= size / 2 + 1){
			
			int x= arr[top2];
			top2++;
			return x;
		}
		else
		{
			System.out.println("Stack underflow");
			System.exit(1);
		}
		return 1;
	}
}
	class Que3{
		
	public static void main(String... args){
		
		stacks s1 = new stacks(5);
		
		
				s1.push1(5); 
				s1.push2(10); 
				s1.push2(15); 
				s1.push1(11); 
				s1.push2(7); 
				s1.push2(40);
				
	System.out.println("Popped element from stack1"+" "+s1.pop1());
	System.out.println("Popped element from stack2"+" "+s1.pop2());
		
	}
	
	
}

/*
Popped element from stack1 11
Popped element from stack2 15
*/