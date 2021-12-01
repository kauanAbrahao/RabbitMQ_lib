package dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class DepartmentDTO implements Serializable {

    private String codDpt;
    private String nameDpt;
}
