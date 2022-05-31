package mybatis.test;

import com.github.pagehelper.PageHelper;
import mybatis.mapper.EmpMapper;
import mybatis.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PageHelperTest {
    @Test
    public void testPageHelper() {
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            PageHelper.startPage(1, 4);
            List<Emp> list = mapper.selectByExample(null);
            list.forEach(emp -> System.out.println(emp));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
