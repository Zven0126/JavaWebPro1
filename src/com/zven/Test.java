package com.zven;

/**
 * @author Administrator
 * @date 2019/10/23 0023 14:47
 */
public class Test {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("a = " + a);

        String[] sArr = new String[]{"name1","name2","name3","name4"};

        for (int i = 0; i < sArr.length; i++) {
            if (i==2) System.out.println("I = " + i);
        }
    }
}
