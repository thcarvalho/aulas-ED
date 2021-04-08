public class Student {
    private int RA;
    private String name;
    private String currentClass;
    private String semester;

    public Student(int RA, String name, String currentClass, String semester) {
        this.RA = RA;
        this.name = name;
        this.currentClass = currentClass;
        this.semester = semester;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentClass() {
        return currentClass;
    }

    public void setCurrentClass(String currentClass) {
        this.currentClass = currentClass;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
