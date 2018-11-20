package iit.uni.miskolc.hu.serviceImpl;

import iit.uni.miskolc.hu.daoService.JobDAO;
import iit.uni.miskolc.hu.model.Job;
import iit.uni.miskolc.hu.JobService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class JobServiceImpl implements JobService {

    @Autowired
    private JobDAO jobDAO;

    @Override
    public Collection<Job> listJobs() {
        return jobDAO.listJob();
    }
}
