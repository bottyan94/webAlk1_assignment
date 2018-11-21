package web.config;

import iit.uni.miskolc.hu.DAO.JobDAOImpl;
import iit.uni.miskolc.hu.daoService.JobDAO;
import iit.uni.miskolc.hu.service.JobService;
import iit.uni.miskolc.hu.serviceImpl.JobServiceImpl;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobMethodContext {

    @Bean
    public JobService jobService(){return new JobServiceImpl(); }
    @Bean
    @Required
    public JobDAO jobDAO(){return new JobDAOImpl();}
}
