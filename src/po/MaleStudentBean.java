package po;

import java.util.List;

/**
 * @author weihoong
 * @since 2017/10/11
 */
public class MaleStudentBean extends StudentBean {
    private List<StudentHealthMaleBean> studentHealthMaleBeanList = null;

    public List<StudentHealthMaleBean> getStudentHealthMaleBeanList() {
        return studentHealthMaleBeanList;
    }

    public void setStudentHealthMaleBeanList(List<StudentHealthMaleBean> studentHealthMaleBeanList) {
        this.studentHealthMaleBeanList = studentHealthMaleBeanList;
    }
}
