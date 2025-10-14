package beans;

import model.Course;
import recommender.CourseRecommender;

import java.util.List;

// Implicit bean
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
