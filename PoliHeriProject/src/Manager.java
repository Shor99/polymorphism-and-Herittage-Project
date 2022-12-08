public class Manager extends Employee{

    private double wage;
    private int numOfWorkers;

    public Manager(String name, double wage, int numOfWorkers) {
        super(name);
        this.wage = wage;
        this.numOfWorkers = numOfWorkers;

    }

    public double getWage() {
        return wage;
    }

    public int getNumOfWorkers() {
        return numOfWorkers;
    }

    @Override
    public String toString() {
        return "Employee's name: " + this.getName() + ", wage = " + wage + ", workers = " + numOfWorkers;
    }

    @Override
    public double salary() {
        if(numOfWorkers <= 10)
            return wage;
        else if (numOfWorkers > 20)
            return wage + 1000;
        else
            return wage + ((numOfWorkers-10)*50);
    }
}
