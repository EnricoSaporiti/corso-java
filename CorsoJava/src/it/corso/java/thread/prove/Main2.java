package it.corso.java.thread.prove;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main2 {

	public static void main(String[] args) {
		
		Main2 m = new Main2();
		
		m.executorServiceExample();

	}
	
	private void executorServiceExample() {
		
		int corePoolSize = 10;
		int maxPoolSize = 20;
		long keepAliveTime = 3000;		
		
//		ExecutorService es = Executors.newFixedThreadPool(10);

		ExecutorService es = new ThreadPoolExecutor(
				corePoolSize,
				maxPoolSize,
				keepAliveTime,
				TimeUnit.MILLISECONDS,
				new ArrayBlockingQueue<>(128)
				);
		
		Future f1 = es.submit(newCallable("Task 1.1"));
		Future f2 = es.submit(newRunnable("Task 2"));
		Future f3 = es.submit(newRunnable("Task 3"));

		System.out.println("f1 is done = " + f1.isDone());
		try {
			
			String result = (String) f1.get();
			System.out.println(result); 
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("f1 is done = " + f1.isDone());

		System.out.println("f1 is done = " + f1.isDone());
		System.out.println("f1 is done = " + f1.isDone());
		
		es.shutdown();
		
	}
	
	private Runnable newRunnable(String msg) {
		return new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + ": " + msg);
				
			}
			
		};
		
	}
	
	private Callable newCallable(String msg) {
		
		return new Callable() {

			@Override
			public Object call() throws Exception {
				
				String completeMsg = Thread.currentThread().getName() + ": " + msg;
				// TODO Auto-generated method stub
				return completeMsg;
			}
			
			
			
		};
		
		
	}

}
