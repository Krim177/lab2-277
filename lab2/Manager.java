public class Manager extends Employee{
    private String department;
    
    /**
     * Constructs a Manager Object using the Employee Class
     * @param salary - Salary to assign 
     * @param name - Name of manager
     * @param department - Department of Manager
     */
    public Manager(int salary, String name, String department){
        super(salary,name);
        this.department = department;
    }

    /**
     * Returns the Department this instance is assigned to
     * @return - Department
     */
    public String getDepartment(){
        return department;
    }

    /**
     * Sets the Department to a new value
     * @param newDept - New department to set
     */
    public void setDepartment(String newDept){
        department = newDept;
    }

    /**
     * Uses Employee.toString to return String representation of Object
     * @return - String Representation of Object
     */
    public String toString(){
        return super.toString() + " -- Department: " + department; 
    }


}