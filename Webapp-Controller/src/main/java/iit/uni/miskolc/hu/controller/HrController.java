package iit.uni.miskolc.hu.controller;

import dto.JobDTO;
import iit.uni.miskolc.hu.controller.converter.Converter;
import iit.uni.miskolc.hu.exceptions.AlreadyExist;
import iit.uni.miskolc.hu.model.Hr;
import iit.uni.miskolc.hu.model.Job;
import iit.uni.miskolc.hu.service.HrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

@Controller
@RequestMapping("/hr")
public class HrController {
    private HrService hrService;

    public HrController(HrService hrService){this.hrService=hrService;}

    //http://localhost:8080/hr/add?id=11&name="Asd"&type=CASUAL&desc="asd"&salary=2&hrName="Tomi"&edu=PRIMARY

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public void addJob(@RequestParam(value = "id")int id,@RequestParam(value = "name")String name,@RequestParam(value = "type") String type,@RequestParam(value = "desc")String desc,@RequestParam(value = "salary")int salary,@RequestParam(value = "hrName")String hrName,@RequestParam(value = "edu")String edu  )throws AlreadyExist {
       JobDTO jobDTO = new JobDTO();
       jobDTO.setJobID(BigInteger.valueOf(id));
       jobDTO.setJobName(name);
       jobDTO.setJobType(type);
       jobDTO.setJobDescription(desc);
       jobDTO.setJobSalary(salary);
       jobDTO.setHrName(hrName);
       jobDTO.setJobEducation(edu);
       hrService.addJob(Converter.unmarshalJob(jobDTO));
    }
    @RequestMapping(value = "/lastAdded", method = RequestMethod.GET)
    @ResponseBody
    public JobDTO lastAdded(){
        return Converter.marshalJob(hrService.lastAdded());
    }

}
