import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import com.pluralsight.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

    @Bean("calendarInstance")
    public CalendarFactory calFactory(){
        CalendarFactory calendarFactory = new CalendarFactory();
        calendarFactory.addDays(2);
        return calendarFactory;
    }

//    Method Name = Bean Name
    @Bean
    public Calendar calendarInstance() throws Exception {
        return calFactory().getObject();
    }

/*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){

//        Setter Injection
//        SpeakerServiceImpl service = new SpeakerServiceImpl();
//        service.setRepository(getSpeakerRepository());

//        Constructor Injection
//        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());

//        Testing Autowired
//        SpeakerServiceImpl service = new SpeakerServiceImpl();
//        return service;

    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
 */
}
