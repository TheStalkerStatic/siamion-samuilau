package HCR;

public class Cat {
    int maxHeight;
    int maxLenght;
    String name;

    public Cat(int maxHeight, int maxLenght, String name) {
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
        System.out.println("Cat jump");
    }

    public void run() {
        System.out.println("Cat jump");
    }
}

