package iit.uni.miskolc.hu.service;

import iit.uni.miskolc.hu.exceptions.*;
import iit.uni.miskolc.hu.model.Hr;
import iit.uni.miskolc.hu.model.Job;

import java.util.Collection;

public interface HrService {
    public Collection<Hr> listHr() throws HrListIsEmptyException;

    public Collection<Job> listJobsByHrName(String hrName) throws NotFoundException;

    public void addJob(Job job) throws AlreadyExistException, InvalidIDFormatExceptions;

    public Job lastAdded() throws NotFoundException;

}
