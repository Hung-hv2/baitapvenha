package Conllection.LinkedList;

public class DoublyLinkedList {
    Node head;
    // 4 Node A, B, C, D nối với nhau

    // Thêm phần tử vào đầu
    public static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public void printLinkedList() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            System.out.println("Node in doubly Linked List:");
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
                }
                    System.out.println();
        }
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            head.prev = null;
            head.next = null;
        }else{
            head.prev = newNode;
            newNode.next = head;
            newNode.prev = null;
            head = newNode;
        }
    }


    public void insertEnd(int value) {
        Node newNode = new Node(value);
    }

    public static void main(String[] args) {
        DoublyLinkedList dList = new DoublyLinkedList();

        // thêm vào đầu
//        dList.insertFirst(5);
//        dList.insertFirst(4);
//        dList.insertFirst(6);


        //Thê, vào cuối
        dList.printLinkedList();
    }
}
