package config;

import beans.CourseRecommender;
import beans.CourseRecommenderImpl2;
import beans.CourseRecommenderImpl4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"beans", "service", "model"})
public class AppConfig {

    @Bean("courseRecommenderImpl2")
    public CourseRecommender courseRecommender2() {
        return new CourseRecommenderImpl2();
    }

    @Bean("courseRecommenderImpl4")
    public CourseRecommender courseRecommender4() {
        return new CourseRecommenderImpl4();
    }

}
