package iit.uni.miskolc.hu.serviceImpl;

import iit.uni.miskolc.hu.daoService.JobDAO;
import iit.uni.miskolc.hu.model.Education;
import iit.uni.miskolc.hu.model.Job;
import iit.uni.miskolc.hu.model.JobType;
import iit.uni.miskolc.hu.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class JobServiceImpl implements JobService {

    @Autowired
    private JobDAO jobDAO;

    @Override
    public Collection<Job> listJobs() {
        return jobDAO.listJob();
    }

    @Override
    public Collection<Job> listJobByHuf(int huf) {
        return jobDAO.listJobByHuf(huf);
    }

    @Override
    public Collection<Job> listJobByEdu(Education education) {
        return jobDAO.listJobByEdu(education);
    }

    @Override
    public Collection<Job> listJobByType(JobType jobType) {
        return jobDAO.listJobByType(jobType);
    }
    @Override
    public void addJob(Job job){jobDAO.addJob(job);}

}
