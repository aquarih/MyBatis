package mybatis.mapper;

import mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    //驗證登入(使用@Param)
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

    //添加用戶訊息
    int insertUser(User user);

    //驗證登入(參數為map)
    User checkLoginByMap(Map<String, Object> map);

    //驗證登入
    User checkLogin(String username, String password);

    //根據用戶名查詢用戶訊息
    User getUserByUsername(String username);

    //查詢所有的員工訊息
    List<User> getAllUser();
}
