package stereotype_annotations.model;

import org.springframework.stereotype.Component;

@Component
public class ExtraHours {

    public Integer getTotalHours(){
        return 10;
    }
}
