public class TestAge {
  
  public static void main(String[] args) {

    //用個class做array
    Demo d123 = new Demo();
    d123.age = 20;

    Demo[][] demo = new Demo[2][2];
    demo[0][0]= new Demo();
    demo[0][1]= new Demo();
    demo[1][0]= new Demo();
    demo[1][1]= new Demo();

     for( int i =0; i< demo.length;i++){ // 背
        for(int j=0; j< demo[0].length;j++){  //背 0係因為set死左
            System.out.println(demo[i][j].age);// 0,0....( because of default value) print age of each demo
        }
    }
    }
  }
