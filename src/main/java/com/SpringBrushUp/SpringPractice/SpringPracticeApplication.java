package com.SpringBrushUp.SpringPractice;

import com.SpringBrushUp.SpringPractice.Scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPracticeApplication {

//	What are the beans?
//	What are the dependencies of a bean?
//	Where to search for beans?

	private static Logger LOGGER =
		LoggerFactory.getLogger(SpringPracticeApplication.class);

	public static void main(String[] args) {

//		---- spring does this for us ---
//		BinarySearchImpl binarySearch =
//				new BinarySearchImpl(new QuickSort());

//		--------------
//		ApplicationContext manages the beans
//		1. Assign SpringPracticeApplication.class to local variable appContext
//		2. get bean "binarySearch" assign to local variable for BinarySearchImpl bean


		ApplicationContext applicationContext =
				SpringApplication.run(SpringPracticeApplication.class, args);

		BinarySearchImpl binarySearch =
				applicationContext.getBean(BinarySearchImpl.class);

		int result =
				binarySearch.binarySearch(new int[] {12,4,6},3);

		PersonDAO personDAO =
				applicationContext.getBean(PersonDAO.class);

		PersonDAO personDAO1 =
				applicationContext.getBean(PersonDAO.class);

		System.out.println(result);

		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());

		LOGGER.info("{}",personDAO1);
		LOGGER.info("{}",personDAO1.getJdbcConnection());
	}


}
