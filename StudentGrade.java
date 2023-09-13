public abstract class StudentGrade {
    private String studentName;
    private String moduleName;

    public StudentGrade(String studentName, String moduleName) {
        this.studentName = studentName;
        this.moduleName = moduleName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    public abstract String classifyGrade();

    public abstract int getGrade();
}
