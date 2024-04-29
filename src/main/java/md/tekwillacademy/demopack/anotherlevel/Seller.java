package md.tekwillacademy.demopack.anotherlevel;

public class Seller {
   public String name;


    long salary;

    private long age;

    public void setAge(int enteredAge){
        if(enteredAge > 0 && enteredAge < 100){
            this.age = enteredAge;
        } else {
            System.out.println("The entered data is not valid");
        }
    }
    public long getAge(){
        return this.age;
    }
}
