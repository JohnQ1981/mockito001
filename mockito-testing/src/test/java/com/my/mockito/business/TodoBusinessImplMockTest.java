package com.my.mockito.business;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.my.mockito.api.ToDoService;
import com.my.mockito.api.TodoServiceStub;

public class TodoBusinessImplMockTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingStub() {
		ToDoService todoServiceStub=  new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = 
				new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos= todoBusinessImpl.retrieveTodosRelatedToSpring("");
		List<String> expectedList= new ArrayList<String>();
		expectedList.add("Learn Spring MVC");
		expectedList.add("Learn Spring");
		assertEquals(2,filteredTodos.size());
		assertEquals(expectedList, filteredTodos);
	}
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingStubList() {
		ToDoService todoServiceStub=  new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = 
				new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos= todoBusinessImpl.retrieveTodosRelatedToSpring("");
		List<String> expectedList= new ArrayList<String>();
		expectedList.add("Learn Spring MVC");
		expectedList.add("Learn Spring");
		
		assertEquals(expectedList, filteredTodos);
	}

}
