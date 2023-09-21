public class Person { // template
    // main//是method
    // class是個template，class同main無關係，person是個template去生產野

    // Describe the person by attributes
    private int age; // 死物，如果create person，只是形容有生產person 有D咩 >>>無 value 
    private char gender; // adjective
    // private人地睇唔到
    // .......

    public boolean isMale() { // each object has this method
        if (this.gender == 'F') { // 要this 就Non-static
            return false;
        }
        return true;
    }

    public static boolean isMale(char gender) {  //belongs to class
        if (gender == 'F') {     // static=出面拎的value belongs to class所以static method是公家地方
            return false;
        }
        return true;
    }

    // getter
    public int getAge() { // 無parameter
        return this.age; // this.age
    }

    // setter
    public void setAge(int age) { // 工具
        this.age = age; // p 是個波，有工具, this object 形容時空
                        // this a 點點...，另一個波就唔同 無this，自己放落自己到 13=13,age=age no effect，this.age係放落個波到
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static void main(String[] args) { //main不是屬於person，main是動態操作，JVM認到MAIN去做野(係memory) main execute program野
        String s = new String("abc"); // memory上有個s new an object in heap
        String s2 = "abcd"; // 本質上 s 同s2是一樣的 new an object in heap
        String s3 = String.valueOf("abcde"); // new an object in heap
        Boolean b = new Boolean("true"); // new an object in heap
        Boolean b2 = Boolean.valueOf("false"); // new an object in heap
        Boolean b3 = true; // auto-box//new an object in heap

        Person p = new Person(); // Produce empty person object, with default value
        Person p2 = new Person(); // Produce empty person object, with default value
        p.setAge(13);
      

        // Static vs non-static
        // static 靜止
        System.out.println(Person.isMale('F')); // -> false // 公家地方唔belongs任何object (用緊static method)
        String result =String.valueOf(123); //(static method)
        System.out.println(result); //123

        //non-static
        p.setGender('M');
        System.out.println(p.isMale()); // true && true
        // if (gender == 'F' && this.gender == 'M')->你set左佢做M
            // think about static or not -> this 就係non-static
            Computer computer = new Computer(); // Computer() ->empty constructor
            computer.setColor("RED");
            computer.setRam(128);
            computer.setWeight(2);
    
            Computer computer2 = new Computer("Yellow"); // kind of setter
            computer2.getColor();// Yellow    
            computer2.setColor("Black");
           System.out.println( computer2.getColor()); // -> Black
            // computer2.color="Orange"; < if computer果度無set private.....可以改變
            // System.out.println(computer2.color);        並且就咁PRINT，唔洗get
            //public 外面的人都可以入黎拎

}
}
