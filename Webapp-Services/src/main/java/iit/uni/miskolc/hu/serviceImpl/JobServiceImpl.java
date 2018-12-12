package iit.uni.miskolc.hu.serviceImpl;

import iit.uni.miskolc.hu.daoService.JobDAO;
import iit.uni.miskolc.hu.exceptions.*;
import iit.uni.miskolc.hu.model.Education;
import iit.uni.miskolc.hu.model.Job;
import iit.uni.miskolc.hu.model.JobType;
import iit.uni.miskolc.hu.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;

public class JobServiceImpl implements JobService {

    @Autowired
    private JobDAO jobDAO;

    @Override
    public Collection<Job> listJobs() throws JobsListIsEmptyException {
        if(jobDAO.listJob().isEmpty()) {throw new JobsListIsEmptyException();}
        return jobDAO.listJob();
    }

    @Override
    public Collection<Job> listJobByHuf(int huf) {
        Collection<Job> jobList = new ArrayList<Job>();
        for (Job job : jobDAO.listJob()) {
            if (job.getJobSalary() >= huf)
                jobList.add(job);
        }

        return jobList;
    }
    @Override
    public Collection<Job> listJobByEdu(Education education) {
        Collection<Job> jobList = new ArrayList<Job>();

        for (Job job : jobDAO.listJob()) {
            if (job.getEducation() == education)
                jobList.add(job);
        }
        return jobList;
    }

    @Override
    public Collection<Job> listJobByType(JobType type) {
        Collection<Job> jobList = new ArrayList<Job>();

        for (Job job : jobDAO.listJob()) {
            if (job.getJobType() == type)
                jobList.add(job);
        }
        return jobList;
    }


}
