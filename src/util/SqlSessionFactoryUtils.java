package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Hoong
 */
public class SqlSessionFactoryUtils {
    private static SqlSessionFactory sqlSessionFactory = null;
    private static final Class CLASS_LOCK = SqlSessionFactoryUtils.class;
    private SqlSessionFactoryUtils(){
    }
    public static SqlSessionFactory initSqlSessionFactory(){
        String resource = "myBatis.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        }catch (IOException e){
            Logger.getLogger(SqlSessionFactoryUtils.class.getName()).log(Level.SEVERE,null,e);
        }
        synchronized (CLASS_LOCK){
            if (sqlSessionFactory==null)
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
        return sqlSessionFactory;
    }

    public static SqlSession openSqlsession(){
        if (sqlSessionFactory ==null)
            initSqlSessionFactory();
        return sqlSessionFactory.openSession();
    }

}
