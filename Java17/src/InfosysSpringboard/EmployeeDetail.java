package InfosysSpringboard;

class Employee {
    // 1. Make attributes private
    private String employeeId;
    private String employeeName;
    private int salary;
    private int bonus;
    private int jobLevel;

    // 2. Calculate Salary based on job level
    public void calculateSalary() {
        if (this.jobLevel >= 4) {
            this.bonus = 100;
        } else {
            this.bonus = 50;
        }
        this.salary += this.bonus;
    }

    // 3. Add Getter and Setter methods (Encapsulation)
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }

    public int getJobLevel() { return jobLevel; }
    public void setJobLevel(int jobLevel) { this.jobLevel = jobLevel; }
}

class EmployeeDetail {
    public static void main(String[] args) {
        Employee employee = new Employee();
        
        // Use setters to assign values
        employee.setEmployeeId("C101");
        employee.setEmployeeName("Steve");
        employee.setSalary(650);
        employee.setJobLevel(4);

        employee.calculateSalary();

        // Use getters to retrieve values
        System.out.println("Employee Details");
        System.out.println("Employee Id: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getSalary());
    }
}