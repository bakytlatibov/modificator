package course;


import java.util.Arrays;

public class Course  {
    private String courseName;
    private int number;
    private String nameTeacher;
    private String[]groups;
    public Course(){

    }

    public Course(String courseName, int number, String nameTeacher, String[] groups) {
        this.courseName = courseName;
        this.number = number;
        this.nameTeacher = nameTeacher;
        this.groups = groups;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String[] getGroups() {
        return groups;
    }

    public void setGroups(String[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Course{" + "courseName='" + courseName + '\'' + ", number=" + number + ", nameTeacher='" + nameTeacher + '\'' + ", groups=" + Arrays.toString(groups) + '}';
    }
}

