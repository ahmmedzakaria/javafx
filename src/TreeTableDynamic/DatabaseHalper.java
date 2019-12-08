/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeTableDynamic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author B5
 */
public class DatabaseHalper {

    public static List getEmployees() {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        List employees = new ArrayList();
        try {
            con = DBConnection.getDBConnection();
            //Create the Statement object
            stmt = con.createStatement();

            //Execute the query
            rs = stmt.executeQuery("select * from emp order by salary");

            while (rs.next()) {
                List employee = new ArrayList();
                employee.add(rs.getString("id"));
                employee.add(rs.getString("name"));
                employee.add(rs.getString("city"));
                employee.add(rs.getString("salary"));
                employees.add(employee);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //Close the connection and statement object
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        return employees;
    }
}
