/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.teamswt301.dirverdatabasedata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.teamswt301.dirverdatabasedata.dbutils.DBUtils;
import org.teamswt301.dirverdatabasedata.dto.CharacterDTO;

/**
 *
 * @author AN515-57
 */
public class CharacterDAO {

    public static String GET_CHARACTER_LIST = "select * from Character ";
    public static String GET_CHARACTER_BY_NAME = "select * from Character where characterName like '%?%' ";

    public ArrayList<CharacterDTO> getAllCharacter() throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        ArrayList<CharacterDTO> list = new ArrayList();
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GET_CHARACTER_LIST);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("characterID");
                    String name = rs.getString("characterName");
                    String desc = rs.getString("description");
                    CharacterDTO character = new CharacterDTO(id, name, desc);
                    list.add(character);
                }
            }
        } catch (Exception e) {

        } finally {
            rs.close();
            ptm.close();
            conn.close();
        }
        return list;

    }
}
