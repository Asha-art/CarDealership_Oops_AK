import java.time.LocalDateTime;

public class SalesDepartment extends Department {
    public SalesDepartment() {
        super("sales", 50);
    }

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        // return true because salesdepartment is open 7 days a week
        return true;
    }
}