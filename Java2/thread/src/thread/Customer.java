/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Khai2
 */
public class Customer {

    private int amount = 1000000;

    public synchronized void withdraw(int m) {
        System.out.println("Bạn đang rút tiền....");
        if (amount < m) {
            System.out.println("Tài khoản của bạn không đủ");
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        amount = amount - m;
        System.out.println("Rút tiền thành công");
    }
}
