/*
package com.example.contact.Dao;

import com.example.contact.contacts.contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class ContactRepository {
    //持久化数据
    private JdbcTemplate jdbc;
    @Autowired
    public ContactRepository(JdbcTemplate jdbc){
        //注入JdbcTemplate
        this.jdbc=jdbc;
    }

    public List<contact> findAll() {
        //查询联系人
        return jdbc.query("select id,firstName,lastName,phoneNumber,emailAddress"+
                        "from contacts order by lastName",new RowMapper<contact>(){
                    public contact mapRow(ResultSet rs, int rowNum) throws SQLException{
                        contact contact =new contact();
                        contact.setId(rs.getLong(1));
                        contact.setFirstname(rs.getString(2));
                        contact.setLastname(rs.getString(3));
                        contact.setPhoneNumber(rs.getString(4));
                        contact.setEmailAddress(rs.getString(5));
                        return contact;
                    }
                }
                );
    }

    public void save(contact contact) {
        //插入联系人
        jdbc.update("insert into contacts" + "(firstName,lastName,phoneNumber,emailAddress)"+
                "values(?,?,?,?)",contact.getFirstname(),contact.getLastname(),contact.getPhoneNumber(),contact.getEmailAddress()
        );
    }
}
*/
