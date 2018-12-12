package iit.uni.miskolc.hu.model;


import iit.uni.miskolc.hu.exceptions.InvalidIDFormatExceptions;
import iit.uni.miskolc.hu.exceptions.NonExistingEnumException;

public class Job {

    private int jobID;
    private String jobName;
    private JobType jobType;
    private String jobDescription;
    private int jobSalary;
    private Education education;
    private String hrName;

    public Job(int jobID, String jobName, JobType jobType, String jobDescription, int jobSalary, Education education, String hrName) throws InvalidIDFormatExceptions {
        if (jobID<1){throw new InvalidIDFormatExceptions();}
        this.jobID = jobID;
        this.jobName = jobName;
        this.jobType = jobType;
        this.jobDescription = jobDescription;
        this.jobSalary = jobSalary;
        this.education = education;
        this.hrName = hrName;
    }

    public int getJobID()throws InvalidIDFormatExceptions {
        if (jobID<1){throw new InvalidIDFormatExceptions();}
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public int getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(int jobSalary) {
        this.jobSalary = jobSalary;
    }

    public Education getEducation() {

        return education;
    }

    public void setMinEducation(Education minEducation) {
        this.education = minEducation;
    }

    public String gethrName() {
        return hrName;
    }

    public void sethrName(String hrName) {
        this.hrName = hrName;
    }
}

