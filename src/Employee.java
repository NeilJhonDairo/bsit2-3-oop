class Employee {
    protected String name;
    protected int employeeId;
    protected double baseSalary;
    protected String department;

    public Employee(String name, int employeeId, double baseSalary, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
        this.department = department;
        System.out.println("Employee " + this.name + " has been hired in " + this.department + " department");
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Base Salary: $" + this.baseSalary);
        System.out.println("Department: " + this.department);
    }

    public double calculateSalary() {
        return this.baseSalary;
    }

    public void work() {
        System.out.println(this.name + " is working on general tasks");
    }
}
