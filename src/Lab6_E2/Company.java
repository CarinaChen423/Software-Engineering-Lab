package Lab6_E2;

public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice");
        Secretary secretary = new Secretary("Bob");
        Technician technician = new Technician("Charlie");

        manager.supervise(secretary);
        manager.supervise(technician);

        secretary.work();
        secretary.takeDictation("We need to increase our productivity.");

        technician.work();
        technician.maintainSystems();

        manager.work();
    }
}