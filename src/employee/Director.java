package employee;

public class Director extends Employee implements Interview {

    public Director(String name, int age) {
        super(name, age);
    }

    @Override
    public void counductInterview() {

    }
}
