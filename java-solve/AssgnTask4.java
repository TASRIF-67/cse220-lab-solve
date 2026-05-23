//Assignment Task 04: Rotate Secret
class AssgnTask4{

    static void rotateLayerClockwise(Character[][] board, int layer, int n) {
        int top = layer;
        int bottom = n - 1 - layer;
        int left = layer;
        int right = n - 1 - layer;

        char temp = board[top][left]; // save top-left

        // shift left col up
        for (int i = top; i < bottom; i++)
            board[i][left] = board[i+1][left];

        // shift bottom row left
        for (int j = left; j < right; j++)
            board[bottom][j] = board[bottom][j+1];

        // shift right col down
        for (int i = bottom; i > top; i--)
            board[i][right] = board[i-1][right];

        // shift top row right
        for (int j = right; j > left; j--)
            board[top][j] = board[top][j-1];

        board[top][left+1] = temp;

    }

    
    public static void rotateSecret( Character[][] board ){
        int n = board.length;
        int numLayers = n / 2;

        for (int layer=0; layer < numLayers; layer++){
            int rot = numLayers - layer;
            for (int r = 0; r < rot; r++) {
                rotateLayerClockwise(board, layer, n);
            }
        }

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        System.out.print("===========Test#1===========\n");
        Character[][] board = {
          {'T','A','U','S'},
          {'A','R','I','.'},
          {'D','T','T','N'},
          {'S','C','F','U'}
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        Character[][] outputBoard = {
            {'D','A','T','A'},
            {'S','T','R','U'},
            {'C','T','I','S'},
            {'F','U','N','.'}
        };
        System.out.print("DATASTRUCTISFUN.\n");
        Arr.print2D(outputBoard);
        
        System.out.print("\nYour Output:\n");
        rotateSecret( board );
        Arr.print2D(board);
        
        if( Arr.compare2D(outputBoard, board) ) System.out.print("Test 1 Success");
        else System.out.println("Test 1 FAILED");
        
        System.out.print("\n===========Test#2===========\n");

        board = new Character[][]{
          {'O','R','I','R','N','P'},
          {'G','S','A','A','L','R'},
          {'L','M','N','O','N','Y'},
          {'A','H','U','O','O','P'},
          {'T','F','C','T','H','S'},
          {'E','D','Y','O','C','K'}
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        outputBoard = new Character[][]{
            {'A','L','G','O','R','I'},
            {'T','H','M','S','A','R'},
            {'E','F','U','N','A','N'},
            {'D','C','O','O','L','P'},
            {'Y','T','H','O','N','R'},
            {'O','C','K','S','P','Y'}
        };
        System.out.print("ALGORITHMSAREFUNANDCOOLPYTHONROCKSPY\n");
        Arr.print2D(outputBoard);
        
        System.out.print("\nYour Output:\n");
        rotateSecret( board );
        Arr.print2D(board);
        
        if( Arr.compare2D(outputBoard, board) ) System.out.print("Test 2 Success");
        else System.out.println("Test 2 FAILED");
    }
}
