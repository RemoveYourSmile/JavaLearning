public class Runner extends MutablePerson{
    public static void main(String[] args){
        ImmutablePerson personFirst = new ImmutablePerson();
        MutablePerson personSecond = new MutablePerson();
        String str = "New" + personFirst.getName();
        personSecond.setAge(23);
        personSecond.setName("Sasha");
        personSecond.hobbies.add("Кино");
        personSecond.hobbies.add("Музыка");
        personSecond.hobbies.add("Прогулки");
        personSecond.printHobbies();
    }
}