package HCR;

public class Human {
    int maxHeight;
    int maxLenght;
    String name;

    public Human(int maxHeight, int maxLenght, String name) {
        this.maxHeight = maxHeight;
        this.maxLenght = maxLenght;
        this.name = name;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxLenght() {
        return maxLenght;
    }

    public String getName() {
        return name;
    }

    public void jump() {
        System.out.println("Human jump");
    }

    public void run() {
        System.out.println("Human jump");
    }
}

