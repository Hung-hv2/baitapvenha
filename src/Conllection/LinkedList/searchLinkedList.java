package Conllection.LinkedList;

// Tìm kiếm 1 từ tiếng anh trong tập hợp 1000 từ
public class searchLinkedList {
    public static class Node {
        int value;
        Node next;
        Node prev;
        public Node(int value) {
            this.value = value;
        }
    }
    Node head, tail = null;
    public void addNode(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    public void searchNode(int value) {

    }
}
