import java.util.ArrayList;
import java.util.List;

public class MutablePerson {

    String name;

    int age;

    List<String> hobbies = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printHobbies(){
        for (String str : hobbies){
            System.out.println(str);
        }
    }
}
