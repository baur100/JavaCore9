package homework10;

public class Student extends Person{
        private String school;
        private String classGrade;

        public Student(String name, String lastName, int year, String school, String classGrade) {
            super(name, lastName, year);
            this.school = school;
            this.classGrade = classGrade;
        }

        public String getSchool () {
            return school;
        }

        public void setSchool (String school){
            this.school = school;
        }

        public String getClassGrade () {
            return classGrade;
        }

        public void setClassGrade (String classGrade){
            this.classGrade = classGrade;
        }
    }



