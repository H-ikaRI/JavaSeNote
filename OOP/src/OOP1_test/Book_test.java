package OOP1_test;

/**
 * ClassName: Book
 * Package: OOP1_test
 * Description:
 *
 * @Author: Hjr
 * @Create 2023/5/20 16:09
 * @Version 1.0
 */
public class Book_test {
    public static void main(String[] args) {
       Book book1 = new Book();
       book1.setBookName("这是本书");
       book1.setAuthor("你自己");
       book1.setPrice(1230.0);
        System.out.println(book1.showInfo());
    }
}
