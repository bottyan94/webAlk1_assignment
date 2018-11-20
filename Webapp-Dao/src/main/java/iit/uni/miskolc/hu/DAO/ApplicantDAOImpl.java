package iit.uni.miskolc.hu.DAO;

import iit.uni.miskolc.hu.daoService.ApplicantDAO;
import iit.uni.miskolc.hu.model.Applicant;

import java.util.ArrayList;
import java.util.Collection;

import static iit.uni.miskolc.hu.model.Education.ACADEMY;
import static iit.uni.miskolc.hu.model.Education.PRIMARY;
import static iit.uni.miskolc.hu.model.Education.UNIVERSITY;
import static iit.uni.miskolc.hu.model.Genre.MAN;
import static iit.uni.miskolc.hu.model.Genre.WOMAN;

public class ApplicantDAOImpl implements ApplicantDAO {

    private Collection<Applicant> applicants;

    public ApplicantDAOImpl(){
        applicants = new ArrayList<>();
        applicants.add(new Applicant(1,"Dog","3",MAN,"dog@doggy.com",PRIMARY));
        applicants.add(new Applicant(2,"Cat","1",WOMAN,"cat@kitten.com",UNIVERSITY));
        applicants.add(new Applicant(3,"Cock","2",MAN,"cock@hen.com",ACADEMY));

    }

    @Override
    public Collection<Applicant> listApplicant() {
        return this.applicants;
    }
}
