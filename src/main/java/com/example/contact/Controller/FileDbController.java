package com.example.contact.controller;

import com.example.contact.entity.FileDb;
import com.example.contact.service.FileDbService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (FileDb)表控制层
 *
 * @author makejava
 * @since 2020-02-25 23:32:10
 */
@RestController
@RequestMapping("fileDb")
public class FileDbController {
    /**
     * 服务对象
     */
    @Resource
    private FileDbService fileDbService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FileDb selectOne(Integer id) {
        return this.fileDbService.queryById(id);
    }

}