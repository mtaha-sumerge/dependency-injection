import config.AppConfig;
import model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CourseService;

import java.util.List;

public class Application {
    static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CourseService courseService = context.getBean(CourseService.class);

        List<Course> courses = courseService.getRecommendedCourses();

        for(Course course : courses) {
            System.out.println(course.getCourseCode() + " " +  course.getCourseName());
        }
    }
}
