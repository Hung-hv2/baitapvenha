package Conllection.LinkedList;

public class MyLinkedList {
    public static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    // CHo 4 Node A, B, C, D
    public static void printLinkedList(Node head) {
        if(head == null) {
            System.out.println("List is empty");
        }else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if(temp != null) {
                    System.out.print("->");
                }else {
                    System.out.println();
                }
            }
        }
    }

    // Thêm phần tử vào đầu LinkedList
    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if(headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    // Thêm phần tử vào cuối LinkedList
    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if(headNode == null) {
            return null;
        }else {
            //B1: xác định last Node ( phần tử cuối cùng )(lastNode == null là phần tử cuối cùng)
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            //B2; Gán next cho lastNode == newNode
            lastNode.next = newNode;
        }
        return headNode;
    }


    // Thêm phần tử vào vị trí N
    public static Node addToIndex(Node headNode, int value, int index) {
        if(index == 0) {
            return addToHead(headNode, value);
        }else {
            //B1: Tìm vị trí cần thêm
            Node curNode = headNode;
            Node newNode = new Node(value);
            int count = 0;
            while (curNode != null) {
                count++;
                if(count == index) {
                    //Thực hiện add
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }
        return headNode;
    }


    // Xóa phần tử đầu trong LinkedList
    // Xóa phần tử A ở đầu
    //  A.head = B.next
    // A.next = null
    public static Node removeAtHead(Node headNode) {
        if(headNode != null) {
            return headNode.next;
        }
        return headNode;
    }


    // Xóa phần tử cuối cùng
    // Xóa phần tử D cuối cùng
    // if(D==Tail)
    // delete.tail
    // C.next = null
    // Tail = C
    public static Node removeAtTail(Node headNode) {
        if(headNode == null) {
            return null;
        }
        //B1: xác định last và previuos
        Node lastNode = headNode;
        Node prevNode = null;
        while (lastNode.next != null) {
            //lastNode.next == null
            prevNode = lastNode;
            lastNode = lastNode.next;
        }
        if(prevNode == null) {
            return null;
        }else {
            prevNode = lastNode.next;
        }

        return headNode;
    }


    // Xóa phần tử ở giữa

    //Xóa phần tử C ở giữa
    // While(C!=Null)
    // If (C.data = X)
    // B.next = C.next
    // delete C
    public static Node removeAtIndex(Node headNode, int index) {
        if(headNode == null || index < 0)
            return null;
        if(index == 0)
            return removeAtHead(headNode);
        Node curNode = headNode;
        Node prevNode = null;
        int count = 0;
        boolean bIsFound = false;
        while (curNode != null) {
            if(count == index){
                //Thực hiện remove curNode
                bIsFound = true;
                break;
            }
            prevNode = curNode;
            curNode = curNode.next;
            count++;
        }
        // Remove cur
        if(bIsFound) {
            if(prevNode == null) {
                // Current Node is last Nde
                return null;
            }else {
                if(curNode != null) {
                    prevNode.next = curNode.next;
                }

            }
        }
            return headNode;
    }




    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        printLinkedList(n1);

        // Thêm vào đầu
//        n1 = addToHead(n1, 0);

        //Thêm vào cuối
//        Node newList = addToTail(n1,4);


        //Thêm vào index bất kì
//        n1 = addToIndex(n1, 0,0);
//        printLinkedList(n1);
//        n1 = addToIndex(n1, 4,0);
//        printLinkedList(n1);
//        n1 = addToIndex(n1,1,1);
//        printLinkedList(n1);


        //Xóa phần tử đầu tiên
//        n1 = removeAtHead(n1);
//        printLinkedList(n1);
//        n1 = removeAtHead(n1);
//        printLinkedList(n1);


        //Xóa phần tử cuối cùng
//        n1 = removeAtHead(n1);
//        printLinkedList(n1);
//        n1 = removeAtHead(n1);
//        printLinkedList(n1);


        // Xóa phần tử ở giữa
        n1 = removeAtIndex(n1,0);
        printLinkedList(n1);
        n1 = removeAtIndex(n1,1);
        printLinkedList(n1);

    }
}
