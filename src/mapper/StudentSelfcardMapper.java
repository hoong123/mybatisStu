package mapper;

import po.StudentSelfcardBean;

/**
 * @author weihoong
 * @since 2017/9/26
 */
public interface StudentSelfcardMapper {
    public StudentSelfcardBean findStudentSelfcardByStudentId(int studentId);
}
