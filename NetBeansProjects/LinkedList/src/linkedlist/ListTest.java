class ListTest {
public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        // add elements to LinkedList myList
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");

        Node newNode = new Node(5);
     
        myList.insertAfter(newNode, myList.head.next);
        myList.removeAfter(prevNode, myList.head.next);
        /*\
         * Please note that primitive values can not be added into LinkedList\
         * directly. They must be converted to their corresponding wrapper\
         * class.\
         */

        System.out.println("myList content: " + myList);
        System.out.println("myList.size() returns the list size: " + myList.size());
        System.out.println("myList.get(3) - gets the 3rd element: " + myList.get(3));
        System.out.println("myList.remove(2) - removes the 2nd element: " + myList.remove(2));
        System.out.println("myList.get(3) - gets the 3rd element: " + myList.get(3));
        System.out.println("myList.size() returns the list size: " + myList.size());
        System.out.println("myList content: " + myList);
        //myList.add("10",3);
        System.out.println("myList content: " + myList);
        //myList.add("0",0);
        System.out.println("myList content: " + myList);
    }
 }

