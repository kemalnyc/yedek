package utils;

import utils.ConfigurationReader;
import utils.DBType;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtility {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultset;

    public static void establishConnection(DBType dbType) {
        try {
            switch (dbType) {
                case MYSQL:
                    break;
                case POSTGRESQL:
                    connection = DriverManager.getConnection(ConfigurationReader.getProperty("demoHR"),
                            ConfigurationReader.getProperty("dbUserName"),
                            ConfigurationReader.getProperty("dbPassword"));
                    if (connection != null) {
                        System.out.println("Postgresql DB connection Successfull");
                    } else {
                        System.out.println("Failed to connect to postgresql Database!");
                    }
                    break;
                case MONGODB:
                    break;
                case ORACLE:
                    break;
                case MARIADB:
                    break;
                default:
                    connection = null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnections() {
        try {
            if (resultset != null) {
                resultset.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
            System.out.println("DB closed succesfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static List<Map<String, Object>> getQueryResults(String query){
        try{
            statement = connection.createStatement((ResultSet.TYPE_SCROLL_INSENSITIVE), (ResultSet.CONCUR_READ_ONLY));
            resultset = statement.executeQuery(query);
            List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
            ResultSetMetaData resultSetMetaData = resultset.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();

            while(resultset.next()){
                Map<String, Object> rowMap = new HashMap<String, Object>();
                for(int col=1; col<=columnCount; col++){
                    rowMap.put(resultSetMetaData.getColumnName(col),resultset.getObject(col));

                }
                list.add(rowMap);
            }
            return list;

        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

}

