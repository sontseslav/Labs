/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab010;

import java.sql.SQLException;

/**
 *
 * @author user
 */
public class QueryProcessor {
    public static void main(String[] args){
        DB db = new DB("root", "12345");
        try{
            System.out.println("1. Staff list");
            db.ManipulateWithDB("SELECT DepNo, Name, Post FROM tutorialdb.Emp "
                + "ORDER BY DepNo");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        try{
            System.out.println("\n2. Staff list from 2 and 3 dep with salary more "
                    + "than 4600");
            db.ManipulateWithDB("SELECT DepNo, Name, Post, Salary "
                    + "FROM tutorialdb.Emp WHERE DepNo >= 2 AND Salary > 4600 "
                    + "ORDER BY DepNo");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        try{
            System.out.println("\n3. List of developers and senior developers");
            db.ManipulateWithDB("SELECT DepNo, Name, Post FROM tutorialdb.Emp "
                    + "WHERE Post = 'вед. программист' OR Post ='программист'"
                    + "ORDER BY DepNo");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        try{
            System.out.println("\n4. Staff list from 1 and 3 dep with employees "
                    + "older than 40");
                db.ManipulateWithDB("SELECT DepNo, Name, Post, Born "
                        + "FROM tutorialdb.Emp "
                        + "WHERE DepNo <> 2 "
                        + "AND Born < CURDATE() - INTERVAL 40 YEAR "
                        + "ORDER BY DepNo");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        try{
            System.out.println("\n5. Staff list fwith employees having no phones");
                db.ManipulateWithDB("SELECT DepNo, Name, Post "
                        + "FROM tutorialdb.Emp WHERE Tel = ''"
                        + "ORDER BY DepNo");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}