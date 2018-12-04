package iit.uni.miskolc.hu.controller;


import dto.JobDTO;
import iit.uni.miskolc.hu.controller.converter.Converter;
import iit.uni.miskolc.hu.exceptions.*;
import iit.uni.miskolc.hu.model.Education;
import iit.uni.miskolc.hu.model.JobType;
import iit.uni.miskolc.hu.service.JobService;
import iit.uni.miskolc.hu.model.Job;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public Collection<JobDTO> listJob() throws JobsListIsEmptyException {
        return Converter.marshalJobList((ArrayList<Job>) jobService.listJobs());


    }
    @RequestMapping(value = "/byType", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJobByType(@RequestParam(value = "type") JobType type) throws NotFoundException{
        return Converter.marshalJobList((ArrayList<Job>) jobService.listJobByType(type));


    }
    @RequestMapping(value = "/byBiggerThanHuf", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJobByBiggerThanHuf(@RequestParam(value = "huf") int huf) throws NotFoundException{
        return Converter.marshalJobList((ArrayList<Job>) jobService.listJobByHuf(huf));
    }

    @RequestMapping(value = "/byEducation", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJobByEducation(@RequestParam(value = "edu") Education education) throws NotFoundException{
        return Converter.marshalJobList((ArrayList<Job>) jobService.listJobByEdu(education));
    }


}
