package com.example.contact.service.impl;

import com.example.contact.entity.FileDb;
import com.example.contact.Dao.FileDbDao;
import com.example.contact.service.FileDbService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (FileDb)表服务实现类
 *
 * @author makejava
 * @since 2020-02-25 23:32:10
 */
@Service("fileDbService")
public class FileDbServiceImpl implements FileDbService {
    @Resource
    private FileDbDao fileDbDao;

    /**
     * 通过ID查询单条数据
     *
     * @param num 主键
     * @return 实例对象
     */
    @Override
    public FileDb queryById(Integer num) {
        return this.fileDbDao.queryById(num);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<FileDb> queryAllByLimit(int offset, int limit) {
        return this.fileDbDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param fileDb 实例对象
     * @return 实例对象
     */
    @Override
    public FileDb insert(FileDb fileDb) {
        this.fileDbDao.insert(fileDb);
        return fileDb;
    }

    /**
     * 修改数据
     *
     * @param fileDb 实例对象
     * @return 实例对象
     */
    @Override
    public FileDb update(FileDb fileDb) {
        this.fileDbDao.update(fileDb);
        return this.queryById(fileDb.getNum());
    }

    /**
     * 通过主键删除数据
     *
     * @param num 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer num) {
        return this.fileDbDao.deleteById(num) > 0;
    }
}