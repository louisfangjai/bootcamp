public enum Color { // Color extends Enum這個class, Enum extends Object
  // hexCode
  RED("#FF0000"),//
  GREEN("#00FF00"),//
  BLUE("#0000FF"),//
  ;

  private String hexCode;

  private Color(String hexCode){ // private
    this.hexCode=hexCode;
  }
  public String getHexCode(){
    return this.hexCode;
  }
}
