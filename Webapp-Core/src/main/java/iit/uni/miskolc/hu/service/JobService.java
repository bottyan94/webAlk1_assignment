package iit.uni.miskolc.hu.service;

import iit.uni.miskolc.hu.exceptions.*;
import iit.uni.miskolc.hu.model.Education;
import iit.uni.miskolc.hu.model.Job;
import iit.uni.miskolc.hu.model.JobType;

import java.util.Collection;

public interface JobService {

    public Collection<Job> listJobs() throws JobsListIsEmptyException;
    public Collection<Job> listJobByHuf(int huf) throws NotFoundException;
    public Collection<Job> listJobByEdu(Education education) throws NotFoundException;
    public Collection<Job> listJobByType(JobType jobType) throws NotFoundException;


}
