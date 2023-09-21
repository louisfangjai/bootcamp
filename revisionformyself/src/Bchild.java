public class Bchild extends Aparent{
  int a;


public Bchild(int a){
  this.a=a;
}
//compile-error 
// soulution 1.: remove explicity constructor in Aparent.
// OR ~ 2. Aparent + empty constructor
}
