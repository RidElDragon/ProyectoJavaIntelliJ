package com.hodges.haldirhodges.dto;

public class UsuarioDto {
private Integer id;
private Integer anioNacimiento = 0;
private String nombre = "";
private String correo = "";
private String contrasenia = "";

    public UsuarioDto() {
    }

    public UsuarioDto(Integer id, Integer anioNacimiento, String nombre, String correo, String contrasenia) {
        this.id = id;
        this.anioNacimiento = anioNacimiento;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(Integer anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    @Override
    public String toString() {
        return "UsuarioDto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                '}';
    }
}
