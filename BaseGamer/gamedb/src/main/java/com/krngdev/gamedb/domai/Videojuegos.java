package com.krngdev.gamedb.domai;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Videojuegos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String imagenurl;
    private String numero_serie;
    private String plataforma;
    private Integer ano_salida;
    private String descripcion;
    @ManyToOne
    private Generos genero;

    @ManyToOne
    private Distribuidor distribuidor;

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public Integer getAno_salida() {
        return ano_salida;
    }

    public void setAno_salida(Integer ano_salida) {
        this.ano_salida = ano_salida;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Videojuegos [id=" + id + ", nombre=" + nombre + ", numero_serie=" + numero_serie + ", plataforma="
                + plataforma + ", genero=" + genero.getId() + ", ano_salida=" + ano_salida + ", descripcion="
                + descripcion
                + ", distribuidor=" + distribuidor.getId() + ",ImagenUrl=" + imagenurl + "]";
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public String getImagenurl() {
        return imagenurl;
    }

    public void setImagenurl(String imagenurl) {
        this.imagenurl = imagenurl;
    }

    /*
     * private String descripciones;
     * private String ImagenUrl;
     * 
     * public Integer getId() {
     * return id;
     * }
     * 
     * public void setId(Integer id) {
     * this.id = id;
     * }
     * 
     * public String getNombre() {
     * return nombre;
     * }
     * 
     * public void setNombre(String nombre) {
     * this.nombre = nombre;
     * }
     * 
     * public String getDescripciones() {
     * return descripciones;
     * }
     * 
     * public void setDescripciones(String descripciones) {
     * this.descripciones = descripciones;
     * }
     * 
     * public String getImagenUrl() {
     * return ImagenUrl;
     * }
     * 
     * public void setImagenUrl(String imagenUrl) {
     * ImagenUrl = imagenUrl;
     * }
     */

}