/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author Sheeraz
 */
public class Variables {

    int cadence = 0;
    int speed = 0;
    int gear = 0;
    
    // Primitive Data Types
    
    int gaerTwo = 1;
    
    boolean result = true;
    
    char capitalC = 'C';
    
    byte b = 100;
    
    short s = 10000;
    
    int i = 100000;
       
    
    // Integer Literals
    
    // The number 26, in decimal
    
    int decVal = 26;
    
    // The number 26, in hexadecimal
    
    int hexVal = 0x1a;
    
    // The number 26, in binary
    int binVal = 0b11010;
    
    // Floating-Point Literals
    
    double d1 = 123.4;
    
    // same values as d1, but in scientific notation
    double d2 = 1.234e2;
    
    float F1 = 123.4f;
    
    
    // Using Underscore Characters in Numeric Literals
    
    long creditCardNumber = 1234_5676_3456L;
           
    long socialSecurityNumber = 999_99_9999L; 
            
    float pi = 3.14_15F;
            
    long hexBytes = 0xFF_EC_DE_5E;
                    
    long hexWords = 0xCAFE_BABE;
             
    long maxLong = 0x7fff_ffff_ffff_ffffL;
    
    byte nybbles = 0b0010_0101;
    
    long bytes = 0b11010010_01101001_10010100_10010010;
     
    // Invalid cannot put underscore adjecent to a decimal point
    
    // float pi1 = 3_.1415F;
    
    // Invalid cannot put underscores adjecent to a decimal point
    
    // float pi2 = 3._1415F;
    
    // invalid cannot put underscores prior to an L suffix
    
    // long socialSecurityNumber1 = 999_99_9999_L;
    
    // Ok (decimal literal)
    
    int x1 = 5_2;
    
    // invalid cannot put underscores At the end of a literal
    
    // int x2 = 52;
    
    // OK (decimal literal)
    
    int x3 = 5_______2;
             
    // Invalid cannot put underscores in the 0x radix prefix
    
    // int x4 = 0_x52;
    
    // Invalid cannot put underscores at the beggining of the number
    
    // int x5 = 0x_52;
    
    // OK (hexadecimal literal)
    int x6 = 0x5_2;
    
    // Invalid cannot put underscores at the end of a number
    //int x7 = 0x52_;
             
    
    
    
    
    
    
          
            
            
            
            
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
