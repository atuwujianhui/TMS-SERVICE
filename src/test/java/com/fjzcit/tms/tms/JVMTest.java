package com.fjzcit.tms.tms;

import java.util.ArrayList;
import java.util.List;

public class JVMTest {

    // private Integer id;
    // private String name;
    // private String sex;
    // private Integer age;
    //
    // public JVMTest(Integer id, String name, String sex, Integer age) {
    //     this.id = id;
    //     this.name = name;
    //     this.sex = sex;
    //     this.age = age;
    // }

    byte[] test = new byte[1024 * 100]; // 100K

    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
        List<JVMTest> list = new ArrayList<>();
        while(true) {
            list.add(new JVMTest());
            Thread.sleep(10);
        }

        // JVMTest test = new JVMTest();
        // int z = test.add();
    }

    private int add() {
        int x = 10;
        int y = 11;
        return x + y;
    }

    private int test() {
        return 1 + 2;
    }

    private void test2() {

    }
}
