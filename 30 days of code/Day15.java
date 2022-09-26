class Solution {

    public static  Node insert(Node head,int data) {
        //Complete this method
        if(head == null) head = new Node(data);         //create head if none
        else{
            Node n = head,nw = new Node(data);          //create new node
            while(n.next!=null) n=n.next;                //reach end of list
            n.next= nw;                                  //connect new 
        }
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
