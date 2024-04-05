package gb.view;

import gb.model.entity.Student;
import gb.presenter.Presenter;

import java.util.concurrent.ThreadLocalRandom;

public class ConsoleUI implements View{
    private final Presenter presenter;


    public ConsoleUI() {
        presenter = new Presenter(this);
    }
    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }

    public void run() {
        createNewStudent(10);
        presenter.getStudentsBase();
        presenter.saveStudents();

        System.out.println("1");

        presenter.loadStudents();
        presenter.getStudentsBase();

        System.out.println("2");


        presenter.findById("9");
        presenter.getStudentsBase();

        System.out.println("3");

        presenter.editById("7", "Ivan", "Ivanov", "25");
        presenter.loadStudents();
        presenter.getStudentsBase();

        System.out.println("4");

        presenter.removeByIdFromTo("5", "10");
        presenter.getStudentsBase();

        System.out.println("5");

        presenter.findByQuery("SELECT s FROM student s WHERE age > 20");
        presenter.getStudentsBase();

        System.out.println("FINAL");
    }
    private void createNewStudent(int amount) {
        for (int i = 1; i <= amount; i++) {
            Student student = new Student();
            student.setId(i);
            student.setFirstName("Student #" + i);
            student.setSecondName("name #" + i);
            String age = String.valueOf(ThreadLocalRandom.current().nextInt(18, 25));
            presenter.createNewStudent(student.getId(),student.getFirstName(), student.getSecondName(), age);
        }
    }


}