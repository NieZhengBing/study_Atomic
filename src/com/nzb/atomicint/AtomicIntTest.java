package com.nzb.atomicint;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author M
 * @create 2018/2/13
 */
public class AtomicIntTest {
    static AtomicInteger ai = new AtomicInteger(1);

    public static void main(String[] args) {
        System.out.println(ai.getAndIncrement());
        ai.incrementAndGet();
        System.out.println(ai.get());
    }
}
