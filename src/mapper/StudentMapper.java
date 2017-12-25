package mapper;

import po.StudentBean;

public interface StudentMapper {
    public StudentBean getStudent(int id);
    public StudentBean findAllStudent();
}
