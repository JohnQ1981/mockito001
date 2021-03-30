package com.my.mockito.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements ToDoService {

	public List<String> retrieveTodos(String user) {

		return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn To Dance", "2");
	}

}
