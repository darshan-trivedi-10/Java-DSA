package String;

class Cat {
    public String name;
}

class Test {

    public static void main(String[] args) {
        Cat c = new Cat();
        c.name = "darshan";
        System.out.println(c.name);
        test(c);
        System.out.println(c.name);
    }

    public static void test(Cat c) {
        c.name = c.name.toUpperCase(); // Update the name field with the uppercase version
    }
}
