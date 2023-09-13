public class PercentageGrade extends StudentGrade {

    private int grade;

    public PercentageGrade(String studentName, String moduleName) {
        super(studentName, moduleName);
    }

    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Invalid grade value. Grade must be between 0 and 100.");
        }
        this.grade = grade;
    }

    @Override
    public String classifyGrade() {
    //    if (grade >= 70 && grade <= 100) {
    //        return "Distinction";
    //    } else if (grade >= 50 && grade <= 69) {
    //        return "Merit";
    //    } else if (grade >= 40 && grade <= 49) {
    //        return "Pass";
    //    } else if (grade >= 0 && grade <= 39) {
    //        return "Fail";
    //    } else {
    //        return null;
    //    }
        return (grade >= 70) ? "Distinction" : (grade >= 50) ? "Merit" : (grade >= 40) ? "Pass" : "Fail";
    }
    @Override
    public int getGrade() {
        return grade;
    }

}
