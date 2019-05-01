/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connectdb;

import java.sql.Connection;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class ConnectDBTest {
    
    public ConnectDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of hasDriver method, of class ConnectDB.
     */
    @org.junit.Test
    public void testHasDriver() {
        System.out.println("hasDriver");
        ConnectDB instance = new ConnectDB();
        instance.hasDriver();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openConnect method, of class ConnectDB.
     */
    @org.junit.Test
    public void testOpenConnect() {
        System.out.println("openConnect");
        ConnectDB instance = new ConnectDB();
        Connection expResult = null;
        Connection result = instance.openConnect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatement method, of class ConnectDB.
     */
    @org.junit.Test
    public void testGetStatement() {
        System.out.println("getStatement");
        ConnectDB instance = new ConnectDB();
        Statement expResult = null;
        Statement result = instance.getStatement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnect method, of class ConnectDB.
     */
    @org.junit.Test
    public void testCloseConnect() {
        System.out.println("closeConnect");
        ConnectDB instance = new ConnectDB();
        instance.closeConnect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ConnectDB.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ConnectDB.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
