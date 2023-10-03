package com.example.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="cursos")
public class Curso {
   
    @Id
    int codigo;
    String nombre;
    int duracion;
    int precio;
    

      
    public Curso(int codigo, String nombre, int duracion, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }
    public Curso() {
    }
       
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + duracion;
        result = prime * result + precio;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        if (codigo != other.codigo)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (duracion != other.duracion)
            return false;
        if (precio != other.precio)
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Curso [codigo=" + codigo + ", nombre=" + nombre + ", duracion=" + duracion + ", precio=" + precio + "]";
    }

   

    
}
