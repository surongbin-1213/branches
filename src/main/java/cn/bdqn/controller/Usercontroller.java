package cn.bdqn.controller;

import cn.bdqn.pojo.Branches;
import cn.bdqn.service.BranchesMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 苏荣斌
 * @create 2020-11-27 14:43
 */
@Controller
public class Usercontroller {
    @Autowired
    BranchesMapperImpl branchesimpl;


    @RequestMapping("index.go")
    public String index(Model model){
        List<Branches> branches = branchesimpl.branches();
        model.addAttribute("branches",branches);
        return "show";
    }
    @RequestMapping("index.html")
    public String index1(@RequestParam("id")Integer id,Model model){
        List<Branches> branches_id=branchesimpl.branches_id(id);
        model.addAttribute("branches_id",branches_id);
        return "list";
    }
}
