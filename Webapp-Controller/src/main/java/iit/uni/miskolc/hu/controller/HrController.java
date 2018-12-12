package iit.uni.miskolc.hu.controller;

import dto.HrDTO;
import dto.JobDTO;
import iit.uni.miskolc.hu.controller.converter.Converter;
import iit.uni.miskolc.hu.exceptions.*;
import iit.uni.miskolc.hu.service.HrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.Collection;

@Controller
@RequestMapping("/hr")
public class HrController {
    private HrService hrService;

    public HrController(HrService hrService){
        this.hrService = hrService;
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public JobDTO addJob(@RequestParam(value = "id") int id, @RequestParam(value = "name") String name, @RequestParam(value = "type") String type, @RequestParam(value = "desc") String desc, @RequestParam(value = "salary") int salary, @RequestParam(value = "hrName") String hrName, @RequestParam(value = "edu") String edu) throws AlreadyExistException, InvalidIDFormatExceptions {
        JobDTO jobDTO = new JobDTO();
        jobDTO.setJobID(BigInteger.valueOf(id));
        jobDTO.setJobName(name);
        jobDTO.setJobType(type);
        jobDTO.setJobDescription(desc);
        jobDTO.setJobSalary(salary);
        jobDTO.setHrName(hrName);
        jobDTO.setJobEducation(edu);
        hrService.addJob(Converter.unmarshalJob(jobDTO));

        return Converter.marshalJob(hrService.lastAdded());
    }

    @RequestMapping(value = "/lastAdded", method = RequestMethod.GET)
    @ResponseBody
    public JobDTO lastAdded() throws InvalidIDFormatExceptions {

        return Converter.marshalJob(hrService.lastAdded());
    }

    @RequestMapping(value = "/ByHrName", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJobsByHrName(@RequestParam(value = "hrName") String hrName) throws InvalidIDFormatExceptions {
        return Converter.marshalJobList(hrService.listJobsByHrName(hrName));
    }

    @RequestMapping(value = "/ByHr", method = RequestMethod.GET)
    @ResponseBody
    public Collection<HrDTO> listHr() throws HrListIsEmptyException, InvalidIDFormatExceptions {
        return Converter.marshalHrList(hrService.listHr());
    }
}




