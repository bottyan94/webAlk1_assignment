package iit.uni.miskolc.hu.controller;


import dto.JobDTO;
import iit.uni.miskolc.hu.controller.converter.Converter;
import iit.uni.miskolc.hu.model.Education;
import iit.uni.miskolc.hu.model.JobType;
import iit.uni.miskolc.hu.service.JobService;
import iit.uni.miskolc.hu.model.Job;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public Collection<JobDTO> listJob(){
        return Converter.marshalJobList((ArrayList<Job>) jobService.listJobs());


    }
    @RequestMapping(value = "/byType", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJobByType(@RequestParam(value = "type") JobType type){
        return Converter.marshalJobList((ArrayList<Job>) jobService.listJobByType(type));


    }
    @RequestMapping(value = "/byBiggerThanHuf", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJobByBiggerThanHuf(@RequestParam(value = "huf") int huf){
        return Converter.marshalJobList((ArrayList<Job>) jobService.listJobByHuf(huf));
    }

    @RequestMapping(value = "/byEducation", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJobByEducation(@RequestParam(value = "edu") Education education){
        return Converter.marshalJobList((ArrayList<Job>) jobService.listJobByEdu(education));
    }
   /* @RequestMapping(value = "/byHr", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJobByHrName(@RequestParam(value = "name") String name){
        return Converter.marshalList((ArrayList<Job>) jobService.listJobByHrName(name);
    }*/

}
