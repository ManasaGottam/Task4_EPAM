package Epam;
import java.util.*;
class Queue{
		
	void enqueue(int data,Stack<Integer> stack1) {
		stack1.push(data);
	}
	int dequeue(Stack<Integer> stack1,Stack<Integer> stack2) {
		if(stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("EMPTY");
			return -1;
		}
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		int res=stack2.pop();
		return res;
	}
	void print(Stack<Integer>stack1,Stack<Integer>stack2) {
		if(stack1.isEmpty()) {
			String[] strArray = new String[stack2.toArray().length];
		    for (int i = 0; i < stack2.toArray().length; i++)
		        strArray[i] = String.valueOf(stack2.toArray()[i]);
		    System.out.println(strArray[strArray.length-1]);
		}
		else if(stack2.isEmpty()){
			String[] strArray = new String[stack1.toArray().length];
		    for (int i = 0; i < stack1.toArray().length; i++)
		        strArray[i] = String.valueOf(stack1.toArray()[i]);
		    System.out.println(strArray[0]);
		}
		else {
			String[] strArray = new String[stack2.toArray().length];
		    for (int i = 0; i < stack2.toArray().length; i++)
		        strArray[i] = String.valueOf(stack2.toArray()[i]);
		    System.out.println(strArray[strArray.length-1]);
		}
	}
}
public class Queuesusing2Stacks {
	static Stack<Integer> stack1=new Stack<>(); 
    static Stack<Integer> stack2=new Stack<>();
   
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		int q=sc.nextInt();
		Queue queue=new Queue();
		if(q==1) {
			int data=sc.nextInt();
			queue.enqueue(data,stack1);
		}
		else if(q==2) {
			int k=queue.dequeue(stack1,stack2);
			//System.out.println(k);
		}
		else if(q==3)
			queue.print(stack1,stack2);
	}
}
}
