import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        singleList list = new singleList();
        list.addToEnd(5);
        list.addToEnd(6);
        list.addToEnd(7);
        list.printAll();

    }
    public static class singleList  {
        Node head;
        Node tail;
        private static class Node{
            int value;
            Node next;
            public Node(int value){
                this.value = value;
            }
        }
        private boolean isEmpty(){
            return head==null;
        }
        public void addToEnd(int value){
            Node newNode = new Node(value);
            if (isEmpty()){
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

        }
        public void printAll(){
            Node node = head;
            while (node!=null){
                System.out.print("{" +node.value+"}");
                node = node.next;
            }
            System.out.println();
        }

    }
}
