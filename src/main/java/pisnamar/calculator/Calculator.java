/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pisnamar.calculator;

/**
 *
 * @author martu
 */
public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    
    public int subtract(int x, int y){
        return x - y;
    }
    
    public int multiply(int x, int y){
        return x * y;
    }
    
    public int divide(int x, int y) throws ArithmeticException{
        if (y == 0){
            throw new ArithmeticException("Cannot divide by 0!");
        }
        return x / y;
    }
}
