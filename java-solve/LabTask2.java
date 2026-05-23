//Lab Task 02: Decryption Process
class LabTask2{

    public static Integer[] decryptMatrix( Integer[][] matrix ){

        int row = matrix.length;
        int col = matrix[0].length;

        Integer[] new_arr = new Integer[col-1];

        for (int i = 1; i < col ; i++) {
            int prev_sum = 0;
            int curr_sum = 0;

            for (int j = 0; j < row; j++) {
                prev_sum += matrix[j][i-1];
                curr_sum += matrix[j][i];
            }

            new_arr[i-1] = curr_sum - prev_sum;


        }
        
    return new_arr;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}
