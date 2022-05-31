package mybatis.mapper;

import mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    //添加用戶訊息
    int insertUser();

    //修改用戶訊息
    void updateUser();

    //刪除用戶訊息
    void deleteUser();

    //根據id查詢用戶訊息
    User getUserById();

    //查詢所有的用戶訊息
    List<User> getAllUser();
}