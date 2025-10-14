package config;

import org.springframework.context.annotation.Import;
import recommender.CourseRecommender;
import beans.CourseRecommenderImpl2;
import external.CourseRecommenderImpl4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@Import(ExternalConfig.class)
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
