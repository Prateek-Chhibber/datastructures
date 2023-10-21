package LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(50);
        myLinkedList.append(10);
        myLinkedList.append(20);
        myLinkedList.append(30);
        System.out.println(myLinkedList.get(2).value+"\n");
        myLinkedList.printList();
    }
}
