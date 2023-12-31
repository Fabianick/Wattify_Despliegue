package pe.edu.upc.aaw.wattify.dtos;

import pe.edu.upc.aaw.wattify.entities.Usuario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MembresiaDTO {
    private int id_Membresia;
    private String Tipo_Membresia;
    private LocalDate fechaInicio;
    private LocalDate Fecha_fin;
    private BigDecimal Precio;
    private Usuario usuario;

    public int getId_Membresia() {
        return id_Membresia;
    }

    public void setId_Membresia(int id_Membresia) {
        this.id_Membresia = id_Membresia;
    }

    public String getTipo_Membresia() {
        return Tipo_Membresia;
    }

    public void setTipo_Membresia(String tipo_Membresia) {
        Tipo_Membresia = tipo_Membresia;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFecha_fin() {
        return Fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        Fecha_fin = fecha_fin;
    }

    public BigDecimal getPrecio() {
        return Precio;
    }

    public void setPrecio(BigDecimal precio) {
        Precio = precio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
