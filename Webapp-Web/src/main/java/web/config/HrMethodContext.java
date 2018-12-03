package web.config;

import iit.uni.miskolc.hu.DAO.HrDAOImpl;
import iit.uni.miskolc.hu.daoService.HrDAO;
import iit.uni.miskolc.hu.service.HrService;
import iit.uni.miskolc.hu.serviceImpl.HrServiceImpl;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HrMethodContext {
    @Bean
    public HrService hrService(){return new HrServiceImpl(); }

    @Bean
    @Required
    public HrDAO hrDAO(){return new HrDAOImpl();}
}