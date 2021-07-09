public class AbstractDemo {

    int a = 5;
    int b = 4;
    public void addNumbers() {
        int result = a + b;
    }

    public void fly() {}
    public void eat() {}
    public void move() {}
}

class childDemo extends AbstractDemo {

    @Override
    public void addNumbers() {
        super.addNumbers();
    }
}