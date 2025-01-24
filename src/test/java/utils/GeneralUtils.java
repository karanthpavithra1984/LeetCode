package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneralUtils {

    public static <T> Object convertToCommaSeperatedString(List<T> list) {
        return list.stream().map(x -> getValue(x)).collect(Collectors.joining(","));
    }

    public static Object convertToArrowSeperatedString(Stream stream) {
        return stream.map(x -> x.toString()).collect(Collectors.joining("->"));
    }

    public static void compareValues(int[] expected, int[] actual){
        assert expected.length == actual.length;
        for(int i= 0 ; i<expected.length; i++){
            assert expected[i] == actual[i];
        }
    }
    public static void compareValues(char[] expected, char[] actual){
        assert expected.length == actual.length;
        for(int i= 0 ; i<expected.length; i++){
            assert expected[i] == actual[i];
        }
    }

    public static void compareValues(long[] expected, long[] actual){
        assert expected.length == actual.length;
        for(int i= 0 ; i<expected.length; i++){
            assert expected[i] == actual[i];
        }
    }

    public static void compareValues(boolean[] expected, boolean[] actual){
        assert expected.length == actual.length;
        for(int i= 0 ; i<expected.length; i++){
            assert expected[i] == actual[i];
        }
    }

    public static Object convertToCommaSeperatedString(int[][] multiInt) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] singleInt : multiInt) {
            stringBuilder.append(convertToArrowSeperatedString(Arrays.stream(singleInt).boxed()) + ",");
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


    public static <T> void compareListOfList(List<List<T>> values,  List<List<T>> expectedValues ){
        assert values.size() == expectedValues.size();
        AtomicInteger index = new AtomicInteger();
        List<String> valuesString = new ArrayList<>();


        values.stream().forEach(x -> valuesString.add(x.stream().map(y -> getValue(y))
                .collect(Collectors.joining(","))));

        assertTrue(valuesString
                .stream().allMatch(x -> x.equals(getListString(expectedValues.get(index.getAndIncrement())))));
    }

    private static <T> String getValue(T y) {
        switch (y){
            case Integer i: return ""+i;
            case Long i: return ""+i;
            case Double i: return ""+i;
            case String i: return ""+i;
            default:
                throw new IllegalStateException("Unexpected value: " + y);
        }
    }



    private static <T> String getListString(List<T> values){
        return values.stream()
                .map(y -> y instanceof  Integer ? String.valueOf((int)y): (String)y)
                .collect(Collectors.joining(","));
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

    public static void validateTreeNode(TreeNode treeNode, String values){
        StringBuilder stringBuilder = new StringBuilder();
        evaluateTreeNode(stringBuilder,treeNode);
        assertEquals(stringBuilder.substring(0, stringBuilder.length() - 1), values);
    }

    private static void evaluateTreeNode(StringBuilder stringBuilder, TreeNode treeNode){
        if(treeNode == null) return;
        stringBuilder.append(treeNode.val + ",");
        evaluateTreeNode(stringBuilder,treeNode.left);
        evaluateTreeNode(stringBuilder, treeNode.right);
    }


}
