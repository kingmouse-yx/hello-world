package com.hello.world.service;

import com.hello.world.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @auther youxiang
 * @date 2019/9/19 15:57
 * Description:
 */
public class Java8Test {
    public static void main(String[] args) {

        Student student1 = new Student("zhangsan", 24, 60, "男");
        Student student2 = new Student("lisi", 25, 45, "女");
        Student student3 = new Student("wangwu", 24, 43, "女");
        Student student4 = new Student("zhaoliu", 22, 67, "男");
        Student student5 = new Student("xiaoqi", 26, 57, "男");
        Student student6 = new Student("dabai", 22, 77, "男");
        Student student7 = new Student("xiaohong", 25, 55, "女");


        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);


        //long count = studentList.stream().filter(student -> "小白".equals(student.getName())).count();
        //boolean count = studentList.stream().anyMatch(student -> "xiaoqi".equals(student.getName()));
        studentList.stream().findAny().ifPresent(System.out::println);
        System.out.println("---------------------");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);



        //TODO: 计算所有男生的体重之和
      /*  int sum = studentList.stream().filter(s -> "男".equals(s.getSex())).mapToInt(v -> v.getWeight()).sum();
        System.out.println("结果为：" + sum);*/

        System.out.println("----------------");
        //TODO: 查询出将所有的男生，并按照年龄升序输出
        /*studentList.stream().filter(s -> "男".equals(s.getSex())).sorted((s1,s2) -> s1.getAge()-s2.getAge())
                .forEach(System.out::println);*/

        System.out.println("----------------");
        //TODO: 将所有学生姓名改成固定格式开头： 班级-性别-姓名
        /*studentList.stream().filter(s ->{
            s.setName("高中三班-"+s.getSex()+"-"+s.getName());
            return true;
        }).forEach(System.out::println);*/

        System.out.println("----------------");


        //TODO: 查询出集合中男生的年龄分别输出，备注：去重
        studentList.stream().filter(s -> "男".equals(s.getSex())).map(Student::getAge).distinct().
                forEach(System.out::println);

        System.out.println("----------------");

        //TODO: 查询出集合中男生的年龄，备注：去重,倒序，然后取前五个
        studentList.stream().filter(s -> "男".equals(s.getSex())).map(Student::getAge).distinct()
                .sorted((v1, v2) -> v2 - v1).limit(5).forEach(System.out::println);


        //TODO: 计算所有年龄小于25岁体重之和
        int sum2 = studentList.stream().filter(s -> s.getAge() < 25).mapToInt(Student::getAge).
                reduce(0, Integer::sum);



        /*Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList()).forEach(System.out::println);*/
    }

}
