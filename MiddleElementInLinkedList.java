package Epam;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(){
		data=0;
		next=null;
	}
	Node(int d){
		data=d;
		next=null;
	}
}
class LinkedList{
	Node head;
	LinkedList(){
		head=null;
	}
	void add(int ele){
		Node node=new Node(ele);
		if(head==null) {
			head=node;
			return;
		}
		Node temp;
		for(temp=head;temp.next!=null;temp=temp.next);
		temp.next=node;
	}
	void print() {
		Node temp;
		for(temp=head;temp!=null;temp=temp.next) {
			System.out.print(temp.data+" ");
			}
	}
	int getLength() {
		System.out.println("HI");
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
		}
		return count;
	}
	void middleElement() {
		int n=0;
		Node t=head;
		while(t!=null) {
			n++;
			t=t.next;
		}
		//System.out.println(n);
		if(n==0) {
			System.out.println("LinkedList is Empty");
			return;
		}
		int m=0;
		if(n%2==0) {
		     m=n/2+1;
		}
		else {
			 m=n/2+1;
		}
		int count=0;
		Node temp=head;
		while(temp.next!=null && count<m-1) {
			temp=temp.next;
			count++;
		}
		System.out.println(temp.data);
	}
}
public class MiddleElementInLinkedList {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int ele=-1;
	LinkedList list=new LinkedList();
	while((ele=sc.nextInt())!=-1) {
		list.add(ele);
	}
	sc.close();
	//list.print();
	list.middleElement();
}
}
