class Node {
        // data carried by this node could be of any type (to be casted later).\
        Object data;
        // this attribute provides the reference to the next node (or null if there isn't one).
        Node next;
        Node current;
        // Node constructor
        public Node(Object value) {
            next = null;
            data = value;
        }
 
        // another Node constructor  that adds on top of an existing node.
        public Node(Object value, Node nextNode, Node prevNode) {
            next = nextNode;
            data = value;
            current = prevNode;
        }
        
        public Object getData() {
            return data;
        }
 
        public void setData(Object value) {
            data = value;
        }
 
        public Node getNext() {
            return next;
        }
 
        public void setNext(Node nextNode) {
            next = nextNode;
        }
    }
