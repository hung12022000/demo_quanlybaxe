package Controller;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class DAO {

    private static void A() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Connection conn;
    public DAO(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=QUANLIBAIDOXE1;"
                    + "username=sa;password=123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*    public boolean addTaikhoan(TaiKhoan v){
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
    
    public ArrayList<TaiKhoan> getListTaiKhoan(){
        ArrayList<TaiKhoan> list = new ArrayList<>();
        String sql = "SELECT * FROM DANGNHAP";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
               TaiKhoan v = new TaiKhoan();
                v.setMataihoan(rs.getString("MATAIKHOAN"));
                v.setTentaikhoan(rs.getString("TENTAIKHOAN"));
                v.setLoaitaikhoan(rs.getString("LOAITAIKHOAN"));
                v.setMatkhau(rs.getString("MATKHAU"));
                v.setNhanvien(rs.getString("MANHANVIEN"));
                list.add(v);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args)
    {
        DAO A= new DAO();
        A();
    }
        
    }
    
    */
