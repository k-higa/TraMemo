package com.example;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;

/**
 * Created by kazuyukihiga on 2016/12/31.
 */
public class SampleTest {

    static void exec(CyclicBarrier c) {
        try {
            c.await();
            System.out.println("hey ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) throws IOException, ExecutionException, InterruptedException {

        Arrays.asList("hoge", "hogheojg", "hohhoge", "")
                .stream()
                .filter(e -> e.length() > 3)
                .map(e -> e.toUpperCase())
                .peek(System.out::println)
                .forEach(System.out::println);
    }

    private String getList() {
        return Arrays.asList("hoge", "hogehoge", "")
                .stream()
                .filter(e -> "hoge".equals(e))
                .map(e -> e.toUpperCase())
                .findFirst()
                .orElse("hoge");
    }


}