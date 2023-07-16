package OOP;

public class Animal {
    private int id;
    private String name;
    private String color;
    private float weight;

    public Animal(int id, String name, String color, float weight) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public Animal(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void show(int id, String name, String color, float weight) {
        System.out.println("ma: " + id + ", ten: " + name + ", mau: " + color + ", weight: " + weight);
    }
}
