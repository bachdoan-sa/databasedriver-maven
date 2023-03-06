/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package org.teamswt301.dirverdatabasedata.dao.test;

import static org.testng.Assert.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author AN515-57
 */
public class ExamParametersTest {
    
//        Đây là ví dụ cơ bản về DDT với Parameters và testng.xml
    @Test
    @Parameters({"myActualName", "myExpectedName"})
    public void parameterTest(String myName,String expected) {
        System.err.println("Parameterized value is : " + myName);
        assertEquals(myName, expected);
    }
    //Kết thúc ví dụ cơ bản về DDT với Parameters và testng.xml
    
}
