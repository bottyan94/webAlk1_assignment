package iit.uni.miskolc.hu.DAO;

import iit.uni.miskolc.hu.daoService.JobDAO;
import iit.uni.miskolc.hu.model.Job;
import iit.uni.miskolc.hu.model.JobType;

import java.util.ArrayList;
import java.util.Collection;

public class JobDAOImpl implements JobDAO {
    private Collection<Job> jobs;

    public JobDAOImpl(){
        jobs = new ArrayList<>();
        jobs.add(new Job(1,"Dog walking", JobType.CASUAL,"Dogs should be taken walked.","few"));
        jobs.add(new Job(2,"Playing with a kitten", JobType.CASUAL,"Playing with a kitten.","few"));


    }

    @Override
    public Collection<Job> listJob() {
        return this.jobs;
    }
}
