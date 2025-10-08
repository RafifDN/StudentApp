public class Student {
    private String nim;
    private String name;

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
    @Override
    public String toString() {
        return String.format("Student {NIM=%s, Name=%s}",nim, name);

    }
}
