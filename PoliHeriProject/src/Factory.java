import java.util.ArrayList;
import java.util.Arrays;

public class Factory {
    private Employee [] emps;
    private int numOfEmps;
    final int MAX_EMPS = 100;

    private int numOfWorkers;

    public Factory() {
        this.emps = new Employee[MAX_EMPS];
        this.numOfEmps = 0;
        this.numOfWorkers = 0;
    }


    public boolean addEmployee(Employee e){
        if(numOfEmps < MAX_EMPS) {
            emps[numOfEmps++] = e;
            if(e instanceof  Worker)
                numOfWorkers++;
            return true;
        }
        return false;
    }
    public int getNumOfWorkers(){
        return numOfWorkers;
    }

    public Manager mostManager(){
        Manager highest = null;
        for(int i = 0; i < numOfEmps-1; i++){
            if(emps[i] instanceof Manager) {
                if (highest == null)
                    highest = (Manager)emps[i];
                else if(highest.getNumOfWorkers() < ((Manager) emps[i]).getNumOfWorkers()){
                    highest = (Manager)emps[i];
                }
            }
        }
        return highest;
    }

    public Worker minHours(){
        Worker minH = null;
        for(int i = 0; i < numOfEmps-1; i++){
            if(emps[i] instanceof Worker) {
                if (minH == null)
                    minH = (Worker) emps[i];
                else if(minH.getHour() > ((Worker) emps[i]).getHour()){
                    minH = (Worker) emps[i];
                }
            }
        }
        return minH;
    }

    public Employee maxSalary() {
        Employee maxSalary = null;
        for (int i = 0; i < numOfEmps-1; i++) {
            if (emps[i] instanceof Manager) {
                if (maxSalary == null) {
                    maxSalary = emps[i];
                }
                else if (maxSalary.salary() < ((Manager) emps[i]).salary()){
                    maxSalary = emps[i];
                }
            }
            if (emps[i] instanceof Worker) {
                if (maxSalary == null) {
                    maxSalary = emps[i];
                }
                else if (maxSalary.salary() < ((Worker) emps[i]).salary()){
                    maxSalary = emps[i];
                }
            }
        }
        return maxSalary;
    }

    public double salaryByName(String eName){
        for(int i = 0 ; i < numOfEmps-1 ; i++){
            if(emps[i].getName().toLowerCase().equals(eName.toLowerCase()))
                return emps[i].salary();
        }
        return 0.0;
    }


    @Override
    public String toString() {
        String string = "";
        for(int i = 0 ; i < numOfEmps-1 ; i++)
            string += "\nName: " + emps[i].getName() + "Salary: " + emps[i].salary();
        return string;
    }
}
