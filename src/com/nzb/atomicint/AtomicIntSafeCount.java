package com.nzb.atomicint;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author M
 * @create 2018/2/13
 */
public class AtomicIntSafeCount {
    private AtomicInteger atomicI = new AtomicInteger(0);

    private void safeCount() {
        for (;;) {
            int i = atomicI.get();
            boolean suc = atomicI.compareAndSet(i, ++i);
            if (suc) {
                break;
            }
        }
    }
}
