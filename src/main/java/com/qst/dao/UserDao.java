package com.qst.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qst.utils. DBconn;
import com.qst.bean. Person;
public class UserDao {

    public boolean register(Person person) throws SQLException {
        boolean flag = false;
        DBconn.init();
        ResultSet rs = DBconn.selectSql("select * from p_person where person_pn='" + person.getPerson_pn() + "'");
        if (!rs.next()) {
            int i = DBconn.addUpdDel("insert into p_person(person_id,person_pn,person_pd) " +
                    "values('" + person.getPerson_id() + "','" + person.getPerson_pn() + "','" + person.getPerson_pd() + "')");
            if (i > 0) {
                flag = true;
            }
        }

        DBconn.closeConn();
        return flag;
    }

    public boolean login(String person_pn, String person_pd) {
        boolean flag = false;
        try {
            DBconn.init();
            ResultSet rs = DBconn.selectSql("select * from p_person where person_pn='" + person_pn + "' and person_pd='" + person_pd + "'");
            while (rs.next()) {
                if (rs.getString("person_pn").equals(person_pn) && rs.getString("person_pd").equals(person_pd)) {
                    flag = true;
                }
            }
            DBconn.closeConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public List<Person> getPersonAll() {
        List<Person> list = new ArrayList<Person>();
        try {
            DBconn.init();
            ResultSet rs = DBconn.selectSql("select * from p_person");
            while (rs.next()) {
                Person person = new Person();
                person.setPerson_id(rs.getInt("person_id"));
                person.setPerson_pn(rs.getString("person_pn"));
                person.setPerson_pd(rs.getString("person_pd"));
                list.add(person);
            }
            DBconn.closeConn();
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Person getPersonone(String person_pn, String person_pd) {
        Person person=new Person();
        try {
            DBconn.init();
            ResultSet rs = DBconn.selectSql("select * from p_person where person_pn='"+person_pn+"' and person_pd='"+person_pd+"'");
            while(rs.next()){
                person.setPerson_id(rs.getInt("person_id"));
                person.setPerson_pn(rs.getString("person_pn"));
                person.setPerson_pd(rs.getString("person_pd"));

            }
            DBconn.closeConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return person;
    }


    public boolean update(int person_id,String person_pn, String person_pd) {
        boolean flag = false;
        DBconn.init();
        String sql ="update p_person set person_pn ='"+person_pn
                +"' , person_pd ='"+person_pd +"' where person_id = "+person_id;
        int i =DBconn.addUpdDel(sql);
        if(i>0){
            flag = true;
        }
        DBconn.closeConn();
        return flag;
    }
    public boolean delete(int person_id) {
        boolean flag = false;
        DBconn.init();
        String sql = "delete  from p_person where person_id="+person_id;
        int i =DBconn.addUpdDel(sql);
        if(i>0){
            flag = true;
        }
        DBconn.closeConn();
        return flag;
    }

}