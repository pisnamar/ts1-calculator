/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pisnamar.calculator.Calculator;

/**
 *
 * @author martu
 */
public class CalculatorTest {
    public static Calculator calc;
    
    
    public CalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        calc = new Calculator();
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void AddTest(){
        int x = 1;
        int y = 2;
        int expected = 3;
        assertEquals(calc.add(x,y), expected);
    }
    
    @Test
    public void SubtractTest(){
        int x = 10;
        int y = 5;
        int expected = 5;
        assertEquals(calc.subtract(x,y), expected);
    }
    
    @Test
    public void MultiplyTest(){
        int x = 7;
        int y = 8;
        int expected = 56;
        assertEquals(calc.multiply(x, y), expected);        
    }
    
    @Test
    public void DivisionTest(){
        int x = 12;
        int y = 4;
        int expected = 3;
        assertEquals(calc.divide(x, y), expected);
    }
    
    @Test
    public void DivisionByZeroTest(){
        int x = 12;
        int y = 0;
        ArithmeticException e = assertThrows(ArithmeticException.class, () -> {calc.divide(x,y);});
        
        String expectedErrorMessage = "Cannot divide by 0!";
        
        assertEquals(e.getMessage(), expectedErrorMessage);
        
    }
}
