public class Star2 {
  public static void main (String[] args){

    String star = "*";

    for (int i = 0; i < 5; i++) { 
      
      if (i < 1){
        System.out.println(star);
        }
            else if(i < 2 ){
              System.out.println("*" + star);
            }
            else if(i < 3 ){
              System.out.println("*"+"*"+ star);
            }
            else if(i < 4 ){
              System.out.println("*"+"*"+"*"+ star);
            }
            else if(i < 5 ){
              System.out.println("*"+"*"+"*"+"*"+ star);
            }
            
        
      
        
      

    }


  }
  
}
