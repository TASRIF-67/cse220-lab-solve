//Assignment Task 02: Matrix Compression
class AssgnTask2{

    
    public static Integer[][] compressMatrix( Integer[][] matrix ){

        int row = matrix.length;
        int col = matrix[0].length;

        int dim = row / 2;

        Integer[][] new_arr = new Integer[dim][dim];

        for (int i = 0; i < row; i += 2) {
            for (int j = 0; j < col; j += 2) {
                int total = matrix[i][j] + matrix[i+1][j] + matrix[i][j+1] + matrix[i+1][j+1];
                new_arr[i/2][j/2] = total;
            }
        }
        
        return new_arr;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}
