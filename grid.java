public class Grid
{
    private Location[][] grid;

   // Constants for number of rows and columns.
   // every board cna only have 10 rows and 10 columns 
   public static final int NUM_ROWS = 10;
   public static final int NUM_COLS = 10;
   // Create a new Grid. Initialize each Location in the grid
// to be a new Location object.
public Grid(){
    grid = new Location[NUM_COLS][NUM_ROWS];
    // looping through the rows and columns  
    // making every row and column a new location object
    for(int x = 0; x < NUM_ROWS;x++) {
        for(int y =0; y < NUM_COLS;y++) {
            grid[y][x] = new Location();
        }
    }
    
}

// Mark a hit in this location by calling the markHit method
// on the Location object.  
public void markHit(int row, int col){
    grid[col][row].markHit();
}
// using markmiss form location class
// Mark a miss on this location.    
public void markMiss(int row, int col){
    grid[col][row].markMiss();
}
// using setStatus from location class 
// Set the status of this location object.
public void setStatus(int row, int col, int status){
    grid[col][row].setStatus(status);
}
// using getStatus from location class 
// Get the status of this location in the grid  
public int getStatus(int row, int col){
    return grid[col][row].getStatus();
}
// using isUnguessed from location class 
// Return whether or not this Location has already been guessed.
public boolean alreadyGuessed(int row, int col)  {
    return !grid[col][row].isUnguessed();
}  
// using setShip from location class 
// Set whether or not there is a ship at this location to the val   
public void setShip(int row, int col, boolean val){
    grid[col][row].setShip(val);
    printShips();
    
}
// using hasShip from location 
// Return whether or not there is a ship here   
public boolean hasShip(int row, int col){
    return grid[col][row].hasShip();
}

// using nothing from location class 
// Get the Location object at this row and column position
public Location get(int row, int col){
    return  grid[col][row];
}

// Return the number of rows in the Grid
public int numRows(){
    return NUM_ROWS;
}

// Return the number of columns in the grid
public int numCols(){
    return NUM_COLS;
}


// Print the Grid status including a header at the top
// that shows the columns 1-10 as well as letters across
// the side for A-J
// If there is no guess print a -
// If it was a miss print a O
// If it was a hit, print an X
// A sample print out would look something like this:

public void printStatus(){
    String[] rows = {"A","B","C","D","E","F","G","H","I","J"};
    // prints 1-10 horizantalily 
    // 1 2 3 4 5 6 7 8 9 10
    for (int i = 0; i < NUM_COLS; i++) {
        if (i != 9) {
        System.out.print((i + 1) + " ");
        }
        else System.out.print(i+1);
    }
    System.out.println("");
    // prints the array "rows" verticalily 
    for (int y = 0; y < NUM_ROWS; y++) {
        System.out.print(rows[y] + " ");
        for (int x = 0; x < NUM_COLS; x++) {
            if (grid[x][y].hasShip()) {
                System.out.print("X ");
            }
            else System.out.print("- ");
        }
        System.out.println("");
    }

}

// Print the grid and whether there is a ship at each location.
// If there is no ship, you will print a - and if there is a
// ship you will print a X. You can find out if there was a ship
// by calling the hasShip method.

public void printShips(){
  
  String[] rows = {"A","B","C","D","E","F","G","H","I","J"};
    // prints 1-10 horizantalily 
    // 1 2 3 4 5 6 7 8 9 10
    for (int i = 0; i < NUM_COLS; i++) {
        if (i != 9) {
        System.out.print((i + 1) + " ");
        }
        else System.out.print(i+1);
    }
    System.out.println("");
    // prints the array "rows" verticalily 
    for (int y = 0; y < NUM_ROWS; y++) {
        System.out.print(rows[y] + " ");
        for (int x = 0; x < NUM_COLS; x++) {
            if (grid[x][y].hasShip()) {
                System.out.print("X ");
            }
            else System.out.print("- ");
        }
        System.out.println("");
    }
}
}
