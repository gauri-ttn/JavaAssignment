import java.util.Objects;

record Student(int id, String name, String standard) {
    public Student(int id, String name, String standard) {
        Objects.requireNonNull(name, "Name cannot be null.");
        Objects.requireNonNull(standard, "Standard cannot be null.");
        this.id = id;
        this.name = name;
        this.standard = standard;
    }

    public int id() {
        return this.id;
    }

    public String name() {
        return this.name;
    }

    public String standard() {
        return this.standard;
    }
}
