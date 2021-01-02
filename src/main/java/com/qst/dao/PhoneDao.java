package com.qst.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.qst.utils. DBconn;
import com.qst.bean. Phone;

public class PhoneDao {

    public boolean register(Phone phone) {
        boolean flag = false;
        DBconn.init();
        int i =DBconn.addUpdDel("insert into p_phone(phone_id,phone_name,phone_brand,phone_species,phone_price) " +
                "values('" + phone.getPhone_id() + "','" + phone.getPhone_name() + "','" + phone.getPhone_brand() + "','" + phone.getPhone_species() + "','" + phone.getPhone_price() + "')");
        if(i>0){
            flag = true;
        }
        DBconn.closeConn();
        return flag;
    }

    public List<Phone> getPhoneAll() {
        List<Phone> list = new ArrayList<>();
        try {
            DBconn.init();
            ResultSet rs = DBconn.selectSql("select * from p_phone");
            while(rs.next()){
                Phone phone = new Phone();
                phone.setPhone_id(rs.getInt("phone_id"));
                phone.setPhone_name(rs.getString("phone_name"));
                phone.setPhone_brand(rs.getString("phone_brand"));
                phone.setPhone_species(rs.getString("phone_species"));
                phone.setPhone_price(rs.getInt("phone_price"));
                phone.setPhone_date(rs.getDate("phone_date"));

                list.add(phone);
            }
            DBconn.closeConn();
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Phone> getSpecies() {
        List<Phone> listspecies = new ArrayList<>();
        try {
            DBconn.init();
            ResultSet rs = DBconn.selectSql("select distinct phone_species from p_phone");
            while(rs.next()){
                Phone species = new Phone();
                species.setPhone_species(rs.getString("phone_species"));
                listspecies.add(species);
            }
            DBconn.closeConn();
            return listspecies;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Phone> getPhoneSpecies(String phone_species) {
        List<Phone> specieslist = new ArrayList<>();
        try {
            DBconn.init();
            ResultSet rs = DBconn.selectSql("select * from p_phone where phone_species='"+phone_species+"'");
            while(rs.next()){
                Phone speciesphone = new Phone();
                speciesphone.setPhone_id(rs.getInt("phone_id"));
                speciesphone.setPhone_name(rs.getString("phone_name"));
                speciesphone.setPhone_brand(rs.getString("phone_brand"));
                speciesphone.setPhone_species(rs.getString("phone_species"));
                speciesphone.setPhone_price(rs.getInt("phone_price"));
                speciesphone.setPhone_date(rs.getDate("phone_date"));

                specieslist.add(speciesphone);
            }
            DBconn.closeConn();
            return specieslist;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean update(int phone_id, String phone_name, String phone_brand, String phone_species, int phone_price, Date phone_date) {
        boolean flag = false;
        DBconn.init();

        String sql ="update p_phone set phone_name ='"+phone_name
                +"' , phone_brand ='"+phone_brand +"' , phone_species ='"+phone_species
                +"' , phone_price ='"+phone_price +"' , phone_date ='"+phone_date +"' where phone_id = "+phone_id;
        int i =DBconn.addUpdDel(sql);
        if(i>0){
            flag = true;
        }
        DBconn.closeConn();
        return flag;
    }
    public boolean delete(int phone_id) {
        boolean flag = false;
        DBconn.init();
        String sql = "delete  from p_phone where phone_id="+phone_id;
        int i =DBconn.addUpdDel(sql);
        if(i>0){
            flag = true;
        }
        DBconn.closeConn();
        return flag;
    }

}