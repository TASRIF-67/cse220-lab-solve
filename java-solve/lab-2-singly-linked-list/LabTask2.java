// LabTask2: Word Decoder
public class LabTask2 {
    
    static int countNodes(Node head) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count += 1;
            temp = temp.next;
        }

        return count;
    }

    public static Node wordDecoder( Node head ){
        int numNodes = countNodes(head);
        int idx = 13 % numNodes;
        int currIdx = 0;
        Node temp = head;
        Node newHead = null;

        while (temp != null) {
            if (currIdx !=  0 && currIdx % idx == 0) {
                Node newNode = new Node(temp.elem);
                newNode.next = newHead;
                newHead = newNode;
            }
            currIdx++;
            temp = temp.next;
        }

        Node dummy = new Node(null);
        dummy.next = newHead;

        return dummy;
        
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
