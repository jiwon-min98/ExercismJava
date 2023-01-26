class NeedForSpeed {
    private int battery = 100;
    private int speed;
    private int batteryDrain;
    private int distance = 0;

    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (!batteryDrained()){
            this.battery -= this.batteryDrain;
            this.distance += this.speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    public RaceTrack(int distance){
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while(!car.batteryDrained() && car.distanceDriven() < distance){
            car.drive();
        }
        //car.drive();
        if(car.distanceDriven() >= distance) return true;
        else return false;
    }
}
