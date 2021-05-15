package onem.mfs.springdemo.bean;

public class Student {

    private String username;

    private String schoolName;

    public String getUsername(){
        return username;
    }
    public String getSchoolName(){
        return schoolName;
    }

    public void setUsername(String username){
        System.out.println("set方法执行了");
        this.username = username;
    }
    public void setSchoolName(String schoolName){

        System.out.println("set方法执行了");
        this.schoolName = schoolName;
    }
    public Student(){
        System.out.println("student构造方法执行了");
    }

    public void customInitMethod(){
        System.out.println("initmethod执行了");
    }
}
