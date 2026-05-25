//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    private static boolean helper(BSTNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.elem <= min) { //violates lower bound
            return false;
        }

        if (max != null && root.elem >= max) {
            return false;
        }

        //left child must be < current
        boolean left = helper(root.left, min, root.elem);

        // right child must be > current
        boolean right = helper(root.right, root.elem, max);

        if (left == true && right == true) {
            return true;
        }
        else {
            return false;
        }

    }
    
    
    public static Boolean isBST( BSTNode root ){
        boolean isBST = helper(root, null, null);
        return isBST;
    }
    //===============================================================


}
