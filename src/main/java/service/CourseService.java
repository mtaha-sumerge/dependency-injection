package service;

import beans.CourseRecommender;
import model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private CourseRecommender courseRecommender;

//    @Autowired
//    private CourseRecommender courseRecommenderImpl2; // by variable name

    // Constructor injection
    @Autowired
    public CourseService(CourseRecommender courseRecommender) {
        this.courseRecommender = courseRecommender;
    }

    // Setter autowiring
//    @Autowired
//    public void setCourseRecommender(@Qualifier("courseRecommenderImpl2") CourseRecommender courseRecommender) {
//        this.courseRecommender = courseRecommender;
//    }

    public List<Course> getRecommendedCourses() {
        return courseRecommender.recommendedCourses();
    }
}
