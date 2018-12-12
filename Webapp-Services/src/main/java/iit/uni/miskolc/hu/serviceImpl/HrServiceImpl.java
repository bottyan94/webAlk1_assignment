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
    @Autowired
    private HrDAO hrDAO;

    @Override
    public Collection<Hr> listHr() throws HrListIsEmptyException {
        if(hrDAO.listHr().isEmpty()) {throw new HrListIsEmptyException();}
        return hrDAO.listHr();
    }

    @Override
    public void addJob(Job job) throws AlreadyExistException, InvalidIDFormatExceptions {
        for (Job j : jobDAO.listJob()) {
            if (j.getJobID() == job.getJobID()) {
                throw new AlreadyExistException();
            }
        }
        jobDAO.addJob(job);
    }

    @Override
    public Job lastAdded() {
        ArrayList<Job> lastAdded = new ArrayList(jobDAO.listJob());

        return lastAdded.get(lastAdded.size() - 1);
    }

    @Override
    public Collection<Job> listJobsByHrName(String hrName) {
        Collection<Job> jobList = new ArrayList<>();

        for (Job job : jobDAO.listJob()) {
            if (job.gethrName().equals(hrName))
                jobList.add(job);
        }

        return jobList;
    }




}


