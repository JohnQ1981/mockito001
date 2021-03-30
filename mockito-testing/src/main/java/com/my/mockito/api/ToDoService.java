package com.my.mockito.api;

import java.util.List;
//1.Create TodoService Stub
//2. Test TodoBusinessImpl using TodoServiceStub
public interface ToDoService {
	public List<String> retrieveTodos(String user);

}
