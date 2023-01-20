package group;

import java.util.Arrays;

public class Group {
    private String[] students;
    private  String uchit;
    private String data;

    public Group(String[] students, String uchit, String data) {
        this.students = students;
        this.uchit = uchit;
        this.data = data;
    }
    public Group(){

    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public String getUchit() {
        return uchit;
    }

    public void setUchit(String uchit) {
        this.uchit = uchit;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Group{" + "students=" + Arrays.toString(students) + ", uchit='" + uchit + '\'' + ", data='" + data + '\'' + '}';
    }
}
