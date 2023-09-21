package hashmap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import hashset1.Book;
public class DemoHashmap2 {
  
  public static void main(String[] args) {

    
    HashMap<Integer,Book> books = new HashMap<>();
    // key = Address of Byte or value of Byte?
    books.put(Integer.valueOf(128), new Book("dummy","Book1"));
    books.put(128, new Book("dummy","Book2")); // auto box
    System.out.println(books.size()); //1

    HashMap<Author,Book> bookmap = new HashMap<>();
    // Author 點為之unique key? -> equals(), hashCode()
    Author author1 = new Author("John",30);
    Author author2 = new Author("John",29);
    bookmap.put(author1,new Book("dummy","Book3"));
    bookmap.put(author2,new Book("dummy","Book4"));
    System.out.println(bookmap.size()); // 1 ，佢當兩個呀John都係同一個人

    ArrayList<ArrayList<String>> strs = new ArrayList<>();

    //Array 底層係C++寫，
    // Arraylist<> 鑽石放class，唔可以放Integer[]
    HashMap<Author,ArrayList<Book>> bookMap2 = new HashMap<>();
    ArrayList<Book> booklist1 = new ArrayList<>();
    booklist1.add(new Book("dummy","Book1"));
    booklist1.add(new Book("dummy","Book2"));
    ArrayList<Book> booklist2 = new ArrayList<>();
    booklist2.add(new Book("dummy","Book3"));
    booklist2.add(new Book("dummy","Book4"));

    bookMap2.put(author1,booklist1);
    //Override, because author1.equals(author2) -> True
    bookMap2.put(author2,booklist2);

    System.out.println(bookMap2.size());// 1
   

    //Loop bookMap2, print out all the books from each Author

    String[] strss = new String[4];
    for (String s : strss) {

    }

    for(HashMap.Entry<Author, ArrayList<Book>> entry: bookMap2.entrySet()){
      //System.out.println(author.getKey(),name);
      for(Book book: entry.getValue()){
        System.out.println("Author Name: "+ entry.getKey().name// get key即係get author
        + "  Book Name: "+ book.getName());
      }
    }

    for(Book book : bookMap2.get(new Author("John", 0))) {
      System.out.println(book);
    }
  }
}
