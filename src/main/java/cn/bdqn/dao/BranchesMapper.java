package cn.bdqn.dao;

import cn.bdqn.pojo.Branches;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 苏荣斌
 * @create 2020-11-27 14:50
 */
public interface BranchesMapper {

    //查询全部
    List<Branches> branches();

    //根据条件查询
    List<Branches> branches_id(@Param("id")Integer id);

}
