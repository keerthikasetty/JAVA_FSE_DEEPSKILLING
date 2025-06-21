package FSE_WEEK1_DESIGN_PATTERNS.mvcpattern;

class Student {
    String name;
    int id;
    String grade;

    public Student(String name, int id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
}

class StudentView {
    public void displayStudentDetails(Student student) {
        System.out.println("Name: " + student.name);
        System.out.println("ID: " + student.id);
        System.out.println("Grade: " + student.grade);
    }
}

class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayStudentDetails(model);
    }

    public void setName(String name) {
        model.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Alice", 101, "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(s, view);

        controller.updateView();
        controller.setName("Bob");
        controller.updateView();
    }
}
