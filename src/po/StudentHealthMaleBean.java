package po;

import java.util.Date;

/**
 * @author weihoong
 * @since 2017/10/11
 */
public class StudentHealthMaleBean {
    private int id;
    private int studentId;
    private Date checkDate;
    private String heart;
    private String liver;
    private String spleen;
    private String lung;
    private String kidney;
    private String prostate;
    private String note;

    @Override
    public String toString() {
        return "StudentHealthMaleBean{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", checkDate=" + checkDate +
                ", heart='" + heart + '\'' +
                ", liver='" + liver + '\'' +
                ", spleen='" + spleen + '\'' +
                ", lung='" + lung + '\'' +
                ", kidney='" + kidney + '\'' +
                ", prostate='" + prostate + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public String getLiver() {
        return liver;
    }

    public void setLiver(String liver) {
        this.liver = liver;
    }

    public String getSpleen() {
        return spleen;
    }

    public void setSpleen(String spleen) {
        this.spleen = spleen;
    }

    public String getLung() {
        return lung;
    }

    public void setLung(String lung) {
        this.lung = lung;
    }

    public String getKidney() {
        return kidney;
    }

    public void setKidney(String kidney) {
        this.kidney = kidney;
    }

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
