package PassingLambdasAsMethodParam;

import java.util.function.Consumer;

public class TestRunner {

    static void perform(Animal animal){
        animal.run();
    }
    public static void main(String[] args) {
        // before java 8
        // Here we are passing object ex Cat or Dog which have its own behaivior
        Animal animal1 = new Dog();
        perform(animal1);

        perform(new Cat());

        // With Java 8
        // Here we are passing the behaivior
        Animal animal2 = ()->{System.out.println("Running at 100 kmph");};

        perform(animal2);

        Animal animal3 = ()->{System.out.println("Running at 300 kmph");};
        perform(animal3);

        // OR
        perform(()->{System.out.println("Running at 100 kmph");});

        stringOperation((s)->System.out.println(s.toLowerCase()),"shoBHIT");
        stringOperation((s)->System.out.println(s.toUpperCase()),"shoBHIT");
    }
    private static void  stringOperation(Consumer<String> consumer, String temp){
        consumer.accept(temp);
    }
}
