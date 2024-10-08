package com.corhuila.BackendActividad1084866242.Servcie;

import com.corhuila.BackendActividad1084866242.Entitity.Actividades;
import com.corhuila.BackendActividad1084866242.IRepository.IBaseRepository;
import com.corhuila.BackendActividad1084866242.IRepository.IActividadesRepository;
import com.corhuila.BackendActividad1084866242.IService.IActividadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadesService extends ABaseService<Actividades> implements IActividadesService {
    @Override
    protected IBaseRepository<Actividades, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IActividadesRepository repository;
}