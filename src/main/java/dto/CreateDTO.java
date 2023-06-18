package dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class CreateDTO implements Serializable {
    DepartmentDTO department;
    DisciplineDTO discipline;
}
