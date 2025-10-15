import java.time.LocalDate;

public class Student {
    private String nim;
    private String name;
    private LocalDate dob;  // tanggal lahir
    private String address; // alamat

    // Getter dan Setter
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format(
            "Student {NIM=%s, Name=%s, DOB=%s, Address=%s}",
            nim, name, dob, address
        );
    }
}