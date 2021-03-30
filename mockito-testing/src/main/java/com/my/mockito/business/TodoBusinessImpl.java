package com.my.mockito.business;

import java.util.ArrayList;
import java.util.List;

import com.my.mockito.api.ToDoService;
// System under Test
// TodoService is Dependency
public class TodoBusinessImpl {
	private ToDoService todoService;

	public TodoBusinessImpl(ToDoService todoService) {
		
		this.todoService = todoService;
	}
	public List<String> retrieveTodosRelatedToSpring(String user){
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos= todoService.retrieveTodos(user);
		for(String w: todos) {
			if(w.contains("Spring")) {
				filteredTodos.add(w);
				
			}
		}
		return filteredTodos;
	}
}
