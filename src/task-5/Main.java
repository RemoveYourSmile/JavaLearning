import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    static List<Integer> numbers = Arrays.asList(1,1,2,2,3,3,4,4,5,5);

    public static void main(String[] args) {
        Main a = new Main();
        a.workWithStream(numbers);
        List<Employee> employees = a.listOfEmployees();
        a.ageOfEmployees(employees);
        a.sumOfEmployeesIt(employees);
        a.maxSalary(employees);
        a.listOfNamesHr(employees);
        a.averageSalary(employees);
    }


    //Task-5_1
    public void workWithStream(List<Integer> list){
        list = list.stream().distinct().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list.stream().mapToInt(i -> i).sum());
    }


    //Task-5_2
    public List<Employee> listOfEmployees(){
        List<Employee> employees = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
            System.out.println("Введите данные сотрудника " + i + " (имя, отдел, возраст, зарплата)");
            String name = in.next(), department = in.next();
            int age = in.nextInt(), salary = in.nextInt();
            IntStream.range(0,1).forEach(consumer -> employees.add(new Employee(name, age, department, salary)));
        }
        employees.forEach(System.out::println);
        return employees;
    }


    public void ageOfEmployees(List<Employee> list){
        list.stream().filter(i -> i.getAge() > 30)
                .sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
    }


    public void sumOfEmployeesIt(List<Employee> list){
        int count = (int) list.stream().filter(i -> i.getDepartment().equals("IT")).count();
        System.out.println("Employees in IT: " + count);
    }


    public void maxSalary(List<Employee> list){
        list.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
    }


    public void listOfNamesHr(List<Employee> list){
        List<String> names;
        names = list.stream().filter(i -> i.getDepartment().equals("HR"))
                .sorted(Comparator.comparing(Employee::getName))
                .map(Employee::getName).collect(Collectors.toList());
        System.out.println(names);
    }


    public void averageSalary(List<Employee> list){
        list.stream().mapToInt(Employee::getSalary).average().ifPresent(System.out::println);
    }
}