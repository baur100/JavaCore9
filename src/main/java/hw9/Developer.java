package hw9;

    public class Developer extends TeamMember {

    private int yearsOfExperience;
    private String country;

        public Developer(String name, String lastName, int birthYear, int yearsOfExperience, String country) {
            super(name, lastName, birthYear);
            this.yearsOfExperience = yearsOfExperience;
            this.country = country;
        }

        public int  getYearsOfExperience() {
            return yearsOfExperience;
        }

        public String getCountry() {
            return country;
        }
    }
