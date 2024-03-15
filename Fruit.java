package seminar4;


public class Fruit {

    protected String name;
    protected float weight;

    public String getName(){
        return name;
    }

    public float getWeight(){
        return weight;
    }

    public Fruit(String name, float weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%s весом: %.1f ", name, weight);
    }

}
