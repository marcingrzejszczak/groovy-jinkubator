package com.blogspot.toomuchcoding.jinkubator.groovy;

import java.util.List;
import java.util.Map;

public class JavaFamily {
    private Map<String, JavaGuy> familyMembers;
    private List<JavaGuy> friends;

    public List<JavaGuy> getFriends() {
        return friends;
    }

    public void setFriends(List<JavaGuy> friends) {
        this.friends = friends;
    }

    public Map<String, JavaGuy> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(Map<String, JavaGuy> familyMembers) {
        this.familyMembers = familyMembers;
    }
}
