package Shablon;

public abstract class Animal {
    private int weight;
    private int age;
    private String gender;
    private String colour;

    public Animal(int weight, int age, String gender, String colour) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.colour = colour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName()+":"+
                "weight=" + weight +
                "\nage=" + age +
                "\ngender='" + gender + '\'' +
                ", colour='" + colour + '\'' +
                "\n-----------------"+
                '}';

    }

    public String getColour() {
        return colour;
    }
}
