package models;

public class EscogerTaxisAeropertoModel {

    private String lugarRecogida;
    private String destino;
    private String fecha;
    private String hora;
    private String pasajeros;

    public EscogerTaxisAeropertoModel(String lugarRecogida, String destino, String fecha, String hora, String pasajeros) {
        this.lugarRecogida = lugarRecogida;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.pasajeros = pasajeros;
    }


    public String getLugarRecogida() {
        return lugarRecogida;
    }

    public String getDestino() {
        return destino;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getPasajeros() {
        return pasajeros;
    }

}
