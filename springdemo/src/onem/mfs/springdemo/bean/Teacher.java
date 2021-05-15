package onem.mfs.springdemo.bean;

public class Teacher {

    private String username;

    private String schoolName;

    public String getUsername(){
        return username;
    }
    public String getSchoolName(){
        return schoolName;
    }

    public void setUsername(String username){
        System.out.println("teacherset方法执行了");
        this.username = username;
    }
    public void setSchoolName(String schoolName){

        System.out.println("teacherset方法执行了");
        this.schoolName = schoolName;
    }
    public Teacher(){
        System.out.println("teacher构造方法执行了");
    }

    public void customInitMethod(){
        System.out.println("teacherinitmethod执行了");
    }
}
