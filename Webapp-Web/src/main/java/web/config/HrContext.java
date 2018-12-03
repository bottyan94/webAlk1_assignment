package web.config;

import iit.uni.miskolc.hu.controller.HrController;
import iit.uni.miskolc.hu.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@Configuration
@ComponentScan
public class HrContext {
    private final HrService hrService;

    @Autowired
    public HrContext(HrService hrService){this.hrService=hrService;}

    @Bean
    public HrController hrController(){
        return new HrController(hrService);
    }
}
