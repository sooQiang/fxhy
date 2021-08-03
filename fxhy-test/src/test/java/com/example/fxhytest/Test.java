package com.example.fxhytest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: 星海
 * @Description: TODO
 * @DateTime: 2021/7/5 3:29 下午
 */
public class Test {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

        ReentrantReadWriteLock.ReadLock readLock = lock.readLock();

        ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

        readLock.lock();

        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
        newFixedThreadPool.execute(new Thread());


        ReentrantLock lock1 = new ReentrantLock();
        Condition condition = lock1.newCondition();
        String str = "https://swin.zy91.com/alipayswin/inhospital/inhospitalVerify.htm?param1=5356306&param2=2100250238&param3=500001111";

        System.out.println(str.contains("param1")?str.substring(str.indexOf("param1")+7,str.indexOf("&")):"");

    }

    static void test(){
        System.out.println("test");
    }

    static void test2(){
        System.out.println("test2");
    }
}
