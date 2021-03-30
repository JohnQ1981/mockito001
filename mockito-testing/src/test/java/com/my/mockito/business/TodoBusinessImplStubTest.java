package com.my.mockito.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.my.mockito.api.ToDoService;
import com.my.mockito.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingStub() {
		ToDoService todoServiceMock=  mock(ToDoService.class);
		List<String> todos =Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn To Dance", "2");
		when(todoServiceMock.retrieveTodos("D")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = 
				new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos= todoBusinessImpl.retrieveTodosRelatedToSpring("D");
		List<String> expectedList= new ArrayList<String>();
		expectedList.add("Learn Spring MVC");
		expectedList.add("Learn Spring");
		assertEquals(2,filteredTodos.size());
		assertEquals(expectedList, filteredTodos);
	}
	
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingEmptyList() {
		ToDoService todoServiceMock=  mock(ToDoService.class);
		List<String> todos =Arrays.asList("Spring");
		when(todoServiceMock.retrieveTodos("D1")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = 
				new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos= todoBusinessImpl.retrieveTodosRelatedToSpring("D1");
		List<String> expectedList= new ArrayList<String>();
		expectedList.add("Learn Spring MVC");
		expectedList.add("Learn Spring");
		assertEquals(1,filteredTodos.size());
		//assertEquals(expectedList, filteredTodos);
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
