/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_2;

/**
 *
 * @author Khai
 */
public class Project_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x[] = {2,3,4};
        m(x);
    }
    public static void m(int...i) {
       int sum = 0;
        for (int j : i) {
            sum+=j;
        }
        System.out.println("Sum = " + sum);
    }
    
    
}
