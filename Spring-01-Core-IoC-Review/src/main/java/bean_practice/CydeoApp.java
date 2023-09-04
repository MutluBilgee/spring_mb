package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class, NewConfig.class);

        FullTimeEmployee fullTimeEmployee = container.getBean(FullTimeEmployee.class);
        fullTimeEmployee.createAccount();

        PartTimeEmployee partTimeEmployee = container.getBean(PartTimeEmployee.class);
        partTimeEmployee.createAccount();

        SpringCorePractice springCorePractice = container.getBean(SpringCorePractice.class);
        springCorePractice.spCorePractice();

        WelcomeToCydeoApp welcomeToCydeoApp = container.getBean(WelcomeToCydeoApp.class);
        welcomeToCydeoApp.welcome();

        String str1= container.getBean("str1",String.class);
        System.out.println("str1 = " + str1);

        String str2= container.getBean("str2",String.class);
        System.out.println("str2 = " + str2);



    }

}
