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

    public static void createCharacter() {

        System.out.printf("%-10s", "Enter ID:");
        String ID = sc.nextLine();
        System.out.printf("%-10s", "Character Name:");
        String name = sc.nextLine();
        System.out.printf("%-10s", "Anime name:");
        String decription = sc.nextLine();

        createCharacterWithValues(ID, name, decription);

    }

    public static boolean createCharacterWithValues(String string_ID, String name, String desc) {
        int id;
        boolean check = false;
        try {
            id = Integer.parseInt(string_ID);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid id, id must be a number");
        }

        try {
            check = chardao.createCharacters(new CharacterDTO(id, name, desc));
        } catch (SQLException e) {

        }
        return check;
    }

    public static boolean deleteCharacterWithID(String ID) {
        boolean check = false;
        try {
            check = chardao.deleteUser(ID);
        } catch (SQLException e) {

        }
        return check;
    }

    public static void deleteCharacter() {
        System.out.printf("%-10s", "Enter ID:");
        String ID = sc.nextLine();
        if(deleteCharacterWithID(ID))
            System.err.println("Delete Success");
        else
            System.err.println("Delete Fail");
    }
}
