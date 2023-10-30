package employee;

public class Manager extends Employee implements Interview {

    public Manager(String name, int age){
        super(name, age);
    }

    @Override
    public void attendTraining() {
        System.out.println("Attend Training Manager "  + getName());
    }

    @Override
    public void counductInterview() {
        System.out.println("Mananger is counducting interview " + getName());
    }
}
