package stereotype_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotations.config.AppConfig;
import stereotype_annotations.model.DataStructure;
import stereotype_annotations.model.ExtraHours;
import stereotype_annotations.model.MicroServices;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
        DataStructure dataStructure= container.getBean(DataStructure.class);
        dataStructure.getTotalHours();

        MicroServices microServices = container.getBean(MicroServices.class);
        microServices.getTotalHours();

        ExtraHours extraHours = container.getBean(ExtraHours.class);
        System.out.println("extraHours.getTotalHours() = " + extraHours.getTotalHours());


    }
}
