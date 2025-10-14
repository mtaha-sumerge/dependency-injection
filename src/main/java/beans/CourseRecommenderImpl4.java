package beans;

import model.Course;

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
