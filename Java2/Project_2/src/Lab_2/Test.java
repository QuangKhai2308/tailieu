/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;

import java.util.ArrayList;

/**
 *
 * @author Khai
 */
public class Test {
    public static void main(String[] args) {
        //Tạo ArrayList<BookIT>
        ArrayList<BookIT> ListBook = new ArrayList<>();
        //Tạo đối tượng và gắn giá trị cho Java1
        Book Java1 = new Book(1, "Javal", "Herbert Schild", 50);
        //xuất đối tượng Java1
        System.out.println(Java1.toString());
        //Tạo 5 đối tượng BookIT và thêm vào ListBook
        ListBook.add(new BookIT(2, "Java 1",  "Tác Giả Java 1",  100, "CNTT", 100));
        ListBook.add(new BookIT(2, "Java 2",  "Tác Giả Java 2",  150, "CNTT", 150));
        ListBook.add(new BookIT(2, "Java 3",  "Tác Giả Java 3",  200, "CNTT", 200));
        ListBook.add(new BookIT(2, "Java 4",  "Tác Giả Java 4",  250, "CNTT", 250));
        ListBook.add(new BookIT(2, "Java 5",  "Tác Giả Java 5",  300, "CNTT", 300));
        //Sắp xếp list theo Author
        ListBook.sort((BookIT BookIT_1, BookIT BookIT_2) -> BookIT_1.getAuthor().compareTo(BookIT_2.getAuthor()));
        //Xuất list sau khi sắp xếp
        for (BookIT bookIT : ListBook) {
            System.out.println(bookIT);
        }
          
    }
}
