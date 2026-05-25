// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT
public class Task7 {

    //===================================TASK#6===================================
   
    private static Integer levelSumHelper(BTNode root, int level) {
        if (root == null) {
            return 0;
        }
        if (level % 2 == 0) {
            return - (Integer) root.elem + levelSumHelper(root.left, level+1) + levelSumHelper(root.right, level+1);
        }
        else {
           return  (Integer) root.elem + levelSumHelper(root.left, level+1) + levelSumHelper(root.right, level+1);
        }
    }
    
    public static Integer levelSum( BTNode root ){
        if (root == null) {
            return null;
        }

        int sum = levelSumHelper(root, 0);
        return sum;
    }
    //============================================================================

}
