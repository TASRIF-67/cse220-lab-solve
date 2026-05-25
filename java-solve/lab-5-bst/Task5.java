//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

    //===================================TASK#5======================
    private static Integer helper(BSTNode left, BSTNode right) {
        // both absent, nothing to add
        if (left == null && right == null) {
            return 0; 
        }

        // one absent, no mirror pair
        if (left == null || right == null) {
            return 0;
        }

        // outer nodes symmetry
        Integer outer = helper(left.left, right.right);

        // Inner nodes symmetry
        Integer inner = helper(left.right, right.left);
        
        // total sum 
        Integer sum = left.elem + right.elem + outer + inner;
        return sum;
    }

    public static Integer mirrorSum( BSTNode root ){
        if (root == null) {
            return 0;
        }

        return helper(root.left, root.right);
    }
    //===============================================================


}
