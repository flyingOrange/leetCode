package text;
import java.math.BigInteger;  

/**
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

//不一定相同位数
1+18=19
342+465=807
 */

//返回 x的y次幂  
//Math.pow(x, y);                   
//Math.pow(2, 3);                 //即2³ 即返回：8 
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
public class AddTwoNumbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		
		return null;
    }
	
	public static void main(String[] args) {
//		ListNode l1 = new ListNode(2);
//		l1.next = new ListNode(4);
//		l1.next.next = new ListNode(3);
//		l1.next.next.next = null;
//		
//		ListNode l2 = new ListNode(5);
//		l2.next = new ListNode(6);
//		l2.next.next = new ListNode(4);
//		l2.next.next.next = null;
		/////////////////////////////////////
		
		ListNode l1 = new ListNode(8);
		l1.next = new ListNode(1);
		l1.next.next = null;
		
		ListNode l2 = new ListNode(1);
		l2.next = null;
		addTwoNumbers(l1,l2);
		
	}

}
