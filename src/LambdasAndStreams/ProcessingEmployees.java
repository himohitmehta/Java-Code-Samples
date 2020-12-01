package LambdasAndStreams;
//Processing streams of Employee objects

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees {
    public static void main(String[] args) {
        //initialize array of Employees
        Employee[] employees = {
                new Employee("Mohit", "Mehta", 17072711, "IT and Management"),
                new Employee("Vivek", "Dhull", 78623, "IT and Accounts Head"),
                new Employee("Savita", "Mehta", 17072711, "CEO"),
                new Employee("Nishita", "paruthi", 86343, "Secretary")
        };
        //get List view of the Employees
        List<Employee> list = Arrays.asList(employees);
        //display all Employees
        System.out.println("Complete Employee list");
        list.stream().forEach(System.out::println);
        //Filtering Employees with Salaries in a Specified Range
        //Predicate that returns true for salaries in the range $70000-$90000
        Predicate<Employee> seventyToNinetyThousand = e -> (e.getSalary() >= 70000 && e.getSalary() <= 90000);
        //Display Employees with salaries in the range $70000-$90000
        //sorted into ascending order by salary
        System.out.printf("%nEmployees earning $70000-$90000 per month sorted by salary: %n");
        list.stream()
                .filter(seventyToNinetyThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
        //Display first Employee with salary in  range $70000-$90000
        System.out.printf("%nFirst employee who earns $70000-$90000: %n%s%n",
                list.stream()
                        .filter(seventyToNinetyThousand)
                        .findFirst()
                        .get());
        //Sorting Employees By Multiple Fields
        //Functions for getting first and last names from an Employee
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;
        //Comparator for comparing Employees by firstName then lastname
        Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);
        //sort employees by last name , then first name
        System.out.printf("%nEmployees in Ascending order by lastname then first: %n");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);
        //sort employees in descending order by last name, then first name
        System.out.printf("%nEmployees in descending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst.reversed())
                .forEach(System.out::println);
        //Mapping Employees to Unique Last-Name Strings
        //display unique employee last names sorted
        System.out.printf("%nUnique employees Last names: %n");
        list.stream()
                .map(Employee::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        //display only first and last names
        System.out.printf("%n Employee names in order by lastNames then firstnNames: %n");
        list.stream()
                .sorted(lastThenFirst)
                .map(Employee::getName)
                .forEach(System.out::println);
        //Grouping Employees By Department
        //group Employees by department
        System.out.printf("%nEmployees by department:%n");
        Map<String, List<Employee>> groupedByDepartment = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        groupedByDepartment.forEach(
                (department, employeesInDepartment) -> {
                    System.out.printf("%n%s%n", department);
                    employeesInDepartment.forEach(
                            employee -> System.out.printf(" %s%n", employee)
                    );
                }
        );
        //Counting the Number of Employees in Each Department
        //count number of Employees in each department
        System.out.printf("%nCount of Employees by department: %n");
        Map<String, Long> employeeCountByDepartment = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        employeeCountByDepartment.forEach(
                (department, count) -> System.out.printf(
                        "%s has %d employee(s) %n", department, count
                )
        );
        //Summing and Averaging Employee Salaries
        //sum of Employee salaries with Double Stream sum method
        System.out.printf("%nSum of Employees' Salaries(via sum method): %.2f%n", list.stream()
                .mapToDouble(Employee::getSalary)
                .sum());
        //calculate sum of Employee salaries with stream reduce
        System.out.printf(
                "Sum of Employees' salaries (via reduce method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .reduce(0, Double::sum)
        );
        //average of Employee salaries with DoubleStream average method
        System.out.printf("Average of Employees' Salaries: %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .getAsDouble());
    }
}
