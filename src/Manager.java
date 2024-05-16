class Manager extends Employee {
    public Manager(String name, double hourlyRate, int hoursWorked) {
        super(name, hourlyRate, hoursWorked);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() * 1.05;
    }
}