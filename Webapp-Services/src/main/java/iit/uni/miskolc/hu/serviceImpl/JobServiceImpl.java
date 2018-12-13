package iit.uni.miskolc.hu.serviceImpl;

import iit.uni.miskolc.hu.daoService.JobDAO;
import iit.uni.miskolc.hu.exceptions.*;
import iit.uni.miskolc.hu.model.Job;
import iit.uni.miskolc.hu.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;

public class JobServiceImpl implements JobService {

    @Autowired
    private JobDAO jobDAO;

    @Override
    public Collection<Job> listJobs() throws JobsListIsEmptyException {
        if (jobDAO.listJob().isEmpty()) {
            throw new JobsListIsEmptyException();
        }
        return jobDAO.listJob();
    }

    @Override
    public Collection<Job> listJobByHuf(int huf) throws WrongHufValueExcception {
        if (huf <= 0) {
            throw new WrongHufValueExcception();
        }

        Collection<Job> jobList = new ArrayList<>();
        for (Job job : jobDAO.listJob()) {
            if (job.getJobSalary() >= huf)
                jobList.add(job);
        }

        return jobList;
    }

    @Override
    public Collection<Job> listJobByEdu(String education) throws NotFoundException {
        Collection<Job> jobList = new ArrayList<>();
        for (Job job : jobDAO.listJob()) {
            if (job.getEducation().toString().equals(education)) {
                jobList.add(job);
            }
        }
        if (jobList.isEmpty()){ throw new NotFoundException();}
        return jobList;
    }

    @Override
    public Collection<Job> listJobByType(String type) throws NotFoundException {
        Collection<Job> jobList = new ArrayList<>();

        for (Job job : jobDAO.listJob()) {
            if (job.getJobType().toString().equals(type))
                jobList.add(job);
        }if (jobList.isEmpty()){ throw new NotFoundException();}
        return jobList;
    }

    @Override
    public Collection<Job> listJobByName(String name) throws NotFoundException {
        Collection<Job> jobList = new ArrayList<>();

        for (Job job : jobDAO.listJob()) {
            if (job.getJobName().contains(name))
                jobList.add(job);
        }if (jobList.isEmpty()){ throw new NotFoundException();}
        return jobList;
    }


}
