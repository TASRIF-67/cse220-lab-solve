// Complete the swapChild method
//ASSIGNMENT TASK MUST SUBMIT
public class Task8 {

    //===================================TASK#4===================================
    public static void swapChild( BTNode root, int lvl, int M ){
        if (root == null) {
            return ;
        }

        if ( lvl < M) {
            BTNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }

        swapChild(root.left, lvl+1, M);
        swapChild(root.right, lvl+1, M);

    }
    //============================================================================
}
