package com.example.contact.Dao;

import com.example.contact.entity.FileDb;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (FileDb)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-25 23:32:08
 */
public interface FileDbDao {

    /**
     * 通过ID查询单条数据
     *
     * @param num 主键
     * @return 实例对象
     */
    FileDb queryById(Integer num);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<FileDb> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param fileDb 实例对象
     * @return 对象列表
     */
    List<FileDb> queryAll(FileDb fileDb);

    /**
     * 新增数据
     *
     * @param fileDb 实例对象
     * @return 影响行数
     */
    int insert(FileDb fileDb);

    /**
     * 修改数据
     *
     * @param fileDb 实例对象
     * @return 影响行数
     */
    int update(FileDb fileDb);

    /**
     * 通过主键删除数据
     *
     * @param num 主键
     * @return 影响行数
     */
    int deleteById(Integer num);

}