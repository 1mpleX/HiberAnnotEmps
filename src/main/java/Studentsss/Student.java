package Studentsss;

public class Student {

    private String nameSurname;
    private int course;
    private double avg;

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public Student(String nameSurname, double avg, int course) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avg = avg;
    }


    public String toString(){
        return "nameSuename: "+nameSurname + " avg: " + avg + " course: " + course;
    }


}
