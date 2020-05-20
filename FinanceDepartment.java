import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class FinanceDepartment extends Department {

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        if (day.getDayOfWeek().equals(DayOfWeek.SUNDAY) || day.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
            return false;
        } else {
            return true;
        }
    }

}