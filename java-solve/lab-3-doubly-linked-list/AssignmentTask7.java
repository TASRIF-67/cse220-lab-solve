public class AssignmentTask7 {

    
    public static void rangeMove(DNode dh, int start, int end) {
        DNode rangeHead = null;
        DNode rangeTail = null;

        DNode curr = dh.next;

        while (curr != dh) {
            DNode nextNode = curr.next;

            if (start <= (Integer)curr.elem  && (Integer)curr.elem <= end) {
                //detach curr from the main list
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;

                if (rangeHead == null) {
                    rangeHead = curr;
                    rangeTail = curr;
                    curr.next = null;
                    curr.prev = null;
                } else {
                    rangeTail.next = curr;
                    curr.prev = rangeTail;
                    curr.next = null;
                    rangeTail = curr;
                }


            }

            curr = nextNode;
        }

        DNode lastNode = dh.prev;
        lastNode.next = rangeHead;
        rangeHead.prev = lastNode;

        rangeTail.next = dh;
        dh.prev = rangeTail;


    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {5, 3, 7, 1, 9, 6, 2, 4};
        DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

        System.out.println("\nExpected Output:");
        Object[] expected = {3, 1, 9, 2, 4, 5, 7, 6};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);
        
        //Running the Range Move with [5,7] range 
        rangeMove(dh, 5, 7);
        //Printing after Range Move
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
    }
}
