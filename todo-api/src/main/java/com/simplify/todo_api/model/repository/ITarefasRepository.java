package com.simplify.todo_api.model.repository;

import com.simplify.todo_api.model.entity.TarefasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITarefasRepository extends JpaRepository<TarefasEntity,Long> {
}
