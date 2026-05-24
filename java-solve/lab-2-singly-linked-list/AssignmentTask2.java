// AssignmentTask2: Organize Books
import java.util.Arrays;
public class AssignmentTask2{

    
    
    // MUST SUBMIT this method
    public static Node organizeBooks(Node head, Integer[] popularity) {
        if (head == null || head.next == null ) {
            return head;
        }

        Node curr1 = head;
        int i = 0;
        
        while (curr1 != null) {
            Node maxNode = curr1;
            int maxIdx = i;
            Node curr2 = curr1.next;
            int j = i + 1;

            while (curr2 != null) {
                if (popularity[j] > popularity[maxIdx]) {
                    maxNode = curr2;
                    maxIdx = j;
                }
                curr2 = curr2.next;
                j++;
            }

            //Swap elems in list
            Object temp = curr1.elem;
            curr1.elem = maxNode.elem;
            maxNode.elem = temp;

            //Swap elems in arr
            int temp2 = popularity[i];
            popularity[i] = popularity[maxIdx];
            popularity[maxIdx] = temp2;

            i++;
            curr1 = curr1.next;

        }

        return head; 
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT MAKE ANY MODIFICATIONS IN THE TESTER CODE BELOW
    //DO NOT SUBMIT THE DRIVER CODE BELOW
    public static void main(String[] args) {
        System.out.println("=================Test Case 1=================");
        Node books = LinkedList.createList(new String[]{"Dune", "IT", "Coraline", "Inferno", "Twlight"});
        Integer[] arr = { 8, 10, 5, 10, 6 };

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books);
        System.out.println(Arrays.toString(arr));
        
        System.out.println("\nExpected Output");
        System.out.println("IT -> Inferno -> Dune -> Twilight -> Coraline");
        
        System.out.println("Your Output");
        books = organizeBooks( books, arr );
        LinkedList.printLL(books);

       
        System.out.println("=================Test Case 2=================");
        Node books2 = LinkedList.createList(new String[]{"Hamlet", "Persuasion", "It", "Dracula", "Beloved"});
        Integer[] arr2 = {7, 9, 9, 6, 7};

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("\nExpected Output");
        System.out.println("Persuasion -> It -> Hamlet -> Beloved -> Dracula");

        System.out.println("Your Output");
        books2 = organizeBooks(books2, arr2);
        LinkedList.printLL(books2);


        System.out.println("=================Test Case 3=================");
        Node books3 = LinkedList.createList(new String[]{"Matilda", "Franny", "Foundation", "Carrie", "Misery"});
        Integer[] arr3 = {5, 8, 8, 10, 6};

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("\nExpected Output");
        System.out.println("Carrie -> Franny -> Foundation -> Misery -> Matilda");

        System.out.println("Your Output");
        books3 = organizeBooks(books3, arr3);
        LinkedList.printLL(books3);

    }
}
