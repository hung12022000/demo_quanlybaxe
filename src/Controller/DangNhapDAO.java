/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import BLL.DangNhapBLL;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author MY LAPTOP
 
public class DangNhapDAO {
            private Connection conn;
        {
             if(conn==null){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=QUANLIBAIDOXE1;"
                    + "username=sa;password=123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        }
    private ArrayList<TaiKhoan> dsTaiKhoan;
    private static DangNhapDAO instance;
    private DangNhapDAO(){
    dsTaiKhoan=new ArrayList<TaiKhoan>();
        String sql = "SELECT * FROM DANGNHAP";
        
        try {
     
            new DangNhapDAO();
  
           PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                
               TaiKhoan v = new TaiKhoan();
               
                v.setMataihoan(rs.getObject(1).toString());
                v.setTentaikhoan(rs.getObject(2).toString());
                v.setLoaitaikhoan(rs.getObject(3).toString());
                v.setMatkhau(rs.getObject(4).toString());
                v.setNhanvien(rs.getObject(5).toString());
                dsTaiKhoan.add(v);
                System.out.println(v.getMataihoan());
                System.out.println(v.getMatkhau());
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static DangNhapDAO getInstance (){
    if (instance == null) {
			instance = new DangNhapDAO();
		}
		return instance;
    }
    

        public ArrayList<TaiKhoan> getResource (){
        return dsTaiKhoan;
        }
    public boolean addTaikhoan(TaiKhoan v){
        String sql = "INSERT INTO DANGNHAP(MATAIKHOAN,TENTAIKHOAN,LOAITAIKHOAN,MATKHAU,MANHANVIEN)"
                + " VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,v.getMataihoan());
            ps.setString(2,v.getTentaikhoan());
            ps.setString(3,v.getLoaitaikhoan());
            ps.setString(4,v.getMatkhau());
            ps.setString(5,v.getNhanvien());
            
            return ps.executeUpdate()>0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public  ArrayList<TaiKhoan> getListTaiKhoan(){
       dsTaiKhoan=new ArrayList<TaiKhoan>();
        String sql = "SELECT * FROM DANGNHAP WHERE TENTAIKHOAN=? AND MATKHAU=?";
        try {
               new DangNhapDAO();
              Statement st;
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
               TaiKhoan v = new TaiKhoan();
                v.setMataihoan(rs.getString("MATAIKHOAN"));
                v.setTentaikhoan(rs.getString("TENTAIKHOAN"));
                v.setLoaitaikhoan(rs.getString("LOAITAIKHOAN"));
                v.setMatkhau(rs.getString("MATKHAU"));
                v.setNhanvien(rs.getString("MANHANVIEN"));
                dsTaiKhoan.add(v);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsTaiKhoan;
    }
}
*/