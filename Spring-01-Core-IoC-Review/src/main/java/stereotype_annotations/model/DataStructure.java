package stereotype_annotations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
//@Data
public class DataStructure {

   //@NonNull
    ExtraHours extraHours;

    public void getTotalHours(){
        System.out.println("Total hours data structure: " + (extraHours.getTotalHours()+40));
    }
}
