package main;

public class Hedgehog {
    private String name;
    private int age;

    public Hedgehog() {
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void run() {

        System.out.println(name + " juoksee kovaa vauhtia!");
    }
    public void printName(){
        System.out.println("Olen "+name+" ja ikäni on "+age+" vuotta, mutta antaisitko silti syötteen?");
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
