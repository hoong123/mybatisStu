package test;


import mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import po.LectureBean;
import po.StudentBean;
import po.StudentLectureBean;
import util.SqlSessionFactoryUtils;

/**
 * @author Hoong
 */
public class TestCollection {
    static Logger logger = Logger.getLogger(TestCollection.class);

    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlsession();
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            StudentBean student = studentMapper.getStudent(123);
            logger.info(student.getStudentSelfcard().getNative_());
            StudentLectureBean studentLecture = student.getStudentLectureBeanList().get(1);
            LectureBean lecture = studentLecture.getLecture();
            logger.info(student.getCname() + "\t" + lecture.getLectureName() + "\t" + studentLecture.getGrade());
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
