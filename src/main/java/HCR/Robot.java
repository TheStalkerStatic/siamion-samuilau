package HCR;

public class Robot {
    int maxHeight;
    int maxLenght;
    int serialNumber;

    public Robot(int maxHeight, int maxLenght, int serialNumber) {
        this.maxHeight = maxHeight;
        this.maxLenght = maxLenght;
        this.serialNumber = serialNumber;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxLenght() {
        return maxLenght;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void jump() {
        System.out.println("Robot jump");
    }

    public void run() {
        System.out.println("Robot jump");
    }
}
