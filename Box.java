package seminar4;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;
    private int lastIndex = -1;
    
    public Box(){
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit){
        fruits.add(++lastIndex, fruit);
    }

    public float getWeight(){
        float weight = 0;
        for(T fruit : fruits){
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box fruits){
        return this.getWeight() == fruits.getWeight();
    }

  
    public void transfer(Box<T> box){
        for(T fruit : fruits){
            box.addFruit(fruit);
        }
        fruits.clear();
    }

    public void printBox(){
        for(T fruit : fruits){    
            System.out.println(fruit);
        }
    }

}
