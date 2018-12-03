package iit.uni.miskolc.hu.serviceImpl;

import iit.uni.miskolc.hu.daoService.JobDAO;
import iit.uni.miskolc.hu.model.Job;
import iit.uni.miskolc.hu.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;

public class HrServiceImpl implements HrService {
    @Autowired
    private JobDAO jobDAO;

    @Override
    public void addJob(Job job) {jobDAO.addJob(job);}
    }


