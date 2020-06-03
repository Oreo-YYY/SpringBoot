package com.example.demo.controller;

import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Admin)表控制层
 *
 * @author makejava
 * @since 2020-05-28 09:16:05
 */
@Controller
@RequestMapping("admin")
public class AdminController {
    /**
     * 服务对象
     */
    @Resource
    private AdminService adminService;

    @RequestMapping("toLogin")
        public String toLogin() {
            return "login";
    }

    @GetMapping("selectOne")
    @ResponseBody
    public Admin selectOne(Integer id) {
        return this.adminService.queryById(id);
    }

    @PostMapping("insert")
    @ResponseBody
    public Admin insert(Admin admin){
        return adminService.insert(admin);
    }

    @PostMapping("login")
    public String login(String account, String password, Model model) {
        Admin admin =  adminService.login(account, password);
        if(admin == null) {
            //登陆不成功
            model.addAttribute("msg","账号密码错误");
            return "login";
        }

        return "index";
    }

    @RequestMapping("toWelcome")
    public String toWelcome() {
        return "welcome";
    }

}