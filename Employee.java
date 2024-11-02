public class Employee {
    private String employeName;
    private String EmployeID;

    public Employee(String employeName, String employeID) {
        this.employeName = employeName;
        this.EmployeID = employeID;
    }

    public String getName() {
        return employeName;
    }

    public String getEmployeID() {
        return EmployeID;
    }
    public void displayEmployedetail(){
        System.out.println("EmployeID: "+ EmployeID + "employeName:" +employeName);
    }
}


class Department {
    private String departmentname;
    String DepartmentID;

    public Department(String departmentname, String getDepartmentID) {
        this.departmentname = departmentname;
        this.DepartmentID = getDepartmentID;
    }
    public void DisplayDepartment(){
        System.out.println("departmentname:" +departmentname);
        System.out.println("DepartmentID:" + DepartmentID);
    }
}

class mainn {
    public static void main(String[] args) {
        Employee emp1 =new Employee("ham", "123");
        Employee emp2 = new Employee("muna", "544");
        Employee emp3 = new Employee("ben", "756");
        Department dept1 = new Department("6574", "Front Desk");

        System.out.println("employeID is "+ emp1.getEmployeID());
    }
}






