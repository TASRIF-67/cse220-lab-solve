//Before starting to work on this design the Tree in the Tester code 
// Complete the sumOfLeaves method

public class Task3 {

    //===================================TASK#2===================================

    //helper method
    private static String helper(BSTNode root, Integer key) {
        if (root == null) {
            return null;
        }

        if (root.elem.equals(key)) {
            return  "" + root.elem;
        }

        String subPath;    
        if (key < root.elem) {
            subPath = helper(root.left, key);
        } else {
            subPath = helper(root.right, key);
        }

        if (subPath == null) {
            return null; // key not in this branch
       }

       return root.elem + " " + subPath;


    }
    
    public static String findPath( BSTNode root, Integer key ){
       
        String res = helper(root, key);

        if (res == null) {
            return "No Path Found";
        }

        return res;

    }
    //============================================================================

}

/*
public static String findPath(BSTNode root, Integer key) {
    String path = "";
    BSTNode current = root;

    while (current != null) {
        path += current.elem + " ";     // build path as we go

        if (current.elem.equals(key)) {
            return path.trim();         // remove trailing space
        } else if (key < current.elem) {
            current = current.left;
        } else {
            current = current.right;
        }
    }

    return "No Path Found";
}
*/