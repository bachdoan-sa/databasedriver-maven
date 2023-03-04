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
    
    private static final String CREATE_NEW_CHARACTER = "INSERT INTO Character(characterID,characterName,description) values (?,?,?)";
    public boolean createCharacters(CharacterDTO character) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        
        boolean check = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(CREATE_NEW_CHARACTER);
                ptm.setInt(1, character.getCharacterID());
                ptm.setString(2, character.getCharacterName());
                ptm.setString(3, character.getDescription());
                check = ptm.executeUpdate() > 0;
            }
        } catch (Exception e) {
            return check;
        } finally {
            
            ptm.close();
            conn.close();
        }
        return check;
    }
    
    //still working
    private static final String DELETE_CHARACTER = " ";
    public boolean deleteUser(String characterID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(DELETE_CHARACTER);
                ptm.setString(1, characterID);
                int value = ptm.executeUpdate();
                check = value > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }
    
    private static final String UPDATE_CHARACTER = "UPDATE Character SET characterName=?, description=? WHERE characterID=?";
    public boolean updateCharacter(CharacterDTO character) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATE_CHARACTER);
                ptm.setString(1, character.getCharacterName());
                ptm.setString(2, character.getDescription());
                ptm.setInt(3, character.getCharacterID());
                check = ptm.executeUpdate() > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }
}
