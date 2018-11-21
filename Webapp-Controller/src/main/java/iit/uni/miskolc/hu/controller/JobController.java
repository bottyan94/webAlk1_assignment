package iit.uni.miskolc.hu.controller;


import iit.uni.miskolc.hu.model.JobType;
import iit.uni.miskolc.hu.service.JobService;
import iit.uni.miskolc.hu.model.Job;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public Collection<Job> listJob(){
        return jobService.listJobs();


    }
    @RequestMapping(value = "/byType", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Job> listJobByType(@RequestParam(value = "type") JobType type){
        return jobService.listJobByType(type);


    }
    @RequestMapping(value = "/byHuf", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Job> listJobByHuf(@RequestParam(value = "huf") int huf){
        return jobService.listJobByHuf(huf);


    }

}
