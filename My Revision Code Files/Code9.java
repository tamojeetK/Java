import java.util.*;

class Animal {
    void speak() {
        System.out.println("Animal goes *brrrrr*");
    }
}

class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Cat goes *meow*");
    }
}

class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Dog goes *woof*");
    }
}

public class Code9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Animal animal = new Animal();

        System.out.println("What animal you want?");
        System.out.println("( 1=DOG ) & ( 2=CAT ) : ");
        System.out.print("-> ");
        
        int choice = sc.nextInt();
        if(choice==1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice==2){
            animal = new Cat();
            animal.speak();
        }
        else{
            animal = new Animal();
            System.out.println("That was Invalid Choice!");
        }
        sc.close();
    }
}