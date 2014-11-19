package com.blogspot.toomuchcoding.jinkubator.groovy.family;

import java.util.List;
import java.util.Map;

public class JavaFamily {
    private Map<String, JavaFamilyMember> family;
    private List<JavaFamilyMember> friends;

    public List<JavaFamilyMember> getFriends() {
        return friends;
    }

    public void setFriends(List<JavaFamilyMember> friends) {
        this.friends = friends;
    }

    public Map<String, JavaFamilyMember> getFamily() {
        return family;
    }

    public void setFamily(Map<String, JavaFamilyMember> family) {
        this.family = family;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JavaFamily that = (JavaFamily) o;

        if (family != null ? !family.equals(that.family) : that.family != null)
            return false;
        if (friends != null ? !friends.equals(that.friends) : that.friends != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = family != null ? family.hashCode() : 0;
        result = 31 * result + (friends != null ? friends.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "JavaFamily{" +
                "family=" + family +
                ", friends=" + friends +
                '}';
    }
}
