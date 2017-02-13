class LinkedList {
    // reference to the head node.
    private Node head;
    private int listSize;
    private Node tail;
    private Node node;
 
    // LinkedList constructor
    public void LinkedList() {

        head = new Node(0);
        listSize = 0;
    }
 
    public void add(int data) {
    // appends the element containing the parameter value called 'data' to the end of the list.
        
        Node temp = new Node(data);
        Node current = head;
        // browse the list from the head node to the end of the list
        while (current.getNext() != null) {
            current = current.getNext();
        }
        System.out.println("Adding: " + data);
        // assigns the last node's "next" reference to the new node called 'temp'
        current.setNext(temp);
        listSize++;// increment the LinkedList size attribute
    }
    public void moveForward() {
        System.out.println("Moving forwards..");
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
        }
    }
    
    public void moveBackward() {
        System.out.println("Moving backwards..");
        Node temp = tail;
        while(temp != null) {
            temp = temp.prev;
        }
    }
 
    public void add(int data, int index)
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
    
    public Node insertNode(int data) {
    if (node == null)
        return null;

    // Make the first node the start of the sorted list.
    Node sortedList = node;
    node = node.next;
    sortedList.next = null;

    while(node != null) {
        // Advance the nodes.
        final Node current = node;
        node = node.next;

        // Find where current belongs.
        if (current.data < sortedList.data) {
            // Current is new sorted head.
            current.next = sortedList;
            sortedList = current;
            listSize++;
        } 
        else {
            // Search list for correct position of current.
            Node search = sortedList;
            while(search.next != null && current.data > search.next.data)
                search = search.next;

            // current goes after search.
            current.next = search.next;
            search.next = current;
            listSize++;
            }
        }

    return sortedList;
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
            output += "[" + current.getData() + "]";
            current = current.getNext();
        }
        return output;
    }
}
