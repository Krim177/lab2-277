public class Main{


    /**
     * Lab 2
     * @author - Giovanni Quevedo , Krimika Keemtee
     */

    //Turn in a zip w proj files and a pdf with all files pasted w output


    /**
     * Main method - Creates two Employee objects, one Manager, and one Executive. Then displays them all.
     * @param args - command line arguments (not used)
     */
    public static void main(String[] args) {
        ln("");
        ln("");
        ln("");

        ln("-- - " + "Starting program...");
        ln("");
        ln("- " + "Creating Employee 'e1' with Name: George and Salary: 30,000...");
        Employee e1 = new Employee(30000,"George");
        ln("");
        ln("- " + "Creating Employee 'e2' with Name: Phylis and Salary: 35,000...");
        Employee e2 = new Employee(35000, "Phylis");
        ln("");
        ln("- " + "Creating Manager 'm1' with Name: Dwight , Salary: 1,002 , and Department: 'Paper Work'...");
        Manager m1 = new Manager(1002, "Dwight", "Paper Work");
        ln("");
        ln("- " + "Creating Executive 'ex1' with Name: Michael , Salary: 350,000 , Department: 'Upper Management' , and Yearly Bonus: '35,000'...");
        Executive ex1 = new Executive(350000, "Michael", "Upper Management", 35000);
        ln("");


        ln("");
        ln("-- - " + "Prining out Employee Roster...");
        Employee[] roster = new Employee[4];
        roster[0] = e1;
        roster[1] = e2;
        roster[2] = m1;
        roster[3] = ex1;
        ln("");

        for(Employee empl : roster){
            ln("-- " + empl.toString());
            ln("");
        }

        ln("-- - " + "Program End...");
        
        ln("");
        ln("");
        ln("");
    }

    /**
     * Utilizes System.out.print as a shorthand to stylishly print info.
     * Mainly exists for ease of access.
     * @param info - information to print
     */
    public static void sop(String info){
        System.out.print(info);
    }

    /**
     * Utilizes System.out.println as a shorthand to stylishly print info.
     * For ease of access
     * @param info - information to print
     */
    public static void ln(String info){
        System.out.println(">> " + info);
    }


}