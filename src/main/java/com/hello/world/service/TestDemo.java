package com.hello.world.service;

/**
 * Created with IntelliJ IDEA
 *
 * @auther youxiang
 * @date 2019/9/16 15:02
 * Description:
 */
public class TestDemo {
    public static void main(String[] args) throws Exception {
        /*String cron = "0/1 00-30 16,19,20 * * ? *";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CronExpression cronExpression = new CronExpression(cron);
        Date parse = simpleDateFormat.parse("2019-09-26 19:00:20");
        Date date = new Date();
        boolean flag = cronExpression.isSatisfiedBy(simpleDateFormat.parse(simpleDateFormat.format(parse)));
        System.out.println(flag);*/
        test1();

    }

    public static void test1() {
        //2147483647
        int num = 2147483647;
        int num1 = num;
        int num2 = 0;
        while (num1 != 0) {
            num2 = num2 * 10 + num1 % 10;
            num1 /= 10;
        }
        System.out.println(num2);
        if (num < 0) {
            System.out.println(num + "不是回文数");
        } else if (num == num2) {
            System.out.println(num + "为回文数");
        } else {
            System.out.println(num + "不是回文数");
        }

    }

}