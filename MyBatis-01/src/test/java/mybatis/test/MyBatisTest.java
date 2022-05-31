package mybatis.test;

import mybatis.mapper.UserMapper;
import mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    public void testMyBatis() throws IOException {
        //加載核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //獲取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //獲取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //獲取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //獲取mapper接口對象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.insertUser();
        //提交事務
        sqlSession.commit();
        System.out.println(result);
    }

    @Test
    public void testCRUD() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //mapper.updateUser();
        //mapper.deleteUser();
        //User user = mapper.getUserById();
        //System.out.println(user);
        List<User> list = mapper.getAllUser();
        list.forEach(user -> System.out.println(user));
    }
}
