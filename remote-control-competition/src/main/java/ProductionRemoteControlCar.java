class ProductionRemoteControlCar {
    private int speed;
    private int distance;
    private int victories;

    public ProductionRemoteControlCar(){
        this.speed = 10;
    }
    public void drive() {
        this.distance += this.speed;
    }

    public int getDistanceTravelled() {
        return this.distance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.victories = numberofVictories;
    }

    @Override
    public int compareTo(Object obj){
        ProductionRemoteControlCar otherRCCar = (ProductionRemoteControlCar) obj;
        return this.numberOfVictories - otherRCCar.numberOfVictories;
    }
}
