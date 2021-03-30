package com.my.mockito.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.my.mockito.api.ToDoService;
import com.my.mockito.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingStub() {
		ToDoService todoServiceStub=  new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = 
				new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos= todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2,filteredTodos.size());
	}

}
