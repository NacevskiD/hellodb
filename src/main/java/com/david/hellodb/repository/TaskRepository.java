package com.david.hellodb.repository;
import com.david.hellodb.model.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TaskRepository extends PagingAndSortingRepository<Task,Long>{
}
