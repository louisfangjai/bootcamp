import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
  
  public static void main(String[] args) throws Exception{
    

    // Optional<Book> -> Book-> String , 罩住一樣野去avoid佢null, in this case,佢避開Book會null
   // Optional<Book> o = null; <炸彈

   Optional<Book> o = getBook(); // call method
   if(!o.isPresent()){ //唔存在

   }
   o.ifPresent(e->{

   });
    List<Book> books = new ArrayList<>();
    books.add(new Book("John"));
    books.add(new Book("Andy"));
    books.add(new Book("Keith"));

    Optional<Book> book=books.stream()// object book is not null，無野但不是null
    .filter(b-> b.author.startsWith("A"))// 無， 
    .findAny();

    book.ifPresent(b->{ // if存在做, return void
      System.out.println(b);
      // codes...
    }); // 無得else

    if(book.isPresent()){ // return boolean
    System.out.println(book.get().author); //拎返本書
  } else{
    System.out.println("No Book found");
  }
    Optional<Book> book2 = Optional.of(new Book("Eric"));
    //Optional<Book> book3 = Optional.of(null); // runtimee-error
    Optional<Book> book4 = Optional.ofNullable(null); //  真係null
    System.out.println(book4.isPresent());// false
    Optional<Book> book5 = Optional.ofNullable(new Book("Jenny"));
    Optional<Book> book6 = Optional.empty();// 不是null，只是無野
    System.out.println(book6.isPresent());// false

    //Optional<Book>book7 = null; <連個Optional都係null , null.咩野都死
    //Optional<Book>-> Book
    Book newBook = book6.orElse(new Book("default")); // orElse> 如果無就幫我拆箱，萬一無就放本書
    // orElse 幫你堵塞 // 你confirm佢係null
    // Optionaal 不是null但可以接null
    // Method return type: Optional , return null就唔理想

    Book newbook2 = book6.orElseGet(()->new Book("default"));
    Book newbook3 = book6.orElseThrow(()-> new Exception());
}

  public static Optional<Book>getBook(){
    //get book logic...
    return Optional.empty(); // 搵唔到就比個
  }

  public static Book getBook2(){ // 如果你return Book即有機會是null
    return null;
  }
  public static Optional<Book> getBook(Optional<Book> book){ // 如果你return Book即有機會是null
    // parameterr 放Opional就唔好了
    if(book == null)
    return null;

    return Optional.empty();
  }

    public static Optional<List<Book>>getBook3(){
    //get book logic...
    return Optional.empty(); // 搵唔到就比個
  }
}
