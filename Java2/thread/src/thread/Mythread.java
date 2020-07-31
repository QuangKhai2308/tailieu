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
public class Mythread extends Thread {
    @Override
    public void run() {
        //in các số từ 1- 10, mỗi lần in nghỉ 1s
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println("t = "+i);
                //nghỉ 1s
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
