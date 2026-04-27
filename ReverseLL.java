package LL;
import java.util.Collections.*;
import java.util.LinkedList;
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}
public class ReverseLL {
    Node head;
    public  void reverseList() {
        Node pretemp = null;
        Node temp = head;

        while (temp != null) {
            Node nextTemp = temp.next; // store next node
            temp.next = pretemp;              // reverse link
            pretemp = temp;                  // move prev forward
            temp = nextTemp;              // move current forward
        }
        head = pretemp;
        System.out.println();


    }

    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("empty linked list...");
            return;
        }
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    public void insertLast(int val){
        Node node = new Node(val);
        node.next = null;
        if(head == null){
            head = node;
            return ;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;

    }

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.insertLast(12);
        list.insertLast(22);
        list.insertLast(11);
        list.display();
        list.reverseList();

        list.display();
        list.reverseList();
        list.display();

    }
}
