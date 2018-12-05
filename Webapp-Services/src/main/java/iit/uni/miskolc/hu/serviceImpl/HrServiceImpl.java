package iit.uni.miskolc.hu.serviceImpl;

import iit.uni.miskolc.hu.daoService.HrDAO;
import iit.uni.miskolc.hu.daoService.JobDAO;
import iit.uni.miskolc.hu.exceptions.*;
import iit.uni.miskolc.hu.model.Hr;
import iit.uni.miskolc.hu.model.Job;
import iit.uni.miskolc.hu.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;

public class HrServiceImpl implements HrService {
    @Autowired
    private JobDAO jobDAO;

    @Override
    public void addJob(Job job) throws AlreadyExist{
       for(Job j : jobDAO.listJob()){
           if (j.getJobID() == job.getJobID()){
               throw new AlreadyExist();
           }
       }
       jobDAO.addJob(job);
    }

    @Override
    public Job lastAdded() {
        return jobDAO.lastAdded();
    }


}


