/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.teamswt301.databasedirver.main;

import java.sql.SQLException;
import java.util.Scanner;
import org.teamswt301.databasedirver.dao.CharacterDAO;
import org.teamswt301.databasedriver.core.CharacterCRUD;


/**
 *
 * @author AN515-57
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        
        
        do {
            System.err.println(mainMenu());
            String line = new Scanner(System.in).nextLine();
            int number = Integer.parseInt(line);
            switch (number) {
                case 1 -> CharacterCRUD.showListInConsole();
                case 2 -> CharacterCRUD.createCharacter();
                case 3 -> CharacterCRUD.deleteCharacter();
            }
            if (number == 0) {
                break;
            }

        } while (true);
    }

    public static String mainMenu() {
        return String.format("""
                            +%-64s+ 
                            | 1 -%-60s|
                            | 2 -%-60s|
                            | 3 -%-60s|
                            | 4 -%-60s|
                            | 5 -%-60s|
                            | 6 -%-60s|
                            +%-64s+
                            """,
                "---------------------------Main_Menu----------------------------",
                " Show all character",
                " Create a new character",
                " Delete a character by ID",
                " nothing here, wait to update",
                " nothing here, wait to update",
                " nothing here, wait to update",
                "----------------------------------------------------------------"
        );
    }
}
