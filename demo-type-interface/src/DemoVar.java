import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoVar {

    //var age; // Not Allowed
    public static void main(String[] args) throws Exception {
        var s ="Hello";
       // s=3;// 不可以轉type, error,compile-check->String

        var i =2;
        var c ='a';
        //var n = null;// Not allowed,compile cannot refer the actual type 佢read唔到
        //var n;//NOT OK
        //var[]arr = new int[3]; // NOT Allowed

        //Loop
        List<String> strings =Arrays.asList("abc","def");
        for(var str : strings){
            System.out.println(str);
        }

        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        for(var entry: map.entrySet()){ // 右: map -> 一堆entry
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        var result =getString();
        result.add(Arrays.asList("dev","xyz"));
        result.add(Arrays.asList("ijk"));
        System.out.println(result);
    }

    public  static List<List<String>> getString(){

        return Arrays.asList(Arrays.asList("abc"));
    }
        // Not Allowed
        // public static var add(int x,int y){
        // return x+y;
        //}

        // Not Allowed
        // public static int add(var x,var y){
        // return x+y;
        //}
        }
    

