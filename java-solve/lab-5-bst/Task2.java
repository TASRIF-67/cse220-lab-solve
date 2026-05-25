//Before starting to work on this design the Tree in the Tester code 
// Complete the lowestCommonAncestor method
public class Task2 {

    //======================TASK#1======================
    // This method takes only 3 parameter first one is root
    // and second & third parameter are as 2 integers
    // You'll need to find the lowest common ancestor of them and return it
    public static Integer lowestCommonAncestor( BSTNode root, Integer x, Integer y ){
       if (root == null) {
        return null;
       }

       int curr = (Integer) root.elem;
       // if x and y both smaller -> go lfet
       // x and y both larger > go right
       // otherwise the current node isthe LCA (split here)

       if (x < curr && y < curr) {
        return lowestCommonAncestor(root.left, x, y);
       }
       else if ( x > curr && y > curr) {
        return lowestCommonAncestor(root.right, x, y);
       }
       else {
        return curr; 
       }
    }
    //==================================================

}
