package LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }
}
