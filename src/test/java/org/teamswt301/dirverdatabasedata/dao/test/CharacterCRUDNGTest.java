/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package org.teamswt301.dirverdatabasedata.dao.test;

import org.teamswt301.databasedriver.core.CharacterCRUD;
import static org.testng.Assert.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author ACER
 */
public class CharacterCRUDNGTest {
    
    

    @Test(expectedExceptions = NumberFormatException.class)// ArithmeticException.class)
    public void testCreateCharacterWithValues1() {
        System.out.println("createCharacterWithValues1");
        String ID = "ty";
        String name = "thoai";
        String desc = "handsome";
        boolean expResult = false;
        boolean result = CharacterCRUD.createCharacterWithValues(ID, name, desc);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test(expectedExceptions = NumberFormatException.class)
    public void testCreateCharacterWithValues2() {
        System.out.println("createCharacterWithValues2");
        String ID = "ty";
        String name = "thoai";
        String desc = "handsome";
        boolean expResult = false;
        boolean result = CharacterCRUD.createCharacterWithValues(ID, name, desc);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    //Lưu ý: Cái test này tạo hẳn luôn trong database nên việc test lần nữa sẽ bị trục trặc
    //vì đã tạo sẵn 1 đối tượng với thông tin có sẵn này rồi nên sau này sẽ ko trả về đc nữa
    @Test(groups = "Create Character")
    public void testCreateCharacterWithValues3() {
        System.out.println("createCharacterWithValues3");
        String ID = "123";
        String name = "thoai";
        String desc = "handsome";
        boolean expResult = true;
        boolean result = CharacterCRUD.createCharacterWithValues(ID, name, desc);
        assertEquals(result, expResult);
        
    }
    
    // Bởi vì khi Test case "Create Character" được thực thi sẽ tạo sẵn 1 Object dưới database
    // Nên việc test lại lần sau sẽ bị lỗi vì đối tượng đã được tạo sẵn rồi
    // Vậy nên việc sử dụng 1 test case "Delete Character" sử dụng ID test vừa tạo đc sau khi tạo
    // sẽ giúp cho lần sau khi test lại vân bình thường
    @AfterTest(groups = "Create Character")
    @Test(groups = "Delete Character")
    public void testDeleteCharacterWithGivenRightArgumentReturnWell(){
        
        assertEquals(CharacterCRUD.deleteCharacterWithID("123"), true);
    }
}
