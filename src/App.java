import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            StudentService service = new StudentService();

            while (true) {
                System.out.println("\n=== Student Management Menu ===");
                System.out.println("1. Add Student");
                System.out.println("2. List Students");
                System.out.println("99. Exit");
                System.out.print("Choose option: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter NIM: ");
                        String nim = scanner.next();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();

                        Student student = new Student();
                        student.setNim(nim);
                        student.setName(name);
                        service.addStudent(student);
                        break;

                    case 2:
                        service.listStudents();
                        break;

                    case 99:
                        System.out.println("Goodbye!");
                        return;

                    default:
                        System.out.println("Invalid option.");
                }
            }
        }
    }
}