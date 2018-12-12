package iit.uni.miskolc.hu.controller;

import dto.HrDTO;
import dto.JobDTO;
import iit.uni.miskolc.hu.controller.converter.Converter;
import iit.uni.miskolc.hu.exceptions.*;
import iit.uni.miskolc.hu.service.HrService;
import org.springframework.http.HttpStatus;
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
    public JobDTO addJob(@RequestParam(value = "id") int id, @RequestParam(value = "name") String name, @RequestParam(value = "type") String type, @RequestParam(value = "desc") String desc, @RequestParam(value = "salary") int salary, @RequestParam(value = "hrName") String hrName, @RequestParam(value = "edu") String edu) throws AlreadyExistException, NotFoundException, InvalidIDFormatExceptions {
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
    public JobDTO lastAdded() throws NotFoundException, InvalidIDFormatExceptions {

        return Converter.marshalJob(hrService.lastAdded());
    }

    @RequestMapping(value = "/byHrName", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTO> listJobsByHrName(@RequestParam(value = "hrName") String hrName) throws NotFoundException, InvalidIDFormatExceptions {
        return Converter.marshalJobList(hrService.listJobsByHrName(hrName));
    }

    @RequestMapping(value = "/listHr", method = RequestMethod.GET)
    @ResponseBody
    public Collection<HrDTO> listHr() throws HrListIsEmptyException, InvalidIDFormatExceptions {
        return Converter.marshalHrList(hrService.listHr());
    }


    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "List is Empty")
    @ExceptionHandler({JobsListIsEmptyException.class, HrListIsEmptyException.class})
    public void listIsEmptyHandler(){
        //TODO
    }
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Not found. Bad value try some other!")
    @ExceptionHandler({NotFoundException.class, WrongHufValueExcception.class,InvalidIDFormatExceptions.class})
    public void notFoundHandler(){
        //TODO
    }
    @ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE, reason = "Can not be added to it. Already exists")
    @ExceptionHandler({AlreadyExistException.class})
    public void alreadyExistHandler(){
        //TODO
    }

}




