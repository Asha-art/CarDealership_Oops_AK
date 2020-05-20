import java.time.LocalDateTime;
import java.util.List;

public abstract class Department {
    private String deptName;
    private int numOfEmployees;

    public Department() {
        this.deptName = "Generic";
        this.numOfEmployees = 0;
    }

    public Department(String name, int numOfEmployees) {
        this.deptName = name;
        this.numOfEmployees = numOfEmployees;
    }

    public static void printIsOpen(List<Department> depts, LocalDateTime today) {
        // Cycle through each department in provided list
        for (Department d : depts) {
            // print out name of dept and return if that dept is open today
            System.out.println(d.toString() + "is open today? " + d.isOpenToday(today));
            // use instanceof keyword to test if item in the list of a certain object or
            // data type
            if (d instanceof ServiceDepartment) {
                System.out.println(d.toString() + "only closes on Sundays.");
            }
        }
    }

    // abstract method
    public abstract boolean isOpenToday(LocalDateTime day);

    @Override
    public String toString() {
        return this.deptName + "Department";
    }
}