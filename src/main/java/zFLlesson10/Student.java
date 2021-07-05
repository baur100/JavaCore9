package zFLlesson10;

    public final class Student extends Person{
    private String universityName;
    private String major;

        public Student(String name, String lastName, int yearOfBirth, String universityName, String major) {
            super(name,lastName, yearOfBirth);
            this.universityName = universityName;
            this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
