package beans;

import model.Course;
import org.springframework.stereotype.Component;
import recommender.CourseRecommender;

import java.util.List;

// Implicit bean
@Component
//@Primary // this is the primary bean
public class CourseRecommenderImpl1 implements CourseRecommender {
    @Override
    public List<Course> recommendedCourses() {
        return List.of(
                new Course("SQL"),
                new Course("Spring"),
                new Course("Java")
        );
    }
}
