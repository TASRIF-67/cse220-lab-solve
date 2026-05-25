//Before starting to work on this design the Tree in the Tester code 
// Complete the lowestCommonAncestor method
public class Task1 {

    //======================TASK#1a======================
    // This method takes only 1 parameter; root of a BST
    // You'll need to find the max of the BST and return it
    public static Integer maxOfBST( BSTNode root ){
        if (root == null) {
            return null;
        }
        if (root.right == null) {
            return (Integer) root.elem;
        }
        
        return maxOfBST(root.right);
    }
    //==================================================

    //======================TASK#1b======================
    // This method takes only 2 parameters
    // root of a BST and the value of which you wanna the predecessor
    // You'll need to find the max of the BST and return it
    public static Integer inOrderPred( BSTNode root, Integer x ){
        if (root == null) {
            return null;
        }

        int curr = (Integer) root.elem;

        if (x <= curr) {
            // must be in left subtree
            return inOrderPred(root.left, x);
        } else {
            Integer rightRes = inOrderPred(root.right, x);
            if (rightRes != null) {
                return rightRes ;
            } else {
                return curr;
            }
        }

    }
    //==================================================
}
/*
without recursion
//====================
//1a
//===================
public static Integer maxOfBST(BSTNode root) {
    if (root == null) return null;

    BSTNode current = root;
    while (current.right != null) {
        current = current.right;
    }
    return (Integer) current.elem;
}
//====================
//1b
//===================
public static Integer inOrderPred(BSTNode root, int key) {
    if (root == null) return null;

    BSTNode current = root;
    BSTNode predecessor = null;

    while (current != null) {
        int curr = (Integer) current.elem;

        if (key <= curr) {
            // go left, current is not a candidate
            current = current.left;
        } else {
            // current is a candidate, save it and go right
            predecessor = current;
            current = current.right;
        }
    }

        if (predecessor == null) {
            return null;
        } else {
            return (Integer) predecessor.elem;
        }
}
*/