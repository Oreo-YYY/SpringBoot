package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Account)表控制层
 *
 * @author makejava
 * @since 2020-05-26 22:53:29
 */
@RestController
@RequestMapping("account")
public class AccountController {
    /**
     * 服务对象
     */
    @Resource
    private AccountService accountService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Account selectOne(Integer id) {
        return this.accountService.queryById(id);
    }

}