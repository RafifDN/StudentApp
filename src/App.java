import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            StudentService service = new StudentService();

            while (true) {
                System.out.println("\n=== Student Management Menu ===");
                System.out.println("1. Add Student");
                System.out.println("2. List Students");
                System.out.println("3. Delete Student");
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

                        // Input Date of Birth
                        LocalDate dob = null;
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        while (dob == null) {
                            System.out.print("Enter Date of Birth (yyyy-MM-dd): ");
                            String dobInput = scanner.nextLine();
                            try {
                                dob = LocalDate.parse(dobInput, formatter);
                            } catch (DateTimeParseException e) {
                                System.out.println("Invalid date format. Please use yyyy-MM-dd.");
                            }
                        }

                        // Input Address
                        System.out.print("Enter Address: ");
                        String address = scanner.nextLine();

                        // Create and add student
                        Student student = new Student();
                        student.setNim(nim);
                        student.setName(name);
                        student.setDob(dob);
                        student.setAddress(address);

                        service.addStudent(student);
                        break;

                    case 2:
                        service.listStudents();
                        break;

                    case 3:
                        System.out.print("Enter NIM to delete: ");
                        String deleteNim = scanner.nextLine();
                        service.deleteStudent(deleteNim);
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