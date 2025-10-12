package beans;

import model.Course;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseRecommenderImpl2 implements CourseRecommender {
    @Override
    public List<Course> recommendedCourses() {
        return List.of(
                new Course("HTML"),
                new Course("CSS"),
                new Course("JavaScript"),
                new Course("Angular")
        );
    }
}
