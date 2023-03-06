/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package org.teamswt301.dirverdatabasedata.dao.test;

import java.sql.SQLException;
import java.util.ArrayList;
import org.teamswt301.databasedirver.dao.CharacterDAO;
import org.teamswt301.databasedirver.dto.CharacterDTO;
import org.teamswt301.databasedriver.core.CharacterCRUD;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author AN515-57
 */
public class DAOTesting {

    @Test(expectedExceptions = NumberFormatException.class)
    public void testPrintMessage() {
        CharacterCRUD.createCharacterWithValues("a", "10", "10");
    }

    CharacterDAO chardao = new CharacterDAO();

    @Test
    public void testGetListCharacterDAO() throws SQLException {
        ArrayList<CharacterDTO> expected = new ArrayList();
        expected.add(new CharacterDTO(1, "Chtholly", "Shuumatsu nani shitemasu ka"));
        expected.add(new CharacterDTO(2, "Marin Kitagawa", "My Dress-Up Darling"));
        expected.add(new CharacterDTO(3, "Elysia", "Honkai Impact 3rd"));
        expected.add(new CharacterDTO(4, "Lumine", "Genshin Impact"));
        expected.add(new CharacterDTO(5, "Shin Jia", "Counter: Side"));
        expected.add(new CharacterDTO(6, "Misuzu Gundou", "Tomo-chan wa Onnanoko"));

        //Expected data:
        int size = 6;
       assertEquals(chardao.getAllCharacters().size(),size);
//        assertEquals(chardao.getAllCharacters().size(), expected.size());
    }

    //Test giá trị trả về của hàm SearchCharacter với giá trị nhập Chtholly 
    //mong muốn giá trị trả về gồm 3 giá trị ID = 1, name = Chtholly; des = Shuumatsu nani shitemasu ka
    @Test
    public void testFunctionsearchCharacterGivenExistArgurment() throws SQLException {
        // expected value 
        int id = 1;
        String name = "Chtholly";
        String des = "Shuumatsu nani shitemasu ka";
        //get actual value 
        ArrayList<CharacterDTO> charlist = chardao.getCharacters("Chtholly");
        assertEquals(charlist.get(0).getCharacterID(), id);
        assertEquals(charlist.get(0).getCharacterName(), name);
        assertEquals(charlist.get(0).getDescription(), des);
    }
    
    
}
