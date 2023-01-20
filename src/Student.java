public class Student {
    private int age;
    private String name;
    private   String sorname;
    private   String email;

    public Student(int age, String name, String sorname, String email) {
        this.age = age;
        this.name = name;
        this.sorname = sorname;
        this.email = email;
    }
    public Student(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSorname() {
        return sorname;
    }

    public void setSorname(String sorname) {
        this.sorname = sorname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void age1(){
       if (getAge()<2010){
           System.out.println("siz studentsiz");
       }
       else {
           System.out.println("Jashynyz jetpeit");


    }
}

    @Override
    public String toString() {
        return "Student{" + "age=" + age + ", name='" + name + '\'' + ", sorname='" + sorname + '\'' + ", email='" + email + '\'' + '}';
    }}
