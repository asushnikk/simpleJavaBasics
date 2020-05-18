package task5;

import java.util.*;

public class Student {

    private String name;
    private Map<Group, List<Number>> groupList = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<Group, List<Number>> getGroupList() {
        return groupList;
    }

    public void addGroup(Group newGroup) {
        if (!groupList.containsKey(newGroup)) {
            groupList.put(newGroup, new ArrayList<Number>());
            newGroup.addStudent(this);
        }
    }
}