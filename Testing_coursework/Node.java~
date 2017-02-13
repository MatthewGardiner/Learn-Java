class Node {
        // data carried by this node could be of any type (to be casted later).\
        
        int data;
        
        // this attribute provides the reference to the next node (or null if there isn't one).
        Node next;
        Node prev;
        // Node constructor
        public Node(int value) {
            next = null;
            int data = value;
        }
        
        // another Node constructor  that adds on top of an existing node.
        public Node(int value, Node nextNode, Node prevNode) {
            next = nextNode;
            int data = value;
            prev = prevNode;
        }
 
        public int getData() {
            return data;
        }
 
        public void setData(int value) {
            int data = value;
        }
 
        public Node getNext() {
            return next;
        }
 
        public void setNext(Node nextNode) {
            next = nextNode;
        }
        
        public Node getLast() {
            return prev;
        }
        
        public void setLast(Node prevNode) {
            prev = prevNode;
        }
    }
