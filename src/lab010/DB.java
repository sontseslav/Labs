/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab010;

import java.sql.*;
import java.time.LocalDate;
/**
 *
 * @author user
 */
public class DB {
    private final String DB_DRIVER = "org.mariadb.jdbc.Driver";
    private final String DB_CONNECTION = "jdbc:mariadb://localhost:3306/tutorialdb";
    private String DbUser;
    private String DbPassword;
    private Connection connection;
    private LocalDate date;
    
    
    public DB(String DbUser, String DbPassword){
        this.DbUser = DbUser;
        this.DbPassword = DbPassword;
    }
    
    private Connection getDBConnection(){
        /*try{
            Class.forName(DB_DRIVER);
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
            return null;
        }*/
        try {
            connection = DriverManager.getConnection(DB_CONNECTION,DbUser,DbPassword);
        }catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
        return connection;
    }
    
    public void ManipulateWithDB(String query) throws SQLException{
        if (connection == null) getDBConnection();
        if (connection == null){
            System.out.println("Fails to set connection");
            return;
        }
        try{
            Statement statement = connection.createStatement();
            boolean isSuccess = statement.execute(query);
            if (!isSuccess) {
                System.out.println("Fails to proceed querry "+query);
                return;}
            ResultSet rs = statement.getResultSet();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for(int i = 0;i < columnCount;i++){
				System.out.print(metaData.getColumnName(i+1)+"\t\t");
			}
			System.out.println();
            while(rs.next()){
                for (int i = 0; i < columnCount; i++){
                    System.out.print(rs.getString(i+1)+"\t");
                }
                System.out.println();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }finally {
            connection.close();
            connection = null;
        }
    }
}
