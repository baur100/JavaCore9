package homework9IP;

public class Job {
    private String major;
    private String title;
    private String responsibilities;

    public Job(String major, String title, String responsibilities) {
        this.major = major;
        this.title = title;
        this.responsibilities = responsibilities;
    }

    public Job(){
    }


    public String getMajor() {
        return major;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public void setMajor(String major){
        this.major = major;

}

}
