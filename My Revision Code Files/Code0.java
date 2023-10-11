import java.util.ArrayList;

public class Code0{
    public static void main(String[] args){
        String[] animals = {"Dog", "Cat", "Cow", "Python", "Cat"};
        ArrayList<String> animalsList = new ArrayList<String>();
        for( String animal : animals){
            System.out.println(animal);
        }

        animalsList.add("Dog");
        animalsList.add("Cat");
        animalsList.add("Budgy");
        animalsList.add("Frog");
        animalsList.add("Horse");
        for( String animalNames : animalsList){
            System.out.println(animalNames);
        }
        
    }
}