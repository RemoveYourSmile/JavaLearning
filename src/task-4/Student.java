public class Student {
    private String name;

    private int group;

    private int course;

    private double averagePoint;

    public Student(String name, int group, int course, double averagePoint) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.averagePoint = averagePoint;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", averagePoint=" + averagePoint +
                '}';
    }
}
