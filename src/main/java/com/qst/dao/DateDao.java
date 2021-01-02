package com.qst.dao;

import com.qst.bean.DateSeller;
import com.qst.utils.DBconn;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DateDao {
    public List<DateSeller> getDateYear() {
        List<DateSeller> list = new ArrayList<>();
        try {
            DBconn.init();
            ResultSet rs = DBconn.selectSql("select DATE_FORMAT(phone_date,'%Y') years,count(phone_date) count from p_phone group by years");
            while(rs.next()){
                DateSeller dateSeller=new DateSeller();
                dateSeller.setYears(rs.getInt("years"));
                dateSeller.setCount(rs.getInt("count"));
                list.add(dateSeller);
            }
            //System.out.println("111"+list);
            DBconn.closeConn();
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<DateSeller> getDateMonth() {
        List<DateSeller> list = new ArrayList<>();
        try {
            DBconn.init();
            ResultSet rs = DBconn.selectSql("select DATE_FORMAT(phone_date,'%Y%m') months,count(phone_date) count from p_phone group by months");
            while(rs.next()){
                DateSeller dateSeller=new DateSeller();
                dateSeller.setMonths(rs.getInt("months"));
                dateSeller.setCount(rs.getInt("count"));
                list.add(dateSeller);
            }
            //System.out.println("111"+list);
            DBconn.closeConn();
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<DateSeller> getDateWeek() {
        List<DateSeller> list = new ArrayList<>();
        try {
            DBconn.init();
            ResultSet rs = DBconn.selectSql("select DATE_FORMAT(phone_date,'%Y%u') weeks,count(phone_date) count from p_phone group by weeks");
            while(rs.next()){
                DateSeller dateSeller=new DateSeller();
                dateSeller.setWeeks(rs.getInt("weeks"));
                dateSeller.setCount(rs.getInt("count"));
                list.add(dateSeller);
            }
            //System.out.println("111"+list);
            DBconn.closeConn();
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<DateSeller> getDateDay() {
        List<DateSeller> list = new ArrayList<>();
        try {
            DBconn.init();
            ResultSet rs = DBconn.selectSql("select DATE_FORMAT(phone_date,'%Y%m%d') days,count(phone_date) count from p_phone group by days");
            while(rs.next()){
                DateSeller dateSeller=new DateSeller();
                dateSeller.setDays(rs.getInt("days"));
                dateSeller.setCount(rs.getInt("count"));
                list.add(dateSeller);
            }
            //System.out.println("111"+list);
            DBconn.closeConn();
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
