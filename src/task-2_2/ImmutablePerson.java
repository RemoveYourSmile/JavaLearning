import java.util.ArrayList;
import java.util.List;

public final class ImmutablePerson {

    final String name = "Ivan";

    final int age = 22;

    static List<String> hobbies = new ArrayList<>();

    public String getName(){
        return name;
    }
}
