//LAB TASK NO NEED TO SUBMIT
public class Task1 {

    //======================TASK#1_1======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree pre-order
    public static void preOrder( BTNode root ){
        if (root == null) {
            return; 
        }
        System.out.print(root.elem + " ");
        preOrder(root.left);
        preOrder(root.right);

    }
    //==================================================

    //======================TASK#1_2======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree in-order
    static void postOrderHelper(BTNode root, int level) {
        if (root == null) {
            return;
        }
        postOrderHelper(root.left, level + 1);
        postOrderHelper(root.right, level + 1);
        System.out.println(root.elem + " : " + level);
    }

    public static void postOrderLvl( BTNode root ){
        if (root == null) {
            return;
        }
        postOrderHelper(root, 0);

    }
    //==================================================

    //======================TASK#1_3======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree in-order
    static void inOrderHelper(BTNode root, int level) {
        if (root == null) {
            return ;
        }
        inOrderHelper(root.left, level + 1);

        if (level % 2 == 0) {
            System.out.println(root.elem + " : " + level);
        }

        inOrderHelper(root.right, level + 1);
    }

    public static void inOrderEvenLvl( BTNode root ){
       if (root == null) {
        return ;
       }

       inOrderHelper(root, 0);
    }
    //==================================================

}
