package hashset_program.Unique_Course_Enrollment;

public class Course {
    private int Course_code;

    public Course(int course_code) {
        Course_code = course_code;
    }

    public int getCourse_code() {
        return Course_code;
    }

    public void setCourse_code(int course_code) {
        Course_code = course_code;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Course_code=" + Course_code +
                '}';
    }
}
