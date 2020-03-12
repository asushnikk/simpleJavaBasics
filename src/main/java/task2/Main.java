package task2;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.getStationeries().add(new Pen(14, 88));
        employee1.getStationeries().add(new Pencil(1));
        employee2.getStationeries().add(new Pen(22, 8));
        employee2.getStationeries().add(new Pencil(2, 82));

        System.out.println(String.format("cost of employee1 is %s", SumUtil.Sum(employee1.getStationeries())));
        System.out.println(String.format("cost of employee2 is %s", SumUtil.Sum(employee2.getStationeries())));
    }
}
