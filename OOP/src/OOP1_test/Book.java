package OOP1_test;

/**
 * ClassName: Book_test
 * Package: OOP1_test
 * Description:自定义图书类，设定属性包括书名bookName,作者author,价格price
 * 方法包括相应属性的get，set方法，图书信息介绍等
 *
 * @Author: Hjr
 * @Create 2023/5/20 16:09
 * @Version 1.0
 */
public class Book {
    private String bookName;
    private String author;
    private double price;

    public String getBookName(){
        return bookName;
    }
    public void setBookName(String i ){
        bookName = i;
    }
    public String getAuthor(){
        return author;
    }
    public String setAuthor(String a){
       return  author = a;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double i){
        price = i;
    }
    public String showInfo(){
        return "bookname:"+bookName+"\tauthor:"+author+"\tprice:"+price;
    }

}
