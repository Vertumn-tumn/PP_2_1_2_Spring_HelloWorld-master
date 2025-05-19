import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld greeting1 = applicationContext.getBean(HelloWorld.class);
        System.out.println(greeting1.getMessage());
        HelloWorld greeting2 = applicationContext.getBean(HelloWorld.class);
        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);
        System.out.println(greeting1 == greeting2);
        System.out.println(cat1 == cat2);
    }
}