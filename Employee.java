package Assignment5;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    int empid,dob,dateofjoining;
    float salary;
    String name;
}
 class Department{
    String deptname;
    List<Employee> employees;
}

public class Java8SortingArrayList {
    public static void main(String[] args) throws Exception {

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");


        List <Employee> employees = new ArrayList <Employee> ();
        employees.add(new Employee(11, "Yashwant Chavan", dateFormat.parse("01/08/1981")));
        employees.add(new Employee(2, "Dinesh More", dateFormat.parse("11/07/1980")));
        employees.add(new Employee(6, "Mahesh Kulkarni", dateFormat.parse("02/08/1985")));
        employees.add(new Employee(4, "Vijay Patil", dateFormat.parse("01/22/1989")));
        employees.add(new Employee(7, "Vijay Patil", dateFormat.parse("07/13/1982")));

        System.out.println("Before Sorting...");
        employees.forEach((e) -> System.out.println(e));

        System.out.println("\nSort by Employee Id Descending..");
        Comparator <Employee> byEmployeeId = (e1, e2) -> Integer.compare(e2.getEmployeeId(), e1.getEmployeeId());
        employees.stream().sorted(byEmployeeId).forEach(e -> System.out.println(e));

        System.out.println("\nSort by Employee Name..");
        Comparator <Employee> byName = (e1, e2) -> e1.getName().compareTo(e2.getName());
        employees.stream().sorted(byName).forEach(e -> System.out.println(e));


        System.out.println("\nSort by Multiple keys (Name & Birth Date)..");
        Comparator <Employee> byBirthDate = (e1, e2) -> e1.getBirthDate().compareTo(e2.getBirthDate());

        employees.stream().sorted(byName.thenComparing(byBirthDate)).forEach(e -> System.out.println(e));

    }
}
