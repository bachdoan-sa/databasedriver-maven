/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.teamswt301.dirverdatabasedata.main;

import java.sql.SQLException;
import org.teamswt301.dirverdatabasedata.dao.CharacterDAO;

/**
 *
 * @author AN515-57
 */
public class Main {
    public static void main(String[] args) throws SQLException{
        CharacterDAO cdao = new CharacterDAO();
        System.err.println(cdao.getAllCharacter());
    }
}
