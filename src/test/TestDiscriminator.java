package test;

import mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import po.StudentBean;
import util.SqlSessionFactoryUtils;

/**
 * @author weihoong
 * @since 2017/10/11
 */
public class TestDiscriminator {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlsession();
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            StudentBean student = studentMapper.getStudent(123);
            System.out.println(student);
            System.out.println(student.getSex());
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }
}
