package iit.uni.miskolc.hu.DAO;

import iit.uni.miskolc.hu.daoService.JobDAO;
import iit.uni.miskolc.hu.model.Education;
import iit.uni.miskolc.hu.model.Job;
import iit.uni.miskolc.hu.model.JobType;

import java.util.ArrayList;
import java.util.Collection;

import static iit.uni.miskolc.hu.model.Education.HIGH_SCHOOL;
import static iit.uni.miskolc.hu.model.Education.PRIMARY;
import static iit.uni.miskolc.hu.model.JobType.CASUAL;
import static iit.uni.miskolc.hu.model.JobType.DEVELOPER;

public class JobDAOImpl implements JobDAO {
    private Collection<Job> jobs;

    public JobDAOImpl(){
        jobs = new ArrayList<>();
        jobs.add(new Job(1,"Dog walking", CASUAL,"Playing with dog.","500",PRIMARY, "Tomi"));
        jobs.add(new Job(2,"Cashier", CASUAL,"Work with money.","800",HIGH_SCHOOL, "Tomi"));
        jobs.add(new Job(3,"Trainee", CASUAL,"Making coffee.","1000",PRIMARY, "Tomi"));


    }

    @Override
    public Collection<Job> listJob() {
        return this.jobs;
    }
}
