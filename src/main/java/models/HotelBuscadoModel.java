package models;

public class HotelBuscadoModel {

    private String destino;
    private String checkIn;
    private String checkOut;

    public HotelBuscadoModel(String destino, String checkIn, String checkOut) {
        this.destino=destino;
        this.checkIn=checkIn;
        this.checkOut=checkOut;
    }

    public String getDestino() {
        return destino;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }
}
