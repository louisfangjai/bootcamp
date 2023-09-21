public enum Currency {
  USD (1, "US Dollor"), //
  HKD (2, "Hong Kong Dollor"), //
  CNY (3, "Chinese Yuan Renminbi"), //
  GBP (4, "British Pound Sterling"), //
  ;
  //(括號入面的野就要打出黎)
  private int id;
  private String desc;
  

  //補constructor
  private Currency(int id,String desc){
    this.id=id;
    this.desc=desc;
  }
    //補getter
  public int getId(){
    return this.id;
  }
  public String getDesc(){
    return this.desc;
  }
  
  public static Currency getCurrency( int id){ //比 Currency>即HKD...
    //values()
    for( Currency currency: Currency.values()){ //for each// .values() array來
      if(currency.id==id)
      return currency; // 全部loop曬出黎 當match到user入的id return 對應currecy
    }
    return null;
  }

  public static void main(String[] args) {

    System.out.println(Currency.getCurrency(2)); // 2:HKD
    //valueof, 對應Class入面的object去.其他method //values() -> array
    System.out.println(Currency.valueOf("HKD").getDesc()); // Hong Kong Dollor
   // System.out.println(Currency.valueOf("HKDS").getDesc()); // not found , run time error //無紅線，但因為HKDS RUNTIME出事

  }
}
