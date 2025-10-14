package config;

import external.CourseRecommenderImpl4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import recommender.CourseRecommender;

@Configuration
public class ExternalConfig {

    @Bean("courseRecommenderImpl4")
    public CourseRecommender courseRecommender() {
        return new CourseRecommenderImpl4();
    }

}
