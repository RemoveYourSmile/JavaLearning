import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person first = new Person("Саша", 21);
        Person second = new Person("Вова", 24);
        Person third = new Person("Данил", 23);

        Student studentFirst = new Student("Миша", 331, 3, 4.9);
        Student studentSecond = new Student("Дима", 231, 2, 3.9);
        Student studentThird = new Student("Елизавета", 231, 2, 4.5);
        Student studentFourth = new Student("Александр", 331, 3, 2.95);
        Student studentFifth = new Student("Евгений", 331, 3, 2.9);

        List<Student> studentList = new ArrayList<>();

        studentList.add(studentFirst);
        studentList.add(studentSecond);
        studentList.add(studentThird);
        studentList.add(studentFourth);
        studentList.add(studentFifth);

        Main a = new Main();

        a.listCountries(); //Task 4_1
        a.linkedListCountries(); //Task 4_2
        a.listPerson(first, second, third); //Task 4_3
        a.removeStudents(studentList); //Task 4_4
        a.printStudents(studentList, 3); //Task 4_4
    }


    //Task 4_1
    public void listCountries(){
        List<String> list = new ArrayList<>(){{
                add("Russia");
                add("Italia");
                add("France");
            }};

        list.add("Japan");
        list.add("Germany");
        list.add("Argentina");

        for (String countries : list){
            System.out.print(countries + " ");
        }
        System.out.println();

        list.set(1, "Madagascar");

        for (String countries : list){
            System.out.print(countries + " ");
        }
        System.out.println();

        list.remove(1);

        for (String countries : list){
            System.out.print(countries + " ");
        }
        System.out.println();

        list.remove("France");

        for (String countries : list){
            System.out.print(countries + " ");
        }
        System.out.println();

        System.out.println("Index of Japan: " + list.indexOf("Japan"));
        System.out.println("Russia is on the list: " + list.contains("Russia"));
    }


    //Task 4_2
    public void linkedListCountries(){
        List<String> list = new LinkedList<>(){{
            add("Russia");
            add("Italia");
            add("France");
        }};

        list.addFirst("Canada");
        list.addFirst("China");
        list.addLast("Maldives");
        list.addLast("Latvia");

        for (String countries : list){
            System.out.print(countries + " ");
        }
        System.out.println();

        list.removeFirst();
        list.removeLast();

        for (String countries : list){
            System.out.print(countries + " ");
        }
        System.out.println();

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }


    //Task 4_3
    public void listPerson(Person first, Person second, Person third){
        Set<Person> set = new HashSet<>();

        set.add(first);
        set.add(second);
        set.add(third);

        for (Person i : set){
            System.out.println(i.toString());
        }

        set.removeIf(i -> i.getAge() != 23);

        for (Person i : set){
            System.out.println(i);
        }

        System.out.println("third is on the list: " + set.contains(third));
    }


    //Task 4_4
    public void removeStudents(List<Student> list){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getAveragePoint() < 3){
                list.remove(i);
                --i;
            } else {
                list.get(i).setCourse(list.get(i).getCourse() + 1);
                list.get(i).setGroup(list.get(i).getGroup() + 100);
            }
        }
    }

    public void printStudents(List<Student> list, int course){
        for (Student i : list){
            if (i.getCourse() == course) {
                System.out.println(i);
            }
        }
    }
}