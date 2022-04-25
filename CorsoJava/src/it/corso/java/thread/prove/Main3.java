package it.corso.java.thread.prove;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main3 {

	public static void main(String[] args) {

		
		Main3 m = new Main3();
		
		m.executorServiceExample();

	}

	private void executorServiceExample() {

		
		ExecutorService es = Executors.newFixedThreadPool(10);
		
		List<Callable<String>> callables = new ArrayList<Callable<String>>();
		callables.add(newCallable("Task 1.1 "));
		callables.add(newCallable("Task 1.2 "));
		callables.add(newCallable("Task 1.3 "));
		
		try {
			List<Future<String>> result = es.invokeAll((Collection<Callable<String>>) callables);
			
			for( Future<String> msg : result ) {
				System.out.println(msg.get());
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			es.shutdown();
		}
		
			
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
