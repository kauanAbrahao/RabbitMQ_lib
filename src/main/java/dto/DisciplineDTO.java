package dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class DisciplineDTO implements Serializable {

    private Integer idDisc;
    private String nameDisc;
}
