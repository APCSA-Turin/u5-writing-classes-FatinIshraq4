public class Employee {

    private String first;
    private String last;
    private int ID;
    private static int mostRecentEmployeeID = 99;
    private static int totalEmployeesCreated = 0;

    public Employee(String first, String last) {
        this.first = first;
        this.last = last;
        mostRecentEmployeeID++;
        ID = mostRecentEmployeeID;
        totalEmployeesCreated++;
    }

    public String getFullName() {return first + " " + last;}

    public int getID() {return ID;}

    public static int getMostRecentEmployeeID() {return mostRecentEmployeeID;}

    public static int getTotalEmployeesCreated() {return totalEmployeesCreated;}

    public String employeeInfo() {
       String str = "--------------------------";
       str += "\nName: " + getFullName();
       str += "\nEmployee ID: " + ID;
       str += "\nMost recent ID assigned: " + mostRecentEmployeeID;
       str += "\nTotal employees hired: " + totalEmployeesCreated;
       str += "\n--------------------------";
       return str;
    }
}