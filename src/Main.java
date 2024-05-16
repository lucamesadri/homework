    public class Main {
        public static void main(String[] args) {
            Employee employee = new Employee("Luca", 50, 50);
            System.out.println("The salary of " + employee.getName() + " is: R$" + employee.calculateSalary());

            Leader leader = new Leader("Gustavo", 50, 50);
            System.out.println("The salary of " + leader.getName() + " is: R$" + leader.calculateSalary());

            Manager manager = new Manager("Ossanha", 50, 50);
            System.out.println("The salary of " + manager.getName() + " is: R$" + manager.calculateSalary());
        }
    }