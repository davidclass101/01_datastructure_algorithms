public class LetterGrade extends StudentGrade {
    private char grade;

    public LetterGrade(String studentName, String moduleName) {
        super(studentName, moduleName);
    }

    public void setGrade(char grade) {
        char upperCaseGrade = Character.toUpperCase(grade);
        if (upperCaseGrade < 'A' || upperCaseGrade > 'E') {
            throw new IllegalArgumentException("Invalid grade value. Grade must be A, B, C, D, or E.");
        }
        this.grade = upperCaseGrade;
    }

    @Override
    public String classifyGrade() {
        if (grade == 'A' || grade == 'B') {
            return "Distinction";
        } else if (grade == 'C') {
            return "Merit";
        } else if (grade == 'D') {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    @Override
    public int getGrade() {
        switch (grade) {
            case 'A':
                return 1;
            case 'B':
                return 2;
            case 'C':
                return 3;
            case 'D':
                return 4;
            case 'E':
                return 5;
            default:
                return 0;
        }
    }
}
