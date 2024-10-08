package com.corhuila.BackendActividad1084866242.Entitity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios extends ABaseEntity{

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;

    @Column(name = "correo", length = 50, nullable = false)
    private String correo;

    @Column(name = "direccion", length = 50, nullable = false)
    private String direccion;

    @Column(name = "telefono", nullable = false)
    private Double telefono;

    @Column(name = "clave", length = 50, nullable = false)
    private String clave;

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getTelefono() {
        return telefono;
    }

    public void setTelefono(Double telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}

