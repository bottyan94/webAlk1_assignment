package iit.uni.miskolc.hu.daoService;

import iit.uni.miskolc.hu.model.Education;
import iit.uni.miskolc.hu.model.Job;
import iit.uni.miskolc.hu.model.JobType;

import java.util.Collection;

public interface JobDAO {
    public Collection<Job> listJob();
    public void addJob(Job job);
}
