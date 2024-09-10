package com.empresa.supermercado;

import com.empresa.supermercado.contenedores.Bolsa;
import com.empresa.supermercado.contenedores.Caja;
import com.empresa.supermercado.productos.Drogueria;
import com.empresa.supermercado.productos.Higiene;
import com.empresa.supermercado.productos.Mascotas;
import com.empresa.supermercado.productos.alimentacionImpl.Congelado;
import com.empresa.supermercado.productos.alimentacionImpl.Fresco;
import com.empresa.supermercado.productos.alimentacionImpl.NoPerecedero;

public class Supermercado {

    public static void main(String[] args) {
        IPedido pedidoActual = new Pedido("pedido001");

        IContenedor bolsaGrande = new Bolsa("B111", 40, 25);
        IContenedor cajaChica = new Caja("C222", 30, 50, 75);
        pedidoActual.addContenedor(bolsaGrande);
        pedidoActual.addContenedor(cajaChica);
        System.out.println("Bolsa: " + bolsaGrande);
        System.out.println("Caja: " + cajaChica);

        for (int indice = 0; indice < 2; indice++) {
            IContenedor nuevaCaja = new Caja("C23" + indice, 30, 40, 30);
            pedidoActual.addContenedor(nuevaCaja);
        }
        for (int indice = 0; indice < 2; indice++) {
            IContenedor nuevaBolsa = new Bolsa("B12" + indice, 3000, 30);
            pedidoActual.addContenedor(nuevaBolsa);
        }

        for (int indice = 0; indice < 2; indice++) {
            IContenedor otraBolsa = new Bolsa("B13" + indice, 2000, 25);
            pedidoActual.addContenedor(otraBolsa);
        }
        pedidoActual.addContenedor(new Caja("C333", 50, 60, 75)); // caja grande

        System.out.println("Pedido con contenedores: " + pedidoActual);

        IProducto frutasManzanas = new Fresco("MNZ", 1000, 1500);
        IProducto postreHelado = new Congelado("HLD", 800, 1000);
        IProducto papelHigienico = new Higiene("PWC", 500, 2500);
        IProducto frutasPeras = new Fresco("PER", 800, 1200);

        IContenedor contenedorManzanas = pedidoActual.addProducto(frutasManzanas);
        IContenedor contenedorHelado = pedidoActual.addProducto(postreHelado);
        IContenedor contenedorPapel = pedidoActual.addProducto(papelHigienico);
        IContenedor contenedorPeras = pedidoActual.addProducto(frutasPeras);

        for (int contador = 0; contador < 12; contador++) {
            IProducto productoLeche = new NoPerecedero("LCH" + contador, 6600, 7000);
            pedidoActual.addProducto(productoLeche);
        }
        pedidoActual.addProducto(new Mascotas("GAT", 5000, 10000)); // comida para el gato
        pedidoActual.addProducto(new Mascotas("PER1", 10000, 20000)); // comida para el perro
        pedidoActual.addProducto(new Mascotas("PER2", 10000, 20000)); // más comida para el perro
        pedidoActual.addProducto(new Higiene("GEL", 1500, 1600)); // gel de ducha
        pedidoActual.addProducto(new Drogueria("DET", 2000, 1600)); // detergente lavadora
        pedidoActual.addProducto(new Drogueria("LEJ", 1000, 1000)); // lejía
        for (int indice = 0; indice < 24; indice++) {
            pedidoActual.addProducto(new Fresco("YOG" + indice, 250, 300)); // yogur
        }
        pedidoActual.addProducto(new NoPerecedero("ARR", 1000, 1000)); // arroz
        for (int indice = 0; indice < 5; indice++) {
            pedidoActual.addProducto(new NoPerecedero("PAS" + indice, 1000, 1200)); // pasta
        }
        for (int indice = 0; indice < 6; indice++) {
            pedidoActual.addProducto(new Higiene("JAB" + indice, 125, 100)); // pastillas de jabón
        }
        for (int indice = 0; indice < 3; indice++) {
            pedidoActual.addProducto(new Drogueria("EST" + indice, 50, 200)); // estropajos
        }
        for (int indice = 0; indice < 10; indice++) {
            pedidoActual.addProducto(new NoPerecedero("CAL" + indice, 1000, 1200)); // caldo
        }

        System.out.println("Pedido con productos: " + pedidoActual);


    }

}