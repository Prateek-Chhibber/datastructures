package LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
//        (2) - Items - Returns 2 Node
        System.out.println(myLinkedList.removeLastNode().value);
//        (1) - Items - Returns 1 Node
        System.out.println(myLinkedList.removeLastNode().value);
//        (0) - Items - Returns 0 Node
        System.out.println(myLinkedList.removeLastNode());
        myLinkedList.printList();
    }
}
