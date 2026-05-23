//Assignment Task 03: Game Arena
class AssgnTask3{

    
    public static void playGame( Integer[][] arena ){
        
        int row = arena.length;
        int col = arena[0].length;
        int total = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arena[i][j]%50 == 0 && arena[i][j] != 0) {
                
                    if (i < row-1 && arena[i+1][j] == 2)// check below
                        total += 2;
                    if (i >= 1 && arena[i-1][j] == 2) // check above
                        total += 2;
                    if (j < col-1 && arena[i][j+1] == 2) // check right
                        total += 2;
                    if (j >= 1 && arena[i][j-1] == 2)// check left
                        total += 2;
                }
            }
        }

        if (total > 10) 
            System.out.println("Points Gained: " + total + ". Your team has survived the game.");
        else
            System.out.println("Points Gained: " + total + ". Your team is out.");
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}
