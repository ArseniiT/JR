package t2909.human;

public class Teacher extends UniversityPerson {
    private int numberOfStudents;

    public Teacher(String name, int age, int numberOfStudents) {
        super(name, age);
        this.numberOfStudents = numberOfStudents;
    }
    
    public void live() {
        teach();
    }

    @Override
    public String getPosition() {
        return "Преподаватель";
    }

    public void teach() {
    }
}