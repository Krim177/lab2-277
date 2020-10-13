public class Executive extends Manager {
    private int yearlyBonus;

    /**
     * Constructs a Executive Object using the Manager Class
     * @param salary - Salary to assign 
     * @param name - Name of manager
     * @param department - Department of Manager
     * @param yearlyBonus - Yearly Bonus to assign
     */
    public Executive(int salary, String name, String department, int yearlyBonus){
        super(salary,name,department);  
        this.yearlyBonus = yearlyBonus;
    }

 /**
     * Returns the Yearly Bonus this instance is assigned to
     * @return - Yearly Bonus
     */
    public int getYearlyBonus(){
        return this.yearlyBonus;
    }

    /**
     * Sets the Yearly Bonus to a new value
     * @param newDept - New Yearly Bonus to set
     */
    public void setYearlyBonus(int yearlyBonus){
        this.yearlyBonus = yearlyBonus;
    }

    /**
     * Overrides Manager.toString to return String representation of Object
     * @return - String Representation of Object
     */
    public String toString(){
        return super.toString() + " -- Yearly Bonus: " + yearlyBonus +" -- TOTAL Salary = " + (yearlyBonus + super.getSalary()); 
    }

}