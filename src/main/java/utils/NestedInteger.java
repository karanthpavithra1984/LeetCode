package utils;

import java.util.ArrayList;
import java.util.List;

public class NestedInteger {
    Integer value;
    List<NestedInteger> nestedList = new ArrayList<>();

    public NestedInteger() {}

    public NestedInteger(int i) {
        this.value = i;
    }

    public boolean isInteger(){
        return value != null;
    }

    public Integer getInteger(){
        return value;
    }

    public void setInteger(int value){
        this.value = value;
    }

    public void add(NestedInteger ni){
        this.nestedList.add(ni);
    }

    public List<NestedInteger> getList(){
        return nestedList;
    }

}
