package mybatis.mapper;

import mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SQLMapper {
    //根據用戶名模糊查詢用戶訊息
    List<User> getUserByLike(@Param("username") String username);

    //批量刪除
    int deleteMore(@Param("ids") String ids);

    //查詢指定表中的數據
    List<User> getUserByTableName(@Param("tableName") String tableName);

    //添加用戶訊息
    void insertUser(User user);
}
