package iit.uni.miskolc.hu.serviceImpl;

import iit.uni.miskolc.hu.daoService.ApplicantDAO;
import iit.uni.miskolc.hu.model.Applicant;
import iit.uni.miskolc.hu.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;


public class ApplicantServiceImpl   implements ApplicantService {

    @Autowired
    private ApplicantDAO applicantDAO;

    @Override
    public Collection<Applicant> listApplicants() {
        return applicantDAO.listApplicant();
    }


}
