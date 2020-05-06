package task2;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Employee {

    @Getter
    @Setter
    private List<Stationery> stationeries = new ArrayList<>();
}
