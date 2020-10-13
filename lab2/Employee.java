public class Employee{
    private int salary;
    private String name;

    /**
     * Constructs an employee Object with Name and Salary Specified
     * @param salary - salary for new employee 
     * @param name - name for employee 
     */
    public Employee(int salary, String name){
        this.salary = salary;
        this.name = name;
    }

    /**
     * Sets the name of the employee
     * @param name - new name for employee
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the salary of the employee
     * @param salary - new salary for employee
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * Returns the name of the employee
     * @return - returns employee name
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Returns the salary of the employee
     * @return - returns employee salary
     */
    public int getSalary(){
        return this.salary;
    }

    /**
     * Overrides the toString method
     * @return - String Representation of Object
     */
    public String toString(){
        return "Employee Name: " + name + " -- Employee Salary: " + salary;
    }

}