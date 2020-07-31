/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_1;

/**
 *
 * @author Khai
 */
public class NoTaxProduct extends product{
    @Override
    public double getImportTax(){
       return 0;
   }
}
