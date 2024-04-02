package Lab6_E2;

class Manager extends Employee {
    private Employee supervisee;

    public Manager(String name) {
        super(name);
    }

    public void supervise(Employee e) {
        this.supervisee = e;
        System.out.println(getName() + " is now supervising " + e.getName());
    }
}