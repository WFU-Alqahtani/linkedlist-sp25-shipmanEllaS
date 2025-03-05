import java . util .*;

class Node{
    int data;
    Node next=null;

    public Node(int i){
        data=i;
    }
    public Node(int i, Node n){
        data=i;
        next=n;
    }
}
public class LinkedList {

    public static void main(String[] args) {
        Random rand = new Random();
        Node head = new Node(rand.nextInt(10));
        Node curr = head;
        for (int i = 0; i < 9; i++) {
            Node temp = new Node(rand.nextInt(10));
            curr.next = temp;
            curr = curr.next;
        }

        //print
        curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }

        System.out.print("Enter the value you would like to delete: ");
        Scanner scnr = new Scanner(System.in);
        int x = scnr.nextInt();

        Node prev = head;
        curr = head.next;

        //Accounting for case head = x
        if (head.data == x) {
            for (int i = 0; i < 8; i++) {
                prev.data = curr.data;
                prev = prev.next;
                curr = curr.next;
            }
        }

        //Deleting the node that = x
        while (curr != null) {
            if (curr.data == x) {
                prev.next = curr.next;
            }
            prev = prev.next;
            curr = curr.next;
        }

        System.out.println("Your new list: ");

        /*
        //Insert 20 at the head
        curr = head;
        Node temp;
        Node newNode = new Node(20);
        temp = head.next;
        curr.next =
        newNode.next = head;
         */

        curr = head;
        //Insert 40 at the end
        while (curr != null) {
            if (curr.next == null) {
                Node temp = new Node(40);
                curr.next = temp;
            }
            curr = curr.next.next;
        }

        //Insert 60 at 4th spot
        curr = head;
        Node temp = curr.next;
        int place = 0;
        while (place <= 2) {
            if (place == 2) {
                Node newNode = new Node(60);
                curr.next = newNode;
                newNode.next = temp;
            }
            curr = curr.next;
            temp = temp.next;
            place++;
        }

        //print
        curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

}