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

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author AN515-57
 */
public class TestCRUDFunctionOnCharacterDatabase {

    //Đây là ví dụ cơ bản về DDT với Parameters và testng.xml
//    @Test
//    @Parameters({"myActualName", "myExpectedName"})
//    public void parameterTest(String myName,String expected) {
//        System.err.println("Parameterized value is : " + myName);
//        assertEquals(myName, expected);
//    }
//    //Kết thúc ví dụ cơ bản về DDT với Parameters và testng.xml
//    
    private ArrayList<CharacterDTO> arrayList = new ArrayList<>();
    @BeforeTest(groups = "Search Elysia")
    public void getListCharacterGivenSearch() throws SQLException{
        CharacterDAO cdao = new CharacterDAO();
        this.arrayList = cdao.getCharacters("Elysia");
    }
    //
    @Parameters({"Elysia_id","Elysia_name","Elysia_desc"})
    @Test(groups = "Search Elysia")
    public void testSearchFunctionOnCharacterDatabase(String id,String name, String desc) {
        assertEquals(arrayList.get(0).getCharacterID(),Integer.valueOf(id));
        assertEquals(arrayList.get(0).getCharacterName(),name);
        assertEquals(arrayList.get(0).getDescription(),desc);
        
    }

}
