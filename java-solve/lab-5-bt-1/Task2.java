//LAB TASK NO NEED TO SUBMIT
public class Task2 {

    //===================================TASK#2===================================
    // This method takes only 1 parameters root
    // This method return total count of the nodes in the tree

    public static int countNodes( BTNode root ){
        if (root == null) {
            return 0;
        }
      int left = countNodes(root.left);
      int right = countNodes(root.right);
      return 1 + left + right;
    }
    //============================================================================

}
