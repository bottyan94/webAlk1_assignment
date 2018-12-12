package iit.uni.miskolc.hu.controller;


import dto.JobDTO;
import iit.uni.miskolc.hu.controller.converter.Converter;
import iit.uni.miskolc.hu.exceptions.*;
import iit.uni.miskolc.hu.model.Education;
import iit.uni.miskolc.hu.model.JobType;
import iit.uni.miskolc.hu.service.JobService;
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
    public Collection<JobDTO> listJob() throws JobsListIsEmptyException, InvalidIDFormatExceptions{
        return Converter.marshalJobList(jobService.listJobs());
    }

    @RequestMapping(value = "/byType", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJobByType(@RequestParam(value = "type") JobType type) throws NotFoundException, InvalidIDFormatExceptions {
        return Converter.marshalJobList(jobService.listJobByType(type));
    }

    @RequestMapping(value = "/byBiggerThanHuf", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJobByBiggerThanHuf(@RequestParam(value = "huf") int huf) throws NotFoundException, InvalidIDFormatExceptions {
        return Converter.marshalJobList(jobService.listJobByHuf(huf));
    }

    @RequestMapping(value = "/byEducation", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJobByEducation(@RequestParam(value = "edu") Education education) throws NotFoundException, InvalidIDFormatExceptions {
        return Converter.marshalJobList(jobService.listJobByEdu(education));
    }


}
