package com.example.contact.service;

import com.example.contact.entity.FileDb;
import java.util.List;

/**
 * (FileDb)表服务接口
 *
 * @author makejava
 * @since 2020-02-25 23:32:09
 */
public interface FileDbService {

    /**
     * 通过ID查询单条数据
     *
     * @param num 主键
     * @return 实例对象
     */
    FileDb queryById(Integer num);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<FileDb> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param fileDb 实例对象
     * @return 实例对象
     */
    FileDb insert(FileDb fileDb);

    /**
     * 修改数据
     *
     * @param fileDb 实例对象
     * @return 实例对象
     */
    FileDb update(FileDb fileDb);

    /**
     * 通过主键删除数据
     *
     * @param num 主键
     * @return 是否成功
     */
    boolean deleteById(Integer num);

}