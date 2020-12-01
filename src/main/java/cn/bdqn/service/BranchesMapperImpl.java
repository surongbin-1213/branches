package cn.bdqn.service;

import cn.bdqn.dao.BranchesMapper;
import cn.bdqn.pojo.Branches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 苏荣斌
 * @create 2020-11-27 14:51
 */
@Service
public class BranchesMapperImpl {

    @Autowired
    BranchesMapper branchesMapper;


    public List<Branches> branches(){
        return branchesMapper.branches();
    }

    public List<Branches> branches_id(Integer id){
        return branchesMapper.branches_id(id);
    }
}
