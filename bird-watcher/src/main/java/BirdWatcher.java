import java.util.Arrays;
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if (birdsPerDay.length -1< 0) return 0;
        else return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++ ;
    }

    public boolean hasDayWithoutBirds() {
        for (int i : birdsPerDay){
            if (i ==0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        if (numberOfDays > birdsPerDay.length) numberOfDays = birdsPerDay.length;
        for (int i=0; i < numberOfDays; i++){
            total += birdsPerDay[i];
        }
        return total;
    }

    public int getBusyDays() {
        int days = 0;
        for (int i : birdsPerDay){
            if (i >= 5) days++;
        }
        return days;
    }
}
