package iit.uni.miskolc.hu.model;



public class Job {

    private int jobID;
    private String jobName;
    private JobType jobType;
    private String jobDescription;
    private int jobSalary;
    private Education minEducation;
    private String hrName;

    public Job(int jobID, String jobName, JobType jobType, String jobDescription, int jobSalary, Education minEducation, String hrName) {
        this.jobID = jobID;
        this.jobName = jobName;
        this.jobType = jobType;
        this.jobDescription = jobDescription;
        this.jobSalary = jobSalary;
        this.minEducation = minEducation;
        this.hrName = hrName;
    }

    public int getJobID() {
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

    public Education getMinEducation() {
        return minEducation;
    }

    public void setMinEducation(Education minEducation) {
        this.minEducation = minEducation;
    }

    public String gethrName() {
        return hrName;
    }

    public void sethrName(String hrName) {
        this.hrName = hrName;
    }
}

