public class Worker extends Employee{

    private double wagePerHour;
    private int hour;

    public Worker(String name,double wagePerHour) {
        super(name);
        this.wagePerHour = wagePerHour;
    }


    public double getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(double wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Employee's name: " + this.getName() + ", wage = " + wagePerHour + ", hours = " + hour;
    }
    @Override
    public double salary() {
        return this.hour * this.wagePerHour;
    }
}
