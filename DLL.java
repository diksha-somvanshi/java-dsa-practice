package LL;

public class DLL {
    Node head;


    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(int value) {
            this.value = value;
        }

        public void insertFirst(int val){
            Node node = new Node(val);

        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node temp = head;
        node.next = null;
        if(head==null){
           node.prev = null;
           head = node;
           return;
        }
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }
    public void insertAt(int val, int index){
        if(index < 1){
            System.out.println("invalid index...");
            return;
        }
        if(index == 1){
            insertFirst(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index-1 && temp != null; i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("index out of bound..!");
            return;
        }
        Node node = new Node(val);

        if(temp.next!=null){
            temp.next.prev = node;
            node.next = temp.next;
        }
        temp.next = node;
        node.prev = temp;

    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("empty linked list...");
            return;
        }
        System.out.println("deleted element is "+ head.value);
        if(head.next == null){
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("empty linked list...");
            return;
        }
        if(head.next==null){
            deleteFirst();
            return;
        }
        Node temp = head;
        Node pretemp = null;
        while(temp.next != null){
            pretemp = temp;
            temp = temp.next;
        }
        System.out.println("deleted element is "+temp.value);
        temp.prev = null;
        pretemp.next = null;
    }
    public void deleteAt(int index){
        if(head == null){
            System.out.println("empty linked list...");
            return;
        }
        if(index<1){
            System.out.println("invalid index..");
            return ;
        }
        if(index == 1){
            deleteFirst();
            return;
        }
        Node temp = head;
        for(int i = 0; i < index-1 && temp != null; i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("index out of bound...");
            return;
        }
        System.out.println("deleted value is "+temp.value);
        if(temp.next != null){
            temp.next.prev = temp.prev;
        }
        if(temp.prev != null){
            temp.prev.next = temp.next;
        }

    }
    public void display(){
        Node temp = head;
      Node last = null;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
        System.out.println("display reverse:");
        while(last!=null){
            System.out.print(last.value+" -> ");
            last = last.prev;
        }
        System.out.print("START");
        System.out.println();
    }


}
