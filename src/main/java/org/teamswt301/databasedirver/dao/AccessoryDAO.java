/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.teamswt301.databasedirver.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.teamswt301.databasedirver.dbutils.DBUtils;
import org.teamswt301.databasedirver.dto.AccessoryDTO;

/**
 *
 * @author AN515-57
 */
public class AccessoryDAO {
    
    private static final String GET_ACCESSORY_LIST = "select * from Accessory ";
    private static final String GET_ACCESSORY_BY_CHARACTER_NAME = "SELECT [accesssoryID], [accesssoryName], ch.characterName, ac.[description],  [type], [accesssoryNote] "
                                                                + "from Accessory ac join Character "
                                                                + "ch ON ac.characterID = ch.characterID "
                                                                + "Where characterName like ?";
    public ArrayList<AccessoryDTO> getAll() throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        ArrayList<AccessoryDTO> list = new ArrayList();
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GET_ACCESSORY_LIST);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    String charName = rs.getString(3);
                    String tpye = rs.getString(4);
                    String desc = rs.getString(5);
                    String note = rs.getString(6);
                    AccessoryDTO character = new AccessoryDTO(id, name, charName, tpye, desc, note);
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

    public ArrayList<AccessoryDTO> getAccessories(String sreach) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        ArrayList<AccessoryDTO> list = new ArrayList();
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GET_ACCESSORY_BY_CHARACTER_NAME);
                ptm.setString(1, "%" + sreach + "%");
                rs = ptm.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    String charName = rs.getString(3);
                    String tpye = rs.getString(4);
                    String desc = rs.getString(5);
                    String note = rs.getString(6);
                    AccessoryDTO character = new AccessoryDTO(id, name, charName, tpye, desc, note);
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
