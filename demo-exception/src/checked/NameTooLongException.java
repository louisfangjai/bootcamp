package checked;

public class NameTooLongException extends Exception{
   // exception check expception
  
   public NameTooLongException(String message){
      super(message); // extends Exception 拎佢D功能黎用
   }
}
// Name too long > 無得fix
// index of果D有得fix>  unchecked ( runtime exception)
