import java.util.Scanner;
		
public class HW2 {
	    
	// For this implementation you should use constant space
	// Note: you are free to add any extra methods,
	// but this method has to be used
	public static boolean isPalindromeRestricted(ListNode head) {
		// Your code goes here
		int a,b=0;
	    ListNode lh=null;
	    ListNode rh= null;
	    ListNode n1=head;
	    ListNode n2= head;
		boolean dataEquality= true;
		ListNode nextNext1=null;
		ListNode next2= null;
		//Above part is the initialization of the variables
		while(n1.getNext()!=null&&n1.getNext().getNext()!=null){//To find mid.
		    nextNext1= n1.getNext().getNext();
		    next2=n2.getNext();
		    n1=nextNext1;
		    n2=next2;
	       }
	       lh= head;
	       rh= rev(n2);
	        while(rh!=null&&rh.getNext()!=null){
		       a= lh.getData();//Assigning the data from the left half to the a.
		       b= rh.getData();//Assigning the data from the right half to the b.
		       lh=lh.getNext();//For reaching the next data in the left half.
		       rh=rh.getNext();//For reaching the next data in the right half.
		       if(a!=b){//data comparison
			       dataEquality=false;
		       }
	       }
	      return dataEquality;
	}
	
	
	public static ListNode rev(ListNode head){//Method for reversing.
		ListNode pr=null;
		ListNode a= null;//Initalizing the list nodes.
		while(true){
			a=head.getNext();
			head.setNext(pr);
			pr=head;
			head=a;
		   if(head==null){//break condition
			  break;
		   }
		}
		return pr;
	}
	
	// For this implementation the space is not restricted
	// Note: you are free to add any extra methods,
	// but this method has to be used 
    public static boolean isPalindromeUnrestricted(ListNode head) {
		// Your code goes here
       return true ;
       
    }
 

	// Prints LinkedList, given the head of the list (if needed for testing)
	public static String listToString(ListNode head) {
		String result = "";
		if (head != null) {
			result += head.getData();
		}
		
		while (head.getNext() != null) {
			head = head.getNext();
			result += " -> " + head.getData();
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ListNode head = null;
		ListNode current = null;
		
		// reads integer tokens from the console and constructs a LinkedList from them
		String line = scan.nextLine();
		
		scan.close();
		scan = new Scanner(line);
		
		while (scan.hasNextInt()) {
			int value = scan.nextInt();
			if (head == null) {
				 head = new ListNode(value);
				 current = head;
			} else {
				current.setNext(new ListNode(value));
				current = current.getNext();
			}
		}

		System.out.println(listToString(head));
		System.out.println(isPalindromeUnrestricted(head));
		System.out.println(isPalindromeRestricted(head));
		
		scan.close();
	}
}
