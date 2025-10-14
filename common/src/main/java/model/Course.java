package model;

import javax.annotation.processing.Generated;
import java.util.UUID;

public class Course {
    private UUID courseCode = UUID.randomUUID();
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public UUID getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
}
