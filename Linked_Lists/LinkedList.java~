import java.util.*;

class LinkedList {
    // reference to the head and tail node.
    public Node headNode;
    public Node tailNode;
    private int listSize;
    //  buffer is used to print the trace
    String buffer;
    

    public LinkedList() {
        // DoublyLinkedList constructor
        headNode = null;
        tailNode = null;
    }

    public Object getHeadValue() {
        /** This method returns the value of the head node **/
        if (headNode == null)
            return null;
        return headNode.value;
    }

    public Object getTailValue() {
        /** This method returns the value of the tail node **/
        
        if (tailNode == null)
            return null;
        return tailNode.value;
    }
    

    public void addAtHead(int data) {       
    /** This method allows the user to add at the head of the linked list. Adds the
        integer within the argument, adds it to a new node and adds it to the head 
        of the list **/    
        Node newNode = new Node(data);
        if (isEmpty()) {
            //Special case for an empty list
            newNode.nextNode = null;
            newNode.prevNode = null;
            headNode = newNode;
            tailNode = newNode;
            //Set buffer to trace, to be printed in DSA_CW
            buffer = ("I" + data);

        } else {
            //If the list is not empty, insert normally
            headNode.prevNode = newNode;
            newNode.nextNode = headNode;
            newNode.prevNode = null;
            headNode = newNode;
            //Set buffer to trace, to be printed in DSA_CW
            buffer = ("I" + data + "B" + headNode.nextNode.value);
        }            
        
    }


    public void addAtTail(int data){
    /** This method allows the user to add at the tail of the linked list.
        Adds the integer within the argument, adds it to a new node and adds 
        it to the tail of the list **/ 
        Node newNode = new Node(data);
        if (isEmpty()){
            //Special case for empty list
            headNode = newNode;
            tailNode = newNode;
            buffer = ("I" + data);
        } else {
            //If the list is not empty, insert normally
            tailNode.nextNode= newNode;
            newNode.prevNode = tailNode;
            tailNode = newNode;
            buffer = ("I" + data + "A" + newNode.prevNode.value);
        }
        
    }
    
    public void moveForward(){ 
        /** This method allows the user to move forwards through the 
            Linked list.**/
        System.out.println("moving forward..");
        Node current = headNode;
        while(current != null){
            System.out.println(current.value);
            current = current.nextNode;
        }
    }
     

    public void moveBackward(){
        /** This method allows the user to move backward through 
            the linkedlist  **/ 
        System.out.println("moving backwards..");
        Node current = tailNode;
        while(current != null){
            System.out.println(current.value);
            current = current.prevNode;
        }
    }


    public int deleteAtHead() {
        // If the list is empty
        if (headNode == null) {
            headNode = null;
            tailNode = null;
            return -1;
        }
        // Deleting the only node in list
        if (headNode == tailNode) {
            int data = headNode.getValue();
            headNode = null;
            tailNode = null;
            return data;
        }
        //Otherwise delete from head as normal
        int data = headNode.getValue();
        headNode = headNode.getNextNode();
        headNode.setPrevNode(null);
        return data;
    }

    public int deleteAtTail() {
        // list is empty
        if (tailNode == null) {
            headNode = null;
            tailNode = null;
            return -1;
        }
        
        if (headNode == tailNode) {
            int data = tailNode.getValue();
            headNode = null;
            tailNode = null;
            return data;
        }
        int data = tailNode.getValue();
        tailNode = tailNode.getPrevNode();
        tailNode.setNextNode(null);
        return data;
    }

    public int delete(Node current) {
    /** This method allows the user to delete nodes if it is needed **/
        if (current == null)
            return -1;
        Node next = current.getNextNode();
        Node prev = current.getPrevNode();
        int data = current.getValue();
        if (prev != null)
            prev.setNextNode(next);
        if (next != null)
            next.setPrevNode(prev);
        // delete at the tail
        if (current == tailNode)
            tailNode = prev;
        // delete at the head
        if (current == headNode)
            headNode = next;
        return data;
    }

    
    public int size() {
    /** This method calculates the size of the linked list and returns the value **/
        if (headNode == null)
            return 0;
        Node current = headNode;
        int listSize = 0;
        while (current != null) {
            listSize++;
            current = current.nextNode;
        }
        return listSize;
    }

    public boolean isSorted() {
    /** This method checks to see if the list has been sorted fully **/
        if (headNode == null || headNode.nextNode == null)
            return true;
        Node sorting = headNode.nextNode;
        while (sorting != null) {
            if (sorting.getValue() < sorting.getPrevNode().getValue())
                return false;
            sorting = sorting.nextNode;
        }
        return true;
    }
    
    public void sortInsert(int data) {
    /** This method adds the data from the the array in a sorted order **/    
        Node current = headNode;
        Node newNode = new Node(data);
        //If the list is empty
        if (headNode == null) {
            addAtHead(data);
        }
        else {
            //Stops when the data to be added is smaller than current.nextNode
            //and inserts at that point
            while (current.nextNode != null && current.value < data) {
                current = current.nextNode;
            }
            //If inserting at the end, use addAtTail method instead.
            if (current.nextNode ==  null){
                addAtTail(data);
            }
            //If inserting at the start, use addAtHead method instead.
            else if (current.prevNode == null){
                addAtHead(data);
            }
            else {      
                //Otherwise use regular adding operation.
                newNode.nextNode = current.nextNode;
                current.nextNode = newNode;
                current.prevNode = newNode;
                newNode.prevNode = current;
                //Set buffer to trace, to be printed in DSA_CW
                buffer = ("I" + data + "A" + newNode.prevNode.value 
                + "B" + newNode.nextNode.value);
            
            }  
        }
    }
    
    public boolean isEmpty() {
    /** This method checks to see if the linked list is empty, returning a boolean **/
        return (headNode == null);
    }
    

    public String toString() {
    /** This method allows the user to print the linked list if needed. **/
        Node current = headNode.getNextNode();
        String output = "";
        while (current != null) {
            output += "[" + current.getValue() + "]";
            current = current.getNextNode();
        }
        return output;
    }
 }
