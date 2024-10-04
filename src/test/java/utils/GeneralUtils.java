package utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeneralUtils {

    public static Object convertToCommaSeperatedString(List list) {
        return list.stream().collect(Collectors.joining(","));
    }

    public static Object convertToCommaSeperatedString(Stream stream) {
        return stream.map(x -> x.toString()).collect(Collectors.joining("->"));
    }

    public static Object convertToCommaSeperatedString(int[][] multiInt) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] singleInt : multiInt) {
            stringBuilder.append(convertToCommaSeperatedString(Arrays.stream(singleInt).boxed()) + ",");
        }

        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }

    public static ListNode getListNode(int[] values){
        ListNode listNode = new ListNode(-1);
        ListNode tempNode = listNode;

        for(int value: values){
            tempNode.next = new ListNode(value);
            tempNode = tempNode.next;
        }

        return listNode.next;
    }

    public static void validateListNode(ListNode listNode, int[] values){
        for(int value: values){
            assert listNode.val == value;
            listNode = listNode.next;
        }

        assert listNode == null;
    }

    public static boolean validateList(ListNode listNode, int[] values){
        if(listNode == null && values.length != 0){
            return false;
        }

        for(int value: values){
            if(listNode.val != value){
                return false;
            }
            listNode = listNode.next;
        }

        if(listNode != null)
            return false;

        return true;
    }

}
