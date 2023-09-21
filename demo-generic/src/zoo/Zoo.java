package zoo;
public class Zoo<T extends Animal> { // 唔會<Animal> (無紅線)

  T animal; //不是animal個class

  //Constructor
  private Zoo(T animal){
    this.animal=animal;
  }
  //Zoo<T> -> return type
  //T - > input parameter
  //<T extends Animal> -> the range of T of the method (講緊呢個Method個T，唔係上面個T)
  public static <T extends Animal> Zoo<T> of(T animal){ // return  T 要range, return typeZoo<T>，左面是範圍
    //static 要describle 個範圍, static是獨立
    return new Zoo<>(animal);

  }

  public T getAnimal(){
    return this.animal;
  }

  public void setAnimal(T animal){
    this.animal=animal;
  }
public static void main(String[] args) {
  //Dog dog2 = new Dog("SMALL VIVNCENT");
  Dog dog3 = Dog.of("vincent");
  System.out.println(dog3);
}
}
