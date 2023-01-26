public class ElonsToyCar {
    private int meters;
    private int percentage;

    ElonsToyCar(){
        this.meters = 0;
        this.percentage = 100;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", meters);
    }

    public String batteryDisplay() {
        if (percentage == 0){
            return "Battery empty";
        } else {
            return String.format("Battery at %d%%", percentage);
        }
    }

    public void drive() {
        if (this.percentage != 0 ){
            this.meters += 20;
            --this.percentage;
        }
    }
}
