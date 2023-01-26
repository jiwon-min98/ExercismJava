public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double a = speed * 221;
        if (speed >= 1 && speed <= 4){
            return a;
        } else if(speed >=5 && speed <=8){
            return a * 0.9;
        } else if(speed == 9){
            return a*0.8;
        } else if (speed == 10){
            return a*0.77;
        } else {
            return 0;
        }

    }

    public int workingItemsPerMinute(int speed) {
        return ((int)productionRatePerHour(speed)/60);
    }
}
