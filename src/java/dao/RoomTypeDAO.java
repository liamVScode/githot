/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import entity.RoomType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chinhdd3
 */
public class RoomTypeDAO {
    Connection conn = null; //ket noi sql server
    PreparedStatement ps = null; //nem cau lenh query tu netbeans sang sql server
    ResultSet rs = null; //nhan ket qua tra ve
    
    public List<RoomType> getListRoomType(){
        try{
            String query = "select * from ROOMTYPE";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            List<RoomType> lst = new ArrayList<>();
            while(rs.next()){
                RoomType rtp = new RoomType(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9));
                lst.add(rtp);
            }
            return lst;
        }
        catch(Exception e){
        
        }
        return null;
    }
    
    public List<RoomType> getResultSearch(String numAdult, String numChild, String numRoom) throws SQLException{
        try{
            conn = new DBContext().getConnection();
            String query = "select * from ROOMTYPE where MaxAdult >= ? and MaxChild >= ? and numRoom >= ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, numAdult);
            ps.setString(2, numChild);
            ps.setString(3, numRoom);
            rs = ps.executeQuery();
            List<RoomType> lst = new ArrayList<>();
            while(rs.next()){
                RoomType rtp = new RoomType(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9));
                lst.add(rtp);
            }
            return lst;
        }
        catch(Exception e){
            
        }
        return null;
    }
    
}
