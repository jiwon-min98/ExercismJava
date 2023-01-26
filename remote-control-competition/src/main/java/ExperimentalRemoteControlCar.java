public class ExperimentalRemoteControlCar implements RemoteControlCar{
    private int distance =0;
    private int speed;

    public ExperimentalRemoteControlCar(){
        this.speed = 20;
    }

    public void drive() {
        this.distance += this.speed;
    }

    public int getDistanceTravelled() {
        return this.distance;
    }
}
