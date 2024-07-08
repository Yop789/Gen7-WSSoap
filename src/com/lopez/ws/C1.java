package com.lopez.ws;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class C1 {

    @WebMethod
    public int sumar(int a, int b) {
        return a + b;
    }

    @WebMethod
    public int restar(int a, int b) {
        return a - b;
    }

    @WebMethod
    public Productos get() {
        Productos p = new Productos();
        p.setNombre("");
        p.setDescripcion("Pepino");
        p.setCapacidad(1f);
        p.setCodigo("P1-1231");
        p.setDiaponible(true);
        p.setPrecio(1d);
        p.setMedida("1");
        p.setMarca("1");
        return p;
    }

    @WebMethod
    public Double getTotal(ArrayList<Productos> lista) {
        Double total = 0d;
        for (int i = 0; i < lista.size(); i++) {
            total = total + lista.get(i).getPrecio();
        }
        return total;
    }

}
