/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
#Proyecto #2 Sistema de Expediente Electronico
#-Wendy Largaespada Aragon
#-Andres Rojas Rojas
#-Andres Cordero Gutierrez
 */
package com.java.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
     private static Database theInstance;
    public static Database instance(){
        if (theInstance==null){ 
            theInstance=new Database();
        }
        return theInstance;
    }
    public static final String PROPERTIES_FILE_NAME= "/resources/db.properties";
    Connection cnx;
    public Database(){
        cnx=getConnection();            
    }
    public Connection getConnection(){
        try {
            /*
            Properties prop = new Properties();
            URL resourceUrl = getClass().getResource(PROPERTIES_FILE_NAME);
            System.out.println(resourceUrl);
            File file = new File(resourceUrl.toURI());
            prop.load(new BufferedInputStream(new FileInputStream(file)));
            String driver = prop.getProperty("database_driver");
            String server = prop.getProperty("database_server");
            String port = prop.getProperty("database_port");
            String user = prop.getProperty("database_user");
            String password = prop.getProperty("database_password");
            String database = prop.getProperty("database_name");
            
            String URL_conexion="jdbc:mysql://"+ server+":"+port+"/"+
                    database+"?user="+user+"&password="+password+"&serverTimezone=UTC&autoReconnect=true&useSSL=false";           
            Class.forName(driver);
            return DriverManager.getConnection(URL_conexion);*/
           String URL_conexion="jdbc:mysql://"+ "localhost"+":"+"3306"+"/"+"v1"+"?user="+"root"+"&password="+
                   "ale123barra"+"&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
            Class.forName("com.mysql.jdbc.Driver");
 
            return DriverManager.getConnection(URL_conexion);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            //System.exit(-1);
        } 
        return null;
    }
    
    public PreparedStatement prepareStatement(String statement) throws SQLException {
        return cnx.prepareStatement(statement);
    }
    public int executeUpdate(PreparedStatement statement) {
        try {
            statement.executeUpdate();
            return statement.getUpdateCount();
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    
    public ResultSet executeQuery(PreparedStatement statement){
        try {
            return statement.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }    
}
