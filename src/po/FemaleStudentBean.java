package po;

import java.util.List;

/**
 * @author weihoong
 * @since 2017/10/11
 */
public class FemaleStudentBean extends StudentBean {
    private List<StudentHealthFemaleBean> studentHealthFemaleBeanList = null;

    public List<StudentHealthFemaleBean> getStudentHealthFemaleBeanList() {
        return studentHealthFemaleBeanList;
    }

    public void setStudentHealthFemaleBeanList(List<StudentHealthFemaleBean> studentHealthFemaleBeanList) {
        this.studentHealthFemaleBeanList = studentHealthFemaleBeanList;
    }
}
