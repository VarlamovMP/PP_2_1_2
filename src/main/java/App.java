import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        System.out.println("Ссылки \"helloworld\" =" + bean1.equals(bean2));
        System.out.println();

        Cat bean3 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getValue());
        Cat bean4 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean4.getValue());
        System.out.println("Ссылки \"cat\" =" + bean3.equals(bean4));


    }
}