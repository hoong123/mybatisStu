package test;


import mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import po.StudentBean;
import util.SqlSessionFactoryUtils;

/**
 * @author weihoong
 * @since 2017/11/3
 */
public class TestFirstCache {
    static Logger LOG = Logger.getLogger(TestFirstCache.class);

    public static void main(String[] args) {
        SqlSession sqlSession = null,sqlSession2 = null;

        try {
            sqlSession = SqlSessionFactoryUtils.openSqlsession();
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            StudentBean studentBean = studentMapper.getStudent(123);
            LOG.debug("使用同一个sqlSession在执行一次");
            StudentBean studentBean1 = studentMapper.getStudent(123);
            //请注意，当我们使用二级缓存的时候，sqlSession调用commit方法后才会生效
            sqlSession.commit();
            LOG.debug("现在创建一个新的sqlSession在执行一次");
            sqlSession2 = SqlSessionFactoryUtils.openSqlsession();
            StudentMapper studentMapper1 = sqlSession2.getMapper(StudentMapper.class);
            StudentBean studentBean2 = studentMapper1.getStudent(123);
            sqlSession2.commit();
        }finally {
            if (sqlSession!=null)
                sqlSession.close();
        }
    }
}
