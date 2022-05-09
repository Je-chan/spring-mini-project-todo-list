package org.example.repository;

import org.example.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// JpaRepository<DB와 연결될 객체, Model 의 Id 타입>
@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {

}
