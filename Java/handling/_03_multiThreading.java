package handling;

/*
 * Multiprogramming:
 * The ability of an operating system to keep multiple programs in memory
 * at the same time and switch the CPU among them to improve utilization.
 *
 * Multitasking:
 * The capability of an operating system to execute multiple tasks
 * (processes or applications) concurrently by rapidly switching the CPU.
 *
 * Multi-User:
 * A system feature that allows multiple users to access and use
 * the same computer system simultaneously, with proper resource sharing
 * and security controls.
 *
 * Multithreading:
 * A programming technique where a single process is divided into
 * multiple threads that run concurrently, sharing the same memory
 * space to achieve better performance and responsiveness.
 */

class TaskOne extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("TaskOne - Count: " + i);
        }
    }
}

class TaskTwo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("TaskTwo - Count: " + i);
        }
    }
}

public class _03_multiThreading {
    public static void main(String[] args) {
        TaskOne t1 = new TaskOne();
        TaskTwo t2 = new TaskTwo();

        t1.start(); // starts first thread
        t2.start(); // starts second thread
    }
}

/*
 * =========================
 * Java Synchronization Concepts
 * =========================
 *
 * 1. Shared Resource
 * -----------------
 * A shared resource is any object, variable, or data structure
 * that is accessed by multiple threads.
 * Example: a bank account balance, a counter, a file, or a database connection.
 *
 * 2. Critical Section
 * ------------------
 * The critical section is the portion of code where a shared resource
 * is accessed or modified.
 * Only one thread should execute the critical section at a time
 * to maintain data consistency.
 *
 * 3. Race Condition
 * ----------------
 * A race condition occurs when multiple threads access a shared resource
 * concurrently and the final outcome depends on the timing or order
 * of thread execution.
 * This often leads to inconsistent or incorrect results.
 *
 * 4. Mutual Exclusion
 * ------------------
 * Mutual exclusion ensures that only one thread can access
 * the critical section at any given time.
 * In Java, this is achieved using the 'synchronized' keyword or locks.
 *
 * 5. Lock / Monitor
 * ----------------
 * Every Java object has an intrinsic lock (also called a monitor).
 * When a thread enters a synchronized block or method,
 * it acquires the object's lock.
 * Other threads must wait until the lock is released.
 *
 * 6. Deadlock
 * ----------
 * Deadlock occurs when two or more threads are waiting for each other
 * to release locks, and none of them can proceed.
 * This results in permanent thread blocking.
 *
 * 7. Thread Starvation
 * -------------------
 * Thread starvation happens when a thread never gets CPU time
 * or access to resources because other threads are continuously favored.
 *
 * 8. Liveness
 * ----------
 * Liveness refers to the ability of a system to make progress.
 * Deadlock, starvation, and livelock are liveness problems.
 */

