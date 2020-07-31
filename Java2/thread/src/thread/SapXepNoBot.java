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

public class SapXepNoBot {
 
    public void bubbleSort(int arr[]) {
        int temp = arr[0];
        int i, j;
 
//        boolean swapped = false;
 
        // lap qua tat ca cac so
        for (i = 0; i < arr.length - 1; i++) {
//            swapped = false;
 
            // vong lap thu hai
            for (j = 1; j < arr.length; j++) {
                System.out.print("So sanh cac phan tu: [" + arr[i] + ", " + arr[j] + "]");
 
                // kiem xa xem so ke tiep co nho hon so hien tai hay khong
                // trao doi cac so.
                // (Muc dich: lam noi bot (bubble) so lon nhat)
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
 
//                    swapped = true;
                    System.out.println(" => trao doi [" + arr[i] + ", " + arr[j] + "]");
                } else {
                    System.out.println(" => khong can trao doi.");
                }
            }
 
            // neu khong can trao doi nua, tuc la
            // mang da duoc sap xep va thoat khoi vong lap.
//            if (!swapped) {
//                break;
//            }
 
            System.out.println("Vong lap thu " + (i + 1));
            display(arr);
        }
    }
 
    public void display(int arr[]) {
        int i;
        System.out.print("[");
 
        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
 
        System.out.print("]\n");
    }
 
    public static void main(String[] args) {
        // khoi tao mang arr
        int arr[] = {6, 7, 0, 2, 8, 1, 3, 9, 4, 5};
 
        SapXepNoBot sapXepNoBot = new SapXepNoBot();
        System.out.println("Mang du lieu dau vao: ");
        sapXepNoBot.display(arr);
        System.out.println("-----------------------------");
        sapXepNoBot.bubbleSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        sapXepNoBot.display(arr);
    }
}
