package com.corhuila.BackendActividad1084866242.IRepository;

import com.corhuila.BackendActividad1084866242.Entitity.ABaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBaseRepository<T extends ABaseEntity, ID> extends JpaRepository<T,Long> {
}
