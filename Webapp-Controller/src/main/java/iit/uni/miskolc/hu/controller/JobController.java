package iit.uni.miskolc.hu.controller;


import dto.JobDTO;
import iit.uni.miskolc.hu.controller.converter.Converter;
import iit.uni.miskolc.hu.exceptions.*;
import iit.uni.miskolc.hu.model.Education;
import iit.uni.miskolc.hu.model.JobType;
import iit.uni.miskolc.hu.service.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@RequestMapping("/job")
public class JobController {

    private JobService jobService;


    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJob() throws JobsListIsEmptyException, InvalidIDFormatExceptions {
        return Converter.marshalJobList(jobService.listJobs());
    }

    @RequestMapping(value = "/byType", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJobByType(@RequestParam(value = "type") String type) throws WrongHufValueExcception, NotFoundException, InvalidIDFormatExceptions {
        return Converter.marshalJobList(jobService.listJobByType(type));
    }

    @RequestMapping(value = "/byEducation", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJobByEducation(@RequestParam(value = "edu") String education) throws WrongHufValueExcception, NotFoundException, InvalidIDFormatExceptions {
        return Converter.marshalJobList(jobService.listJobByEdu(education));
    }

    @RequestMapping(value = "/byName", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJobByName(@RequestParam(value = "name") String name) throws NotFoundException, InvalidIDFormatExceptions {
        return Converter.marshalJobList(jobService.listJobByName(name));
    }

    @RequestMapping(value = "/byBiggerThanHuf", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJobByBiggerThanHuf(@RequestParam(value = "huf") int huf) throws WrongHufValueExcception, InvalidIDFormatExceptions {
        return Converter.marshalJobList(jobService.listJobByHuf(huf));
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Bad value try some other.")
    @ExceptionHandler({WrongHufValueExcception.class, InvalidIDFormatExceptions.class})
    public void listIsEmptyHandler() {
        //TODO
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Not found. List is Empty!")
    @ExceptionHandler({NotFoundException.class, JobsListIsEmptyException.class, HrListIsEmptyException.class})
    public void notFoundHandler() {
        //TODO
    }

    @ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE, reason = "Can not be added to it. Already exists")
    @ExceptionHandler({AlreadyExistException.class})
    public void alreadyExistHandler() {
        //TODO
    }


}
