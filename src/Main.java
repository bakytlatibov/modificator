import course.Course;
import group.Group;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        student.setAge(2000);
        student.setName("Bakytbek");
        student.setSorname("Latibov");
        student.setEmail("bakyt.11@mail.com");
        System.out.println(student.toString());
        student.age1();
        System.out.println(">>>>>>>>>>");

        Course course=new Course();
        course.setCourseName("Java");
        course.setNameTeacher("Timrlan");
        course.setGroups(new String[]{"Java2","Java3","Java4","Java5"});
        System.out.println(course.toString());
        System.out.println(">>>>>>>>>");
        Group group=new Group();

        group.setStudents(new String[]{"Bakyt","Asan","Uson","Mairam","Nurisa","и другие"});
        group.setUchit("Java programmirovanie");
        group.setData("05.12.2022");
        System.out.println(group.toString());



    }
}