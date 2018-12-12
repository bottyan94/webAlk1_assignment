package iit.uni.miskolc.hu.DAO;

import iit.uni.miskolc.hu.daoService.JobDAO;
import iit.uni.miskolc.hu.exceptions.*;
import iit.uni.miskolc.hu.model.Job;

import java.util.ArrayList;
import java.util.Collection;


import static iit.uni.miskolc.hu.model.Education.*;
import static iit.uni.miskolc.hu.model.JobType.*;

public class JobDAOImpl implements JobDAO {
    private Collection<Job> jobs;

    public JobDAOImpl() throws InvalidIDFormatExceptions{
        jobs = new ArrayList<>();
        jobs.add(new Job(1, "Dog walking", CASUAL, "Playing with dog.", 500, PRIMARY, "Tomi"));
        jobs.add(new Job(2, "Cashier", CASUAL, "Work with money.", 800, HIGH_SCHOOL, "Tomi"));
        jobs.add(new Job(3, "Dummy1", TRAINEE, "Making coffee.", 1000, PRIMARY, "Bottyan Tamas"));
        jobs.add(new Job(4, "Dummy2", DEVELOPER, "Dummy data.", 1100, PRIMARY, "Bottyan Tamas"));
        jobs.add(new Job(5, "Dummy3", DUMMY, "Dummy data.", 1200, ACADEMY, "Bottyan Tamas"));
        jobs.add(new Job(6, "Dummy4", TRAINEE, "Dummy data.", 300, ACADEMY, "asd"));
        jobs.add(new Job(7, "Dummy5", TEST, "Dummy data.", 200, UNIVERSITY, "asd"));
        jobs.add(new Job(8, "Dummy6", TEST, "Dummy data.", 400, UNIVERSITY, "asd"));


    }

    @Override
    public Collection<Job> listJob() {

        return this.jobs;
    }

    @Override
    public void addJob(Job job) {
        jobs.add(job);
    }


}
