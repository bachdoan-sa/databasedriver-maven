/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package org.teamswt301.dirverdatabasedata.dao.test;

import java.sql.SQLException;
import java.util.ArrayList;
import org.teamswt301.databasedirver.dao.CharacterDAO;
import org.teamswt301.databasedirver.dto.CharacterDTO;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author AN515-57
 */
public class CharacterCRUDTest {

    CharacterDAO chardao = new CharacterDAO();
    private ArrayList<CharacterDTO> arrayList = new ArrayList<>();

    @BeforeTest
    public void getListCharacterGivenSearch() throws SQLException {
        this.arrayList = chardao.getAllCharacters();
    }
    
    @DataProvider(name = "Character_List")
    public Object[][] dpMethod() {
        return new Object[][]{{1,"Chtholly", "Shuumatsu nani shitemasu ka"},
                              {2, "Marin Kitagawa", "My Dress-Up Darling"},
                              {3, "Elysia", "Honkai Impact 3rd"},
                              {4, "Lumine", "Genshin Impact"},
                              {5, "Shin Jia", "Counter: Side"},
                              {6, "Misuzu Gundou", "Tomo-chan wa Onnanoko"}
                            };
    }

    @Test(dataProvider  = "Character_List")
    public void testFunctionGetListCharacterDAOWithDataFromDAO(int id, String name, String desc) {
        int n = id-1;
        assertEquals(arrayList.get(n).getCharacterID(), id);
        assertEquals(arrayList.get(n).getCharacterName(), name);
        assertEquals(arrayList.get(n).getDescription(), desc);
    }

}
