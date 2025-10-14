package recommender;

import model.Course;

import java.util.List;

public interface CourseRecommender {

    List<Course> recommendedCourses();

}
