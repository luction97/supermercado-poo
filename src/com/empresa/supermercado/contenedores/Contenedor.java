package com.empresa.supermercado.contenedores;

import com.empresa.supermercado.IContenedor;
import com.empresa.supermercado.IProducto;

import java.util.HashSet;
import java.util.Set;

public abstract class Contenedor implements IContenedor {

    private String referencia;
    private int alto;
    private int resistencia;
    private Set<IProducto> productos;

    public Contenedor(String referencia, int alto, int resistencia) {
        this.referencia = referencia;
        this.alto = alto;
        this.resistencia = resistencia;
        productos = new HashSet<IProducto>();

    }


    @Override
    public String getReferencia() {
        return referencia;
    }

    @Override
    public int getVolumen() {
        return alto * getSuperficie();
    }

    @Override
    public int volumenDisponible() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getResistencia() {
        return resistencia;
    }

    @Override
    public Set<IProducto> getProductos() {
        return productos;
    }

    @Override
    public boolean agregar(IProducto producto) {
        boolean resistenciaOk = resiste(producto);
        boolean volumenOk = producto.tieneEspacio(this);
        boolean compatibilidadOk = true;

        boolean acepta = resistenciaOk && volumenOk && compatibilidadOk;  // Si resiste su peso, si hay volumen y compatibilidad
        if (acepta){
            productos.add(producto);
            producto.agregar(this);
        }
        return acepta;
    }

    @Override
    public boolean resiste(IProducto producto) {
        return resistencia > producto.getPeso();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Contenedor " + referencia + " [" + getTipo() +
                "] (sup " + getSuperficie() + "cm2 - vol " + getVolumen() + "cm3 - resistencia " + getResistencia() + " g).\n");
        if (productos.isEmpty()) {
            sb.append("\t\tvacío\n");
        }
        for (IProducto p : productos) {
            sb.append("\t\t" + p + "\n");
        }
        sb.append("\t\t>> Disponible vol " + volumenDisponible() + "cm3");
        return sb.toString();
    }
}
