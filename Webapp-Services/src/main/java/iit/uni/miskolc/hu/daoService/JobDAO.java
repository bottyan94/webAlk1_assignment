package iit.uni.miskolc.hu.daoService;

import iit.uni.miskolc.hu.model.Education;
import iit.uni.miskolc.hu.model.Job;
import iit.uni.miskolc.hu.model.JobType;

import java.util.Collection;

public interface JobDAO {
    public Collection<Job> listJob();
    public Collection<Job> listJobByHuf(int huf);
    public Collection<Job> listJobByEdu(Education education);
    public Collection<Job> listJobByType(JobType type);
    public void addJob(Job job);
}
