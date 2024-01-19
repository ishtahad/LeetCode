class ParkingSystem {
     int bigCar = 0;
     int mediumCar = 0;
     int smallCar = 0;
    public ParkingSystem(int big, int medium, int small) {
        bigCar = big;
        mediumCar = medium;
        smallCar = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1){
            if(bigCar > 0 ){
                bigCar--;
                return true;
            }else{
                return false;
            }
        }
        if(carType == 2){
            if(mediumCar > 0 ){
                mediumCar--;
                return true;
            }else{
                return false;
            }
        }
        if(carType == 3){
            if(smallCar > 0 ){
                smallCar--;
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */