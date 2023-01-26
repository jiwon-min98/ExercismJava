import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDateTime datetime;
    public Gigasecond(LocalDate moment) {
        this.datetime = moment.atTime(0,0);
    }

    public Gigasecond(LocalDateTime moment) {
        this.datetime = moment;
    }

    public LocalDateTime getDateTime() {
        return this.datetime.plusSeconds(1000000000);
    }
}
