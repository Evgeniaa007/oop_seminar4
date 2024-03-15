package seminar4;

import java.util.ArrayList;


public class Program {
    
    public static void main(String[] args) {

        Box<Apple> apples = new Box<>();

        Box<Orange> oranges = new Box<>();

        Box<Apple> apples2 = new Box<>();

        apples.addFruit(new Apple());
        apples.addFruit(new Apple());
        apples.addFruit(new Apple());
        //apples.addFruit(apple);
        System.out.println("Содержимое коробки с яблоками весом " + apples.getWeight());
        apples.printBox();

        apples2.addFruit(new Apple());
        apples2.addFruit(new Apple());
        System.out.println("Содержимое коробки с яблоками весом " + apples2.getWeight());
        apples2.printBox();
        

        oranges.addFruit(new Orange());
        oranges.addFruit(new Orange());
        //oranges.addFruit(orange);
        System.out.println("Содержимое коробки с апельсинами весом " + oranges.getWeight());
        oranges.printBox();

        System.out.println(apples.compare(oranges));

        apples2.transfer(apples);
        System.out.println();

        System.out.println("Содержимое коробки с яблоками весом " + apples.getWeight());
        apples.printBox();
        System.out.println("Содержимое коробки с яблоками весом " + apples2.getWeight());
        apples2.printBox();




    }

}
