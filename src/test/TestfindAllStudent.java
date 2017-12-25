package test;

import mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import po.StudentBean;
import util.SqlSessionFactoryUtils;

/**
 * @author weihoong
 * @since 2017/10/31
 */
public class TestfindAllStudent {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try{
            sqlSession = SqlSessionFactoryUtils.openSqlsession();
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            StudentBean studentBean = studentMapper.findAllStudent();
            System.out.println(studentBean);
        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
    }
}
