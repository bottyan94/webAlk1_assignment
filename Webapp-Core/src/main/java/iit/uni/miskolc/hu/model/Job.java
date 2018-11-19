package iit.uni.miskolc.hu.model;

import java.util.Collection;

public class Job {

    private String jobID;
    private String jobName;
    private JobType jobType;
    private String jobDescription;
    private String jobSalary;


    public Job(String jobID, String jobName, JobType jobType, String jobDescription, String jobSalary) {
        this.jobID = jobID;
        this.jobName = jobName;
        this.jobType = jobType;
        this.jobDescription = jobDescription;
        this.jobSalary = jobSalary;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
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

    public String getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(String jobSalary) {
        this.jobSalary = jobSalary;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobID='" + jobID + '\'' +
                ", jobName='" + jobName + '\'' +
                ", jobType='" + jobType + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", jobSalary='" + jobSalary + '\'' +
                '}';
    }
}
