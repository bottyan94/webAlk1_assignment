package web.config;

import iit.uni.miskolc.hu.service.ApplicantService;
import iit.uni.miskolc.hu.DAO.ApplicantDAOImpl;
import iit.uni.miskolc.hu.daoService.ApplicantDAO;
import iit.uni.miskolc.hu.serviceImpl.ApplicantServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicantMethodContext {

    @Bean
    public ApplicantService applicantService(){
        return new ApplicantServiceImpl();
    }
    @Bean
    public ApplicantDAO applicantDAO(){
        return new ApplicantDAOImpl();
    }

}
