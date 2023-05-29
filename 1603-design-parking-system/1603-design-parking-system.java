class ParkingSystem {
    private static int big;
    private static int medium;
    private static int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        boolean isValid = false;
        switch (carType) {
            case 1:
                isValid = (big-- > 0) ? true : false;
                break;
            case 2:
                isValid = (medium-- > 0) ? true : false;
                break;
            case 3:
                isValid = (small-- > 0) ? true : false;
                break;
        }
        return isValid;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */