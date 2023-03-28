package clases;

import java.util.HashMap;

public class ServiceInfo {
    private HashMap<String, Service> servicios;

    public ServiceInfo() {
        servicios = new HashMap<String, Service>();
    }

    public void agregarServicio(String nombreUsuario, Service servicio) {
        servicios.put(nombreUsuario, servicio);
    }

    public Service obtenerServicio(String nombreUsuario) {
        return servicios.get(nombreUsuario);
    }
}