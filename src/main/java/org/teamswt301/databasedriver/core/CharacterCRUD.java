/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.teamswt301.databasedriver.core;

import java.sql.SQLException;
import java.util.Scanner;
import org.teamswt301.databasedirver.dao.CharacterDAO;
import org.teamswt301.databasedirver.dto.CharacterDTO;

/**
 *
 * @author AN515-57
 */
public class CharacterCRUD {

    static Scanner sc = new Scanner(System.in);
    static CharacterDAO chardao = new CharacterDAO();

    public static void showListInConsole() throws SQLException {
        for (Object obj : chardao.getAllCharacters()) {
            System.out.println(obj.toString());
        }
    }

    public static void searchCharacterByName(String byName) throws SQLException {
        for (Object obj : chardao.getCharacters(byName)) {
            System.out.println(obj.toString());
        }
    }

    public static boolean createCharacter() throws SQLException, IllegalArgumentException {
        System.out.printf("%-10s","Enter ID:");
        int ID = Integer.parseInt(sc.nextLine());
        System.out.printf("%-10s","Character Name:");
        String name = sc.nextLine();
        System.out.printf("%-10s","Anime name:");
        String decription = sc.nextLine();
        chardao.createCharacters(new CharacterDTO(ID, name, decription));
        return true;
    }
}
