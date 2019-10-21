package com.hello.world.service;

import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA
 *
 * @auther youxiang
 * @date 2019/10/16 13:25
 * Description:
 */
public class StreamTest01 {

    public static void main(String[] args) {
        /*List<String> list1 = Arrays.asList("abc", "bcd", "jjj", "jjj2", "j3jj", "j2jj", "j1jj", "j6jj", "j9jj");
        List<String> list2 = Arrays.asList("abc1", "bcd", "345", "fsdf1s", "fsdf2s", "3fsdfs", "fs4dfs", "f6sdfs",
                "fsd1fs","fsdf9s", "fs11dfs", "fs22dfs", "fsdf3s", "fsd333fs", "fsd21fs", "fsdf33s", "f16sdfs",
                "f66sdfs");
        long startTime = System.nanoTime();
        long count = list1.stream().flatMap(special -> list2.stream().filter(sp2 -> sp2.equals(special))).count();
        long startTime1 = System.nanoTime();
        long count1 =
                list1.parallelStream().flatMap(special -> list2.stream().filter(sp2 -> sp2.equals(special))).count();
        long startTime2 = System.nanoTime();
        System.out.println(count);
        System.out.println(count1);
        System.out.println(startTime1 - startTime);
        System.out.println(startTime2 - startTime1);
        long pareTime = (startTime1 - startTime)-(startTime2 -startTime1);
        long l = TimeUnit.NANOSECONDS.toMillis(pareTime);
        System.out.println(l);*/

        List<String> list = Arrays.asList("nihao", "hello", "cbuul");

        list.sort(Comparator.comparingInt(String::length));


        System.out.println(Integer.MAX_VALUE);


    }
}
