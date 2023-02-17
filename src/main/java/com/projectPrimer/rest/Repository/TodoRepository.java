package com.projectPrimer.rest.Repository;

import com.projectPrimer.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {

}
