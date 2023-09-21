package checked;

public class AmountZeroException extends Exception{
  

  public AmountZeroException(String message){
    super(message); //每個Exception最基本有ge野
  }
}
