package task5;

import java.util.*;

public class MarkUtils {

    public static <T extends Number> Number addMark(Group group, T mark, Student st) {
        Map<Group, List<Number>> groupList = st.getGroupList();
        if (groupList.containsKey(group)) {
            Class<? extends Number> markType = group.getSubject().markType;
            if (mark.getClass().equals(markType)) {
                groupList.get(group).add(mark);
                return mark;
            } else {
                System.out.println("тип не подходит");
            }
        }
        return null;
    }

    public static Number getAverageMark(Student st) {
        int count = 0;
        double sum = 0.0;
        Map<Group, List<Number>> groupList = st.getGroupList();

        for (List<Number> values : groupList.values()) {
            for (Number number : values) {
                sum += number.doubleValue();
                count++;
            }
        }
        return (double) Math.round(sum / count * 100) / 100;
    }

    public static <T extends Number> Number findMark(Group group, T num, Student st) {
        Map<Group, List<Number>> groupList = st.getGroupList();
        if (groupList.containsKey(group)) {
            for (List<Number> values : groupList.values()) {
                if (values.contains(num))
                    return num;
            }
        }
        return null;
    }
}