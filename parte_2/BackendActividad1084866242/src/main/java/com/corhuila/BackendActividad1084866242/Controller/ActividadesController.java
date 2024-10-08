package com.corhuila.BackendActividad1084866242.Controller;

import com.corhuila.BackendActividad1084866242.Entitity.Actividades;
import com.corhuila.BackendActividad1084866242.IService.IActividadesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/actividades")
public class ActividadesController extends ABaseController<Actividades, IActividadesService> {
    public ActividadesController(IActividadesService service) {
        super(service, "Actividades");
    }
}
