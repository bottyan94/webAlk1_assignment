package iit.uni.miskolc.hu.service;

import iit.uni.miskolc.hu.model.Job;
import iit.uni.miskolc.hu.model.JobType;

import java.util.Collection;

public interface JobService {

    public Collection<Job> listJobs();
    public Collection<Job> listJobByHuf(int huf);
    public Collection<Job> listJobByType(JobType jobType);
}
