package com.qst.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qst.bean.Person;
import com.qst.utils. DBconn;
import com.qst.bean. Seller;

public class SellerDao {
    public boolean login(String seller_pn, String seller_pd) {
        boolean flag = false;
        try {
            DBconn.init();
            ResultSet rs = DBconn.selectSql("select * from p_seller where seller_pn='"+seller_pn+"' and seller_pd='"+seller_pd+"'");
            while(rs.next()){
                if(rs.getString("seller_pn").equals(seller_pn) && rs.getString("seller_pd").equals(seller_pd)){
                    flag = true;
                }
            }
            DBconn.closeConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }
    public Seller getSellerone(String seller_pn, String seller_pd) {
        Seller seller=new Seller();
        try {
            DBconn.init();
            ResultSet rs = DBconn.selectSql("select * from p_seller where seller_pn='"+seller_pn+"' and seller_pd='"+seller_pd+"'");
            while(rs.next()){
                seller.setSeller_id(rs.getInt("seller_id"));
                seller.setSeller_pn(rs.getString("seller_pn"));
                seller.setSeller_pd(rs.getString("seller_pd"));

            }
            DBconn.closeConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return seller;
    }
    public boolean update(int seller_id,String seller_pn, String seller_pd) {
        boolean flag = false;
        DBconn.init();
        String sql ="update p_seller set seller_pn ='"+seller_pn
                +"' , seller_pd ='"+seller_pd +"' where seller_id = "+seller_id;
        int i =DBconn.addUpdDel(sql);
        if(i>0){
            flag = true;
        }
        DBconn.closeConn();
        return flag;
    }
    public boolean delete(int seller_id) {
        boolean flag = false;
        DBconn.init();
        String sql = "delete  from p_seller where seller_id="+seller_id;
        int i =DBconn.addUpdDel(sql);
        if(i>0){
            flag = true;
        }
        DBconn.closeConn();
        return flag;
    }

}