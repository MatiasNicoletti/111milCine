
package cine;

import java.util.Date;

public class HorarioFuncion {
    private int diaSemana;
    private Float duracionIntervalo;
    private Float duracionPublicidad;
    private boolean trasnoche;
    private Date horaPrimeraFuncion;
    private Date horaUltimaFuncion;

    public HorarioFuncion() {
    }

    public HorarioFuncion(int diaSemana, Float duracionIntervalo, Float duracionPublicidad, boolean trasnoche, Date horaPrimeraFuncion, Date horaUltimaFuncion) {
        this.diaSemana = diaSemana;
        this.duracionIntervalo = duracionIntervalo;
        this.duracionPublicidad = duracionPublicidad;
        this.trasnoche = trasnoche;
        this.horaPrimeraFuncion = horaPrimeraFuncion;
        this.horaUltimaFuncion = horaUltimaFuncion;
    }

    
    
    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Float getDuracionIntervalo() {
        return duracionIntervalo;
    }

    public void setDuracionIntervalo(Float duracionIntervalo) {
        this.duracionIntervalo = duracionIntervalo;
    }

    public Float getDuracionPublicidad() {
        return duracionPublicidad;
    }

    public void setDuracionPublicidad(Float duracionPublicidad) {
        this.duracionPublicidad = duracionPublicidad;
    }

    public boolean isTrasnoche() {
        return trasnoche;
    }

    public void setTrasnoche(boolean trasnoche) {
        this.trasnoche = trasnoche;
    }

    public Date getHoraPrimeraFuncion() {
        return horaPrimeraFuncion;
    }

    public void setHoraPrimeraFuncion(Date horaPrimeraFuncion) {
        this.horaPrimeraFuncion = horaPrimeraFuncion;
    }

    public Date getHoraUltimaFuncion() {
        return horaUltimaFuncion;
    }

    public void setHoraUltimaFuncion(Date horaUltimaFuncion) {
        this.horaUltimaFuncion = horaUltimaFuncion;
    }
    
    public String mostarHorarioFuncion(){
        return " " + getHoraPrimeraFuncion() + getHoraUltimaFuncion();
    }
}
