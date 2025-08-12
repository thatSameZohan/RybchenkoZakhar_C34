package com.service;

import com.domain.Route;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoutePersistenceService {

    private Connection getConnection(){
        try {
            return DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "5784");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void save(Route route) {

        try (var connection = getConnection()){

            var st=connection.prepareStatement("insert into routes (name, body, length, likes) values (?,?,?,?)");

            st.setString(1, route.getName());
            st.setString(2,route.getBody());
            st.setInt(3, route.getLength());
            st.setInt(4,0);
            st.execute();

        } catch (Exception exc){
            throw new RuntimeException(exc);
        }
    }

    public List<Route> getAll() {

        try(var con=getConnection()) {

            var st=con.createStatement();

            ResultSet resultSet=st.executeQuery("select * from routes");

            List<Route> routes=new ArrayList<>();

            while (resultSet.next()){

                Route route=new Route();
                route.setId(resultSet.getInt("id"));
                route.setName(resultSet.getString("name"));
                route.setBody(resultSet.getString("body"));
                route.setLength(resultSet.getInt("length"));
                route.setLikes(resultSet.getInt("likes"));

                routes.add(route);
            }
            st.close();
            con.close();
            return routes;

        } catch (Exception exc){
            return new ArrayList<>();
        }
    }

    public void like(Integer id) {

        try (var connection = getConnection()){
            int likes = 0;
            var st=connection.prepareStatement("select * from routes where id=?");
            st.setInt(1, id);
            ResultSet resultSet=st.executeQuery();
            while (resultSet.next()) {
                likes= resultSet.getInt("likes")+1;
            }
            st.close();
            var st2=connection.prepareStatement("update routes set likes=? where id=?");
            st2.setInt(1,likes);
            st2.setInt(2,id);
            st2.execute();
            st2.close();

        } catch (Exception exc){
            throw new RuntimeException(exc);
        }

    }
}
