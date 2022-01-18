package models;

public class ViajeroModel {
    private String nombre;
    private String apellido;
    private String dia;
    private String mes;
    private String ano;

    public ViajeroModel (String nombre, String apellido, String dia, String mes, String ano){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getAno() {
        return ano;
    }

}
