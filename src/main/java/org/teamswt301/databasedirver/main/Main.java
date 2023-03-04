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
            System.out.println(mainMenu());
            String line = new Scanner(System.in).nextLine();
            int number = Integer.parseInt(line);
            switch (number) {
                case 1 -> CharacterCRUD.showListInConsole();
                case 2 -> CharacterCRUD.createCharacter();

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
                " Show information all students have been injected",
                " Add student's vaccine injection information",
                " Updating information of students' for second injection",
                " Delete student vaccine injection information",
                " Search for injection information by studentID ",
                " nothing here, wait to update           ",
                "----------------------------------------------------------------"
        );
    }
}
