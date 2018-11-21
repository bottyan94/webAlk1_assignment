package web.config;

import iit.uni.miskolc.hu.service.ApplicantService;
import iit.uni.miskolc.hu.controller.ApplicantController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@Configuration
@ComponentScan
public class ApplicantContext {

    private final ApplicantService applicantService;

    @Autowired
    public ApplicantContext(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @Bean
    public ApplicantController applicantController(){
        return new ApplicantController(applicantService);
    }

}
