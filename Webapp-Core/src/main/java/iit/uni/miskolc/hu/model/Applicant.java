package iit.uni.miskolc.hu.model;

import java.util.Collection;

public class Applicant {

    private int applicantID;
    private String name;
    private String age;
    private Genre genre;
    private String email;
    private Education education;

    public Applicant(int applicantID, String name, String age, Genre genre, String email, Education education) {
        this.applicantID = applicantID;
        this.name = name;
        this.age = age;
        this.genre = genre;
        this.email = email;
        this.education = education;
    }

    public int getApplicantID() {
        return applicantID;
    }

    public void setApplicantID(int applicantID) {
        this.applicantID = applicantID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "applicantID=" + applicantID +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", genre=" + genre +
                ", email='" + email + '\'' +
                ", education=" + education +
                '}';
    }
}
