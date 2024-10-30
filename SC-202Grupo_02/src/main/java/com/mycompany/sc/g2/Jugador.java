package com.mycompany.sc.g2;

import javax.swing.JOptionPane;

/*
CODIGO DE CLASE: SC-202
GRUPO: 02
INTEGRANTES: OSCAR SOLÍS BARRIENTOS, ANTHONY AZOFEIFA RAMÍREZ, ALESSANDRO BOGANTES CALERO
|| PROYECTO FÚTBOL CINCO ||


*/

public class Jugador {
    // || ATRIBUTOS ||
    private int idJugador;
    private int golesAnotados;
    private int accionesTotales;
    private String nombreJugador;
    private Posicion posicion;
    private Equipo equipoPertenencia;
    private Estado estado;
    public static int consecutivoGoles = 0;
    public static int consecutivoAcciones = 0;
    public static int consecutivoID = 10;
    public static int cantidadJugador = 0;
    
    
    
    
    
    
    
    
    
    
    // || CONSTRUCTORES ||
    
    //String nombre, String correo, String direccion
    public Jugador (String nombreJugador, Posicion posicion, Equipo equipoPertenencia, Estado estado){
        this.idJugador = consecutivoID;
        this.nombreJugador = nombreJugador;
        this.posicion = asignarPosicion();
        this.equipoPertenencia = equipoPertenencia;
        this.estado = estado;
        this.golesAnotados = consecutivoGoles;
        this.accionesTotales = consecutivoAcciones;
        consecutivoID++;
        cantidadJugador++;
        
    }
    
    
    
    
    
    
    
    
    
    // || METODOS ||
    private void mostrarDetalles (){
        JOptionPane.showMessageDialog(null, "DATOS DEL JUGADOR: " + getIdJugador() +
                "\nNombre: " + getNombreJugador() + "\nPosición: " + getPosicion() + "\nEquipo de Pertenencia: " 
                + getEquipoPertenencia()+ "\nEstado: " + getEstado() + "\nGoles Anotados: " + golesAnotados);
    }
    
    public Estado estadoJugador (){
        return null;
    }
    
    
    
    public Posicion asignarPosicion (){
        String botonesPosicion[] = {"Delantero", "Mediocampista", "Defensa", "Portero"};
        int botonPosicion = JOptionPane.showOptionDialog(null, "Seleccione una Posición", "Seleccionar Posición", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesPosicion, "Delantero");

        switch (botonPosicion) {
            case 0: //Delantero
                setPosicion(Posicion.delantero);
                break;
            case 1://Mediocampista
                setPosicion(Posicion.medioCampista);
                break;
                
            case 2://Defensa
                setPosicion(Posicion.defensa);
                break;
                
            case 3://Portero
                setPosicion(Posicion.portero);
                break;
                    
        }
        return getPosicion();
    }
    // || GETS AND SETS ||
    
    public int getIdJugador() {
        return idJugador;
    }

    
    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipoPertenencia() {
        return equipoPertenencia;
    }

    public void setEquipoPertenencia(Equipo equipoPertenencia) {
        this.equipoPertenencia = equipoPertenencia;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    public int getAccionesTotales() {
        return accionesTotales;
    }

    public void setAccionesTotales(int accionesTotales) {
        this.accionesTotales = accionesTotales;
    }
    
   
    
    
    
}