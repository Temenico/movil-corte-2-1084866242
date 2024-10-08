package com.corhuila.BackendActividad1084866242.Servcie;

import com.corhuila.BackendActividad1084866242.Entitity.Usuarios;
import com.corhuila.BackendActividad1084866242.IRepository.IBaseRepository;
import com.corhuila.BackendActividad1084866242.IRepository.IUsuariosRepository;
import com.corhuila.BackendActividad1084866242.IService.IUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService extends ABaseService<Usuarios> implements IUsuariosService {
    @Override
    protected IBaseRepository<Usuarios, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IUsuariosRepository repository;
}