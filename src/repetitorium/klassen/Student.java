package repetitorium.klassen;

public class Student {
    private String forename;
    private String surname;
    private String matriculationNumber;
    private float[] grades = { 1, 1.0f, 2.3f };

    public Student(String forename, String surname, String matriculationNumber) {
        this.forename = forename;
        this.surname = surname;
        this.matriculationNumber = matriculationNumber;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(String matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    public float[] getGrades() {
        return grades;
    }

    public void setGrades(float[] grades) {
        this.grades = grades;
    }

    public void addGrade(float grade) {
        float[] newGrades = new float[grades.length + 1];

        for (int i = 0; i < grades.length; i++) {
            float oldGrade = grades[i];
            newGrades[i] = oldGrade;
        }

        newGrades[newGrades.length - 1] = grade;
        grades = newGrades;
    }

    public void removeLastGrade() {
        if (grades.length == 0) return;

        float[] newGrades = new float[grades.length - 1];
        for (int i = 0; i < grades.length - 1; i++) {
            float oldGrade = grades[i];
            newGrades[i] = oldGrade;
        }

        grades = newGrades;
    }

    public String printMe() {
        return "Student{" +
                "forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", matriculationNumber='" + matriculationNumber + '\'' +
                ", grades=" + printGrades() +
                '}';
    }

    private String printGrades() {
        String result = "";
        for (int i = 0; i < grades.length; i++) {
            float grade = grades[i];
            if (i != 0) {
                result += ", ";
            }

            result += grade;
        }

        return "[" + result + "]";
    }
}
