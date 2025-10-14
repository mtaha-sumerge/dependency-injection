package beans;

import model.Course;
import org.springframework.stereotype.Component;
import recommender.CourseRecommender;

import java.util.List;

@Component
public class CourseRecommenderImpl3 implements CourseRecommender {
    @Override
    public List<Course> recommendedCourses() {
        return List.of(
                new Course("Advanced Database Systems"),
                new Course("Operating Systems"),
                new Course("Parallel Computing"),
                new Course("Machine Intelligence")
        );
    }
}
