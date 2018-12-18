public class Location
{
   
        public static final int UNGUESSED = 0;
        public static final int HIT = 1;
        public static final int MISSED = 2;
        private int locationStatus;
        private boolean shipThere;
        
        
        public Location() {
            locationStatus = 0;
           
        }
        // Was this Location a hit?
        public boolean checkHit(){
            if (locationStatus == 0) {
                return true;
            }
            return false;
        }
        
        // Was this location a miss?
        public boolean checkMiss(){
            if (locationStatus == MISSED) {
                return true;
            }
            return false;
        }

        // Was this location unguessed?
        public boolean isUnguessed(){
            if (locationStatus == UNGUESSED) {
                return true;
            }
            return false;
        }
        
        // Mark this location a hit.
        public void markHit(){
            locationStatus = HIT;
        }
        
        // Mark this location a miss.
        public void markMiss(){
             locationStatus = MISSED;
        }
        
        // Return whether or not this location has a ship.
        public boolean hasShip(){
          if (shipThere == true) {
              return true;
          }
          return false;
            
        }
        
        // Set the value of whether this location has a ship.
        public void setShip(boolean val){
            shipThere = true;
        }
        
        // Set the status of this Location.
        public void setStatus(int status){
            locationStatus = status;
        }
        
        // Get the status of this Location.
        public int getStatus(){
             
              return locationStatus;
        }
                
}
