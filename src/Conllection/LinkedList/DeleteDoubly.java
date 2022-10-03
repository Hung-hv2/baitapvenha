package Conllection.LinkedList;

public class DeleteDoubly {
    public static class Node {
        int value;
        Node prev;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
//    public void display() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.value + "–>");
//            temp = temp.next;
//        }
//        System.out.println("END");
//    }
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



    // Xóa phần tử đầu tiên
    public void deleteFirst() {
        if (head == null) {
            return;
        }else {
                head = head.next;
                head.prev = null;
        }
    }



    //Xóa phần tử cuối cùng
    public void deleteFinal() {
        if (head == null) {
            return;
        }else {
                tail = tail.prev;
                tail.next = null;
        }
    }

    // Xóa phần tử bất kì
    public void deleteIndex(int index) {
        if(head == null) {
            return;
        }
        else {
            Node current = head;
            int Node = index;
            for(int i = 1; index < Node; i++){
                current = current.next;
            }
            if(current == head) {
                head = current.next;
            }
            else if(current == tail) {
                tail = tail.prev;
            }
            else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            current = null;
        }
    }
    void print() {
        Node curr = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DeleteDoubly dList = new DeleteDoubly();
        dList.addNode(10);
        dList.addNode(20);
        dList.addNode(30);
        dList.addNode(40);
        dList.addNode(50);
        System.out.println("Thêm Node ");
        dList.print();
//        dList.deleteIndex(2);
//        dList.deleteFinal();
        dList.deleteFirst();
        System.out.println("Sau khi xóa Node");
        dList.print();
    }
}
