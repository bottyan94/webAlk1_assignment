package iit.uni.miskolc.hu.controller;


import iit.uni.miskolc.hu.service.ApplicantService;
import iit.uni.miskolc.hu.model.Applicant;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
@RequestMapping("/applicant")
public class ApplicantController {

    private ApplicantService applicantService;


    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Collection<Applicant> listApplicants(){
        return applicantService.listApplicants();
    }
}
