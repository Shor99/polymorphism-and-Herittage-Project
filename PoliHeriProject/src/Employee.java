abstract class Employee extends Factory{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double salary();

    @Override
    public String toString() {
        return "Employee's name: " +name;
    }
}
