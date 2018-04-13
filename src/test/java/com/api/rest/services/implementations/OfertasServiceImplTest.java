/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.rest.services.implementations;

import com.api.rest.models.Ofertas;
import java.io.BufferedReader;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thayller
 */
public class OfertasServiceImplTest {
    
    public OfertasServiceImplTest() {
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
     * Test of findAll method, of class OfertasServiceImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        OfertasServiceImpl instance = new OfertasServiceImpl();
        List<Ofertas> expResult = null;
        List<Ofertas> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lerTxt method, of class OfertasServiceImpl.
     */
    @Test
    public void testLerTxt() {
        System.out.println("lerTxt");
        String txt = "";
        OfertasServiceImpl instance = new OfertasServiceImpl();
        BufferedReader expResult = null;
        BufferedReader result = instance.lerTxt(txt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findStatus method, of class OfertasServiceImpl.
     */
    @Test
    public void testFindStatus() {
        System.out.println("findStatus");
        Boolean r = null;
        OfertasServiceImpl instance = new OfertasServiceImpl();
        Ofertas expResult = null;
        Ofertas result = instance.findStatus(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
