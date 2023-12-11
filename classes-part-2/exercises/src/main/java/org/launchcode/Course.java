package org.launchcode;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;


    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @Override
    public String toString() {
        return "Course{" +
                "enrolledStudents=" + enrolledStudents +
                '}';
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Course theCourse = (Course) toBeCompared;
        return theCourse.getEnrolledStudents() == getEnrolledStudents();
    }

    private Object getEnrolledStudents() {
        return null;
    }
}
