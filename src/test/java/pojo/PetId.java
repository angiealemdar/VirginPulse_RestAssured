package pojo;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
public class PetId {
    private int id;
    private Category category;
    private String name;
    private List<String> photoUrls;
    private List<Tags> tags;
    private String status;
}
