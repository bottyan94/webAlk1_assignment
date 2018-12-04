package iit.uni.miskolc.hu.serviceImpl;

import iit.uni.miskolc.hu.daoService.JobDAO;
import iit.uni.miskolc.hu.exceptions.*;
import iit.uni.miskolc.hu.model.Education;
import iit.uni.miskolc.hu.model.Job;
import iit.uni.miskolc.hu.model.JobType;
import iit.uni.miskolc.hu.service.JobService;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.beans.factory.annotation.Autowired;

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
    public Collection<Job> listJobByHuf(int huf) throws NotFoundException{
        Collection<Job> jobList =jobDAO.listJobByHuf(huf);
        if ((jobList == null) || jobList.size()==0 || String.valueOf(jobList).isEmpty()){
            throw new NotFoundException();
        }

        return jobDAO.listJobByHuf(huf);
    }

    @Override
    public Collection<Job> listJobByEdu(Education education) throws NotFoundException {
        Collection<Job> jobList =jobDAO.listJobByEdu(education);
        if ((jobList == null) || jobList.size()==0 || String.valueOf(jobList).isEmpty()){
            throw new NotFoundException();
        }
        return jobDAO.listJobByEdu(education);
    }

    @Override
    public Collection<Job> listJobByType(JobType jobType) throws NotFoundException {
        Collection<Job> jobList =jobDAO.listJobByType(jobType);
        if ((jobList == null) || jobList.size()==0 || String.valueOf(jobList).isEmpty()){
            throw new NotFoundException();
        }
        return jobDAO.listJobByType(jobType);
    }



}
