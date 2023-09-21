package Machines;
public class Monitor {
  
  private double length; //double 儲存是無問題的，但計野果陣用bigdemical
  private double width;

  public Monitor(double length, double width){ // full argument constructor
    this.length=length;
    this.width=width;
  }

  public double getLength(){
    return this.length;
  }
  public void setLenth(double length){
    this.length = length;
  }

  public double getWidth(){
    return this.width;
  }

  public void setWidth(double width){
    this.width = width;
  }
}
