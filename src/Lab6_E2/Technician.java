package Lab6_E2;

class Technician extends Employee {
    public Technician(String name) {
        super(name);
    }

    public void maintainSystems() {
        System.out.println(getName() + " is maintaining systems.");
    }
}