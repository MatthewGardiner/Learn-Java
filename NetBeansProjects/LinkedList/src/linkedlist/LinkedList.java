class LinkedList {
    // reference to the head node.
    public Node head;
    private int listSize;
 
    // LinkedList constructor
    public LinkedList() {
        // creates an empty list: the reference to the head node is set to a new NULL node with no data
        head = new Node(null);
        listSize = 0;
    }
 
    public void add(Object data)
    // appends the element containing the parameter value called 'data' to the end of the list.
    {
        Node temp = new Node(data);
        Node current = head;
        // browse the list from the head node to the end of the list
        while (current.getNext() != null) {
            current = current.getNext();
        }

        // assigns the last node's "next" reference to the new node called 'temp'
        current.setNext(temp);
        listSize++;// increment the LinkedList size attribute
    }
    
    public Object insertAfter (Node newNode, Node prevNode) {
        if (prevNode.next != null) {
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        else {
            newNode.next =  null;
        }
        
        return newNode.data;
    }
    

    
    
    public void add(Object data, int index)
    // inserts the specified element at the specified position in this list
    {
        Node temp = new Node(data);
        Node current = head;
        // browses to the requested index or the last element in the list,
        // whichever comes first\
        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        // set the new node's next-node reference to this node's next-node
        // reference
        temp.setNext(current.getNext());
        // now sets this node's next-node reference to the new node
        current.setNext(temp);
        listSize++;// updates i.e. increments the number of elements attribute
    }
 
    public Object get(int index)
    // getter returns the element at the specified position in this list.
    {
        // index must be 1 or higher
        if (index <= 0)
            return null;
 
        Node current = head.getNext(); 
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null)
                return null;
            current = current.getNext();
        }
        return current.getData();
    }
  
    public Object removeAfter (Node prevNode) {
        if (prevNode.next == null)
            return false;
        
        prevNode.setNext(prevNode.getNext().getNext());
        listSize--;
        return true;
            
            
        
    }
    
    
    public boolean remove(int index)
    // removes the element at the specified position from the list.
    {
        // if the index is out of range, exit; exception can also be used
        if (index < 1 || index > size())
            return false;

        //browses the list to the index element
        Node current = head;
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null)
                return false;
          current = current.getNext();
        }
       // reached the 'index-1' node of the list, and links it with the node following its next neighbour
        current.setNext(current.getNext().getNext());
        listSize--; // decrements the 'size' attribute
        return true;
    }

   public int size()
    // returns the number of elements in the list.
    {
        return listSize;
    }

    public String toString() {
        Node current = head.getNext();
        String output = "";
        while (current != null) {
            output += "[" + current.getData().toString() + "]";
            current = current.getNext();
        }
        return output;
    }
 }
