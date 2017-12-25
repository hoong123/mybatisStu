package test;

import mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import po.StudentBean;
import util.SqlSessionFactoryUtils;

/**
 * @author Hoong
 */
public class TestAssociation {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlsession();
            StudentMapper stuMapper = sqlSession.getMapper(StudentMapper.class);
            StudentBean stuBean = stuMapper.getStudent(123);
            System.out.println(stuBean);
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
