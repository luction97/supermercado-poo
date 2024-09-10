# Gestión de Pedidos para Supermercado

## Descripción del Ejercicio
Este proyecto es una aplicación para gestionar el embolsado de productos de los pedidos online del supermercado. Los productos deben ser distribuidos entre bolsas y cajas, respetando las restricciones de volumen, peso y categoría.

## Requisitos
La aplicación debe gestionar los productos y la distribución en bolsas y cajas siguiendo las reglas especificadas:

## Objetivo
El objetivo del ejercicio es implementar las clases y métodos necesarios para gestionar los contenedores y productos, respetando las restricciones de peso, volumen y categoría.

1. **Tipos de contenedores**:
    - Las **cajas** son rectangulares y pueden aguantar cualquier peso, pero tienen un volumen limitado por sus dimensiones.
    - Las **bolsas** tienen una resistencia máxima en cuanto a peso y también un volumen limitado.

2. **Categorías de productos**:
    - **Alimentación**: Subdividida en:
        - Congelados
        - Frescos
        - No Perecederos
    - **Higiene**
    - **Droguería**
    - **Mascotas**

3. **Reglas de distribución**:
    - Los productos de **alimentación** no pueden mezclarse con los de **otras categorías**.
    - Los productos de **higiene** no se pueden mezclar con los de **alimentación**.
    - Los productos de **droguería** no se pueden mezclar ni con los de **alimentación** ni con los de **mascotas**.

4. **Consideraciones**:
    - En esta primera versión no es necesario optimizar la distribución, ni tener en cuenta las temperaturas ni las caducidades.