package Lab6_E2;

class Secretary extends Employee {
    public Secretary(String name) {
        super(name);
    }

    public void takeDictation(String text) {
        System.out.println(getName() + " is taking dictation of: " + text);
    }
}