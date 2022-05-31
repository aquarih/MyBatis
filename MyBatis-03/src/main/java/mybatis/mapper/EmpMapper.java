package mybatis.mapper;

import mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    //查詢所有員工的訊息
    List<Emp> getAllEmp();

    //查詢員工以及員工所對應的部門訊息
    Emp getEmpAndDept(@Param("eid") int eid);

    //分步查詢01 通過分步查詢查詢員工以及員工所對應的部門訊息
    //分步查詢第一步: 查詢員工訊息
    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);

    List<Emp> getDeptAndEmpByStepTwo(@Param("did") Integer did);
}
