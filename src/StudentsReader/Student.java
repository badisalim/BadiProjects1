package StudentsReader;

public class Student {

private String gender;
private String parentLevel;
private  Integer mathScore;
private  Integer readingScore;
private  Integer writingScore;

    public Student(String gender, String parentLevel, Integer mathScore, Integer readingScore, Integer writingScore) {
        this.gender = gender;
        this.parentLevel = parentLevel;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public String getParentLevel() {
        return parentLevel;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public Integer getReadingScore() {
        return readingScore;
    }

    public Integer getWritingScore() {
        return writingScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gender='" + gender + '\'' +
                ", parentLevel='" + parentLevel + '\'' +
                ", mathScore=" + mathScore +
                ", readingScore=" + readingScore +
                ", writingScore=" + writingScore +
                '}';
    }
}
