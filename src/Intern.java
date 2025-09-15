class Intern extends Employee {
    private String university;
    private boolean isFullTime;


    public Intern(String name, int employeeId, double baseSalary, String department, String university, boolean isFullTime) {
        super(name, employeeId, baseSalary, department);
        this.university = university;
        this.isFullTime = isFullTime;
        System.out.println("Intern " + this.name + " from " + this.university + " has started");
    }


    @Override
    public double calculateSalary() {
        return this.baseSalary * 0.5;
    }


    @Override
    public void work() {
        System.out.println(this.name + " is learning and assisting with tasks");
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("University: " + this.university);
        System.out.println("Full Time: " + this.isFullTime);
    }
}
