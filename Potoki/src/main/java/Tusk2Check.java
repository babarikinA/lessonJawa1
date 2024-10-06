public class Tusk2Check {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            EmployeeThread employeeThread = new EmployeeThread("Thread with index " + i);
            employeeThread.start();
        }

    }

}
