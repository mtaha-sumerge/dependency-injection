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

    // Constructor injection
    @Autowired
    public CourseService(@Qualifier("courseRecommenderImpl4") CourseRecommender courseRecommender) {
        this.courseRecommender = courseRecommender;
    }

    public List<Course> getRecommendedCourses() {
        return courseRecommender.recommendedCourses();
    }
}
