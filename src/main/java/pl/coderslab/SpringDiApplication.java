package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pl.coderslab.beans.PersonService;

@ComponentScan()
public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringDiApplication.class);

        PersonService person = context.getBean(PersonService.class);
        System.out.println(person.getPersonRepository().getClass().getName());
        context.close();
    }
}
