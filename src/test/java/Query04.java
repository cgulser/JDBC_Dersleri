import java.sql.*;

public class Query04 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC", "root", "1453");

        //Statement st = con.createStatement();

        PreparedStatement ps = con.prepareStatement("select * from ogrenciler");

        ResultSet rs = ps.executeQuery();

        ResultSetMetaData rsMeta = rs.getMetaData();

        System.out.println("1. Sutunun ismi :"+rsMeta.getColumnName(1));
        System.out.println("2. Sutunun ismi :"+rsMeta.getColumnName(2));
        System.out.println("3. Sutunun ismi :"+rsMeta.getColumnName(3));
        System.out.println("4. Sutunun ismi :"+rsMeta.getColumnName(4));

        System.out.println("Toplam sutun sayisi :"+ rsMeta.getColumnCount());

        System.out.println("============================================");

        System.out.println("1 sutunun Tipi :"+ rsMeta.getColumnTypeName(1));
        System.out.println("2 sutunun Tipi :"+ rsMeta.getColumnTypeName(2));
        System.out.println("3 sutunun Tipi :"+ rsMeta.getColumnTypeName(3));
        System.out.println("3 sutunun Tipi :"+ rsMeta.getColumnTypeName(4));


        System.out.println("Tablonun ismi :"+ rsMeta.getTableName(1));




    }
}
