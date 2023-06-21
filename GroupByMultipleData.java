import java.util.*;
import java.util.stream.*;

public class GroupByMultipleData{
    public static void main(String args[]){
        List<Employee> employeesList = new ArrayList<>();

        employeesList.add(new Employee(101, "Glady", "Manager", "Male", 25_00_000));
        employeesList.add(new Employee(102, "Vlad", "Software Engineer", "Female", 15_00_000));
        employeesList.add(new Employee(103, "Shine", "Lead Engineer", "Female", 20_00_000));
        employeesList.add(new Employee(104, "Nike", "Manager", "Female", 25_00_000));
        employeesList.add(new Employee(105, "Vlad", "Software Engineer", "Male", 15_00_000));
        employeesList.add(new Employee(107, "Vlad", "Software Engineer", "Male", 15_00_000));
        employeesList.add(new Employee(107, "Gagy", "Software Engineer", "Male", 15_00_000));



        Map<Integer, List<String>> multipleFieldsMap = employeesList.stream().
                collect(
                        Collectors.groupingBy(Employee::getId,
                        Collectors.mapping(Employee::getName,
                        Collectors.toList())              
                                ));
        System.out.println(multipleFieldsMap);        

        List<Employee> list1 = employeesList.stream().filter(p->p.getGender()=="Female").collect(Collectors.toList());
        System.out.println(list1);
    }
}