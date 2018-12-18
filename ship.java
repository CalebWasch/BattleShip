public class Ship
{
       private int row;
       private int col;
       private int length;
       private String direction;
      
       public static final int UNSET = -1;
       public static final int HORIZONTAL = 0;
       public static final int VERTICAL = 1;
      // Constructor. Create a ship and set the length.
       public Ship(int l){
           length = l;
           row = UNSET;
           col = UNSET;
       }
       // set the location of the ship
       public void setLocation(int r, int c){
           row = r;
           col = c;
       }
      // set the direction of the ship
       public void setDirection(int d){
          if(d == HORIZONTAL){
              direction = "horizontal";
          }
           if(d == VERTICAL){
              direction = "vertical";
          } if (d == UNSET){
              direction = "unset";
          }
         // returns rows
       }
       public int getRows(){
           return row;
       }
       // returns columns
       public int getCol(){
           return col;
       }
       // returns length
       public int getLength(){
           return length;
       }
       // returns the direction
       public int getDirection(){
           if (direction == "horizontal"){
               return HORIZONTAL;
           }
           if(direction == "vertical"){
               return VERTICAL;
           }
           return UNSET;
       }
      // direction toString
    private String directionToString(){
         if(direction == null){
             return "unset direction";
         }
         return direction;
      }
      // direction toString
       private String locationToString(){
           if(this.isLocationSet() == false){
           return "unset location";
           }
           return  row + ", " + col;
       }
       // regular toString
       public String toString(){
           return directionToString() + " ship of length " + length + " at " + "(" + locationToString() + ")";
       }
      
      // Has the location been initialized
       public boolean isLocationSet(){
           if (row == -1 || col == -1){
               return false;
           }
           return true;
       }
       // Has the direction been initialized
       public boolean isDirectionSet(){
           if (direction == null){
               return false;
           }
           return true;
       }

}
