// Complete the subtractSummation method
//ASSIGNMENT TASK MUST SUBMIT
public class Task6 {

    //===================================TASK#5===================================
    private static Integer subtreeSum(BTNode root) {
        if (root == null) {
            return 0;
        }

        return (Integer) root.elem + subtreeSum(root.left) + subtreeSum(root.right);
    }
    
    public static Integer subtractSummation( BTNode root ){
        if (root == null) {
            return 0;
        }

        int leftSubSum = subtreeSum(root.left);
        int rightSubSum = subtreeSum(root.right);

        return leftSubSum - rightSubSum;

    }
    //============================================================================

}
