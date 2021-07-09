public class DemoClass {
    public static void main(String[] args) {
//        Product prod = new Product();
//        prod.id = 2;
//        //prod.pName = "tie" + 4f;
//
//        Product prod1 = new Product();
//        prod1.setName("socks");
//        prod1.setId(2);
//        System.out.println("product item name is " + prod1.getName());
//        getName(prod1);
//        System.out.println("product item name is " + prod1.getName());
        Animal cat = new Cat();
        cat.eat();
        Dog dog = new Dog();
        dog.move();
        //dog.eat();
    }

    public static void getName(Product p) {
        p.setName("tshirt");
    }
}
