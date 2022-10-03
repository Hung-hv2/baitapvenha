package Conllection.LinkedList;

public class DoublyLinkedList {
    Node head;
    // 4 Node A, B, C, D nối với nhau

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


    // Thêm vào đầu
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

    // Thêm vào cuối
    public void insertEnd(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            head.next = null;
        }else  {
            head.next = newNode;
            newNode.prev = head;
            head = newNode;
            head.next = null;
        }
    }

    // Thêm vào vị trí bất kì
    public void insertIndex(Node indexNode, int value) {
        Node newNode = new Node(value);
        if(indexNode == null) {
            return;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dList = new DoublyLinkedList();

        // thêm vào đầu
        dList.insertFirst(5);
        dList.insertFirst(4);
        dList.insertFirst(6);


        //Thê, vào cuối
//        dList.insertEnd(2);
//        dList.insertEnd(3);
//        dList.insertEnd(4);
//        dList.insertEnd(5);
        dList.printLinkedList();
    }
}
