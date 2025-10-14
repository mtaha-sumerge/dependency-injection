package external;

import model.Course;
import recommender.CourseRecommender;

import java.util.List;

public class CourseRecommenderImpl4 implements CourseRecommender {
    @Override
    public List<Course> recommendedCourses() {
        return List.of(
                new Course("Mongo DB"),
                new Course("Express"),
                new Course("React"),
                new Course("Node")
        );
    }
}
