package com.synechron;

/**
 * @author vitthal.shirke
 * @description 2. Write a program with N thread where thread should be running
 *              separately but their execution should finish in sequence ,
 *              generate the output like where thread finishing in sequence
 *              though their start was not.
 *
 */
public class ThreadN {
	public static void main(String[] args) {
		final Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("sta rt-1 ");
				System.out.println(" finished-1 ");
			}// run
		});

		final Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("start-2");
				try {
					t1.join(2000);
				} catch (Exception e) {
					e.getStackTrace();
				}
				System.out.println(" finished-2");
			}
		});

		final Thread t3 = new Thread(new Runnable() {
			public void run() {
				System.out.println(" start-3 ");

				try {
					t2.join(4000);
				} catch (Exception e) {
					e.getStackTrace();
				}
				System.out.println(" finished-3 ");
			}
		});
		// reversing the order of the start() method
		t3.start();
		t2.start();
		t1.start();

	}
}
