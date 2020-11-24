package Week10;

import java.util.ArrayList;

public class StudentSystem {
    private ArrayList<Student> students = new ArrayList<>();

    public StudentSystem() {
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public ArrayList<Student> getStudents(){
        return this.students;
    }

    public static void main(String[] args) {
        StudentSystem ss = new StudentSystem();
        Student steve = new Student("u0670824", "Steve");
        ss.addStudent(steve);
        System.out.println(ss.getStudents());
    }
}
