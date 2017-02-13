import java.util.*;

public class DoublyLinkedList {
    
    private Node head;
    private Node tail;
    private int size;
    
    public DoublyLinkedList() {
        size = 0;
    }
    
    private class Node {
        private Object Element;
        private Node Next;
        private Node Prev;
        
        public Node(E Element, Node Next, Node Prev) {
            this.Element = Element;
            this.Next = Next;
            this.Prev = Prev;
        }
   }
   
   
    public int returnSize() { 
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public void addFirst(E Element) {
        Node temp = new Node(Element, head, null);
        if (head != null) {
            head.Prev = temp;
        }
        head =  temp;
        if (tail == null) {
            tail =  temp;
        }
        size++;
        System.out.println("Adding to start: " + Element);
    }
    
    public void addLast(E Element) {
        Node temp = new Node(Element, null, tail);
        if (tail != null) {
            tail.Next = temp;
        }
        if (head == null) {
            head = temp;
        }
        size++;
        System.out.println("Adding to end: " + Element);
    }
    
    public void moveForward() {
        System.out.println("Moving forwards..");
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.Element);
            temp = temp.Next;
        }
    }
    
    public void moveBackward() {
        System.out.println("Moving backwards..");
        Node temp = tail;
        while(temp != null) {
            System.out.println(temp.Element);
            temp = temp.Prev;
        }
    }
    
    public E removeFirst() {
        if (size == 0) throw new NoSuchElementException();
        Node temp = head;
        head = head.Next;
        head.Prev = null;
        size--;
        System.out.println("Deleted from start: " + temp.Element);
        return temp.Element;
    }
    
    public E removeLast() {
        if (size == 0) throw new NoSuchElementException();
        Node temp = tail;
        tail = tail.Prev;
        tail.Next = null;
        size--;
        System.out.println("Deleted from end: " + temp.Element);
        return temp.Element;
    }
    
    public Node insertNode(Node node) {
    if (node == null)
        return null;

    // Make the first node the start of the sorted list.
    Node sortedList = node;
    node = node.Next;
    sortedList.Next = null;

    while(node != null) {
        // Advance the nodes.
        final Node current = node;
        node = node.Next;

        // Find where current belongs.
        if (current.Element < sortedList.Element) {
            // Current is new sorted head.
            current.Next = sortedList;
            sortedList = current;
        } else {
            // Search list for correct position of current.
            Node search = sortedList;
            while(search.Next != null && current.Element > search.Next.Element)
                search = search.Next;

            // current goes after search.
            current.Next = search.Next;
            search.Next = current;
        }
    }

    return sortedList;
}
}

        
