import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("\nStudent added successfully!");
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n=== List of Students ===");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        students.stream().forEach(s -> {
            System.out.println("-----------------------------");
            System.out.println("NIM           : " + s.getNim());
            System.out.println("Name          : " + s.getName());
            System.out.println("Date of Birth : " + s.getDob().format(formatter));
            System.out.println("Address       : " + s.getAddress());
        });
        System.out.println("-----------------------------");
    }

    public void deleteStudent(String nim) {
        boolean removed = students.removeIf(s -> s.getNim().equalsIgnoreCase(nim));
        if (removed) {
            System.out.println("Student with NIM " + nim + " has been deleted.");
        } else {
            System.out.println("Student with NIM " + nim + " not found.");
        }
    }
}