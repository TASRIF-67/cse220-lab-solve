//LAB TASK NO NEED TO SUBMIT
public class Task5 {

        //===================================TASK#4===================================
        // This method takes 1 parameter, the root
        // This method returns the largest value
        // No Helper Methods are needed for this task
        public static Integer maxTree( BTNode root ){
            if (root == null) {
                return null;
            }

            int curr = (Integer) root.elem;
            
            Integer leftVal = maxTree(root.left);
            Integer rightVal = maxTree(root.right);

            Integer max = curr;
            
            // check null because subtree may not exist

            if (leftVal != null && leftVal > max) {
                max = leftVal;
            } 

            if (rightVal != null && rightVal > max) {
                max = rightVal;
            }

            return max;
        }
        //============================================================================


}
