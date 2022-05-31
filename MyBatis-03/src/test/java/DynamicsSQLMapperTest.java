import mybatis.mapper.DynamicsSQLMapper;
import mybatis.pojo.Emp;
import mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DynamicsSQLMapperTest {
    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicsSQLMapper mapper = sqlSession.getMapper(DynamicsSQLMapper.class);
        List<Emp> list = mapper.getEmpByCondition(new Emp(null, "", null, "男", null));
        System.out.println(list);
    }

    @Test
    public void testGetEmpByChoose() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicsSQLMapper mapper = sqlSession.getMapper(DynamicsSQLMapper.class);
        List<Emp> list = mapper.getEmpByChoose(new Emp(null, "", null, "男", null));
        System.out.println(list);
    }

    @Test
    public void testDeleteMoreByArray() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicsSQLMapper mapper = sqlSession.getMapper(DynamicsSQLMapper.class);
        int result = mapper.deleteMoreByArray(new Integer[]{6, 7, 8});
        System.out.println(result);
    }

    @Test
    public void testInsertMoreByList() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicsSQLMapper mapper = sqlSession.getMapper(DynamicsSQLMapper.class);
        Emp emp1 = new Emp(null, "a1", 23, "男", "123@ddd.com");
        Emp emp2 = new Emp(null, "a2", 23, "男", "123@ddd.com");
        Emp emp3 = new Emp(null, "a3", 23, "男", "123@ddd.com");
        List<Emp> list = Arrays.asList(emp1, emp2, emp3);
        int result = mapper.insertMoreByList(list);
        System.out.println(result);
    }
}
