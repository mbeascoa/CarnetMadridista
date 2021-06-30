
package com.example.carnetmadridista;

        import java.io.Serializable;

public class Madridista implements Serializable {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String correo;
    public boolean isSocio;
    public boolean isMayor;
    public boolean isResidente;



    public Madridista() {
    }

    public Madridista(String nombre, String apellido1 , String apellido2, String telefono,  String correo , boolean isSocio, boolean isMayor, boolean isResidente) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.correo = correo;
        this.isSocio = isSocio;
        this.isMayor = isMayor;
        this.isResidente = isResidente;
    }
    public boolean isIsResidente() {
        return this.isResidente;
    }

    public void setIsResidente(boolean isResidente) {
        this.isResidente = isResidente;
    }

    public boolean isIsSocio() {
        return this.isSocio;
    }

    public void setIsSocio(boolean isSocio) {
        this.isSocio = isSocio;
    }

    public boolean isIsMayor() {
        return this.isMayor;
    }

    public void setIsMayor(boolean isMayor) {
        this.isMayor = isMayor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}