import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1, ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> rankedCars = new ArrayList<>();
        rankedCars.add(prc1);
        rankedCars.add(prc2);
        return rankedCars.stream().sorted().collect(Collectors.toList());
    }
}
