package mybatis.mapper;

import mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    //分步查詢01
    //分步查詢第二步: 通過did查詢員工所對應的部門
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);

    //獲取部門以及部門中所有的員工訊息
    Dept getDeptAndEmp(@Param("did") Integer did);

    //分布查詢02 通過分布查詢查詢部門以及部門中所有的員工訊息
    //分步查詢第一步: 查詢部門訊息
    Dept getDeptAndEmpByStepOne(@Param("did") Integer did);
}
