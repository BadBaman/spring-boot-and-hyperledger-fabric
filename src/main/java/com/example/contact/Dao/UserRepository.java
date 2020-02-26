package com.example.contact.Dao;
import java.util.List;

import com.example.contact.entity.UserVo;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserVo, Integer> {
    List<UserVo> findByUserName(String userName);
    void deleteByUserName(String userName);
}