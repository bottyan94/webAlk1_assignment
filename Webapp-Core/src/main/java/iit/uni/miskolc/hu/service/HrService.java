package iit.uni.miskolc.hu.service;

import iit.uni.miskolc.hu.exceptions.AlreadyExist;
import iit.uni.miskolc.hu.model.Hr;
import iit.uni.miskolc.hu.model.Job;
import iit.uni.miskolc.hu.model.JobType;

import java.util.Collection;

public interface HrService {
    public void addJob(Job job) throws AlreadyExist;
    public Job lastAdded();

}
