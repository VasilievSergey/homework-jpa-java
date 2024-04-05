package gb.presenter;

import gb.model.Service;
import gb.view.View;

public class Presenter {
    private final View view;
    private final Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void saveStudents() {
        view.printAnswer(
                service.saveStudents());
    }

    public void loadStudents() {
        view.printAnswer(
                service.loadStudents());
    }

    public void createNewStudent(Integer id, String firstName, String secondName, String age) {
        view.printAnswer(
                service.createNewStudent(id,firstName, secondName, age));
    }

    public void getStudentsBase() {
        view.printAnswer(
                service.getStudentsBaseString());
    }

    public void findById(String id) {
        view.printAnswer(
                service.findById(id));
    }

    public void editById(String id, String firstName, String secondName, String age) {
        view.printAnswer(
                service.editById(id, firstName, secondName, age));
    }

    public void removeByIdFromTo(String idFrom, String idTo) {
        view.printAnswer(
                service.removeByIdFromTo(idFrom, idTo));
    }

    public void findByQuery(String query) {
        view.printAnswer(
                service.findByQuery(query));
    }
}