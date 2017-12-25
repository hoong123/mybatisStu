package po;

import enums.SexEnum;

import java.io.Serializable;
import java.util.List;

public class StudentBean implements Serializable{
    private int id;
    private String cname;
    private SexEnum sex;
    private StudentSelfcardBean studentSelfcard;
    private String note;
    private List<StudentLectureBean> studentLectureBeanList;

    public List<StudentLectureBean> getStudentLectureBeanList() {
        return studentLectureBeanList;
    }

    public void setStudentLectureBeanList(List<StudentLectureBean> studentLectureBeanList) {
        this.studentLectureBeanList = studentLectureBeanList;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", sex=" + sex +
                ", studentSelfcard=" + studentSelfcard +
                ", note='" + note + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }


    public StudentSelfcardBean getStudentSelfcard() {
        return studentSelfcard;
    }

    public void setStudentSelfcard(StudentSelfcardBean studentSelfcard) {
        this.studentSelfcard = studentSelfcard;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
