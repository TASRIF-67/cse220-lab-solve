//LAB TASK NO NEED TO SUBMIT
public class Task4 {

        //===================================TASK#4===================================
       
        public static void printLeafNodes( BTNode root ){
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                System.out.print(root.elem + " ");
            }
            printLeafNodes(root.left);
            printLeafNodes(root.right);
        }
        //============================================================================


}
