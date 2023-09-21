package Q4;

public enum Color {

  RED(1),YELLOW(2),BLACK(3);


  int value;
  static int counter=0;

  Color(int i){
    this.value=i;
    counter++;
  }
  
}
