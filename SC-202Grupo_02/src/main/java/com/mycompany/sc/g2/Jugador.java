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
    private String equipoPertenencia;
    private Estado estado;
    public static int consecutivoGoles = 0;
    public static int consecutivoAcciones = 0;
    public static int consecutivoID = 10;
    public static int cantidadJugador = 0;

    //cuadro de presentar equipos disponibles tambien boton sin equipo o ningun 
    // no se pide si es titular
    //relacion jugador y equipo
    //gestion de equipos que solo muestre los jugadores libres
    // || CONSTRUCTORES ||
    //se crea el constructor de manera estatico para definir los parametros una vez creado la instancia 
    public Jugador(String nombreJugador, Estado estado, Posicion posicion, String equipoPertenencia) {
        this.idJugador = consecutivoID;
        this.nombreJugador = nombreJugador;
        this.estado = Estado.libre;
        this.equipoPertenencia = equipoPertenencia;
        this.posicion = posicion;
        this.golesAnotados = 0;
        this.accionesTotales = 0;
        consecutivoID++;
        cantidadJugador++;

    }
    
    public Jugador(String nombreJugador, Estado estado, Posicion posicion) {
        this.idJugador = consecutivoID;
        this.nombreJugador = nombreJugador;
        this.estado = Estado.libre;
        this.equipoPertenencia = equipoPertenencia;
        this.posicion = posicion;
        this.golesAnotados = 0;
        this.accionesTotales = 0;
        consecutivoID++;
        cantidadJugador++;

    }

    // || METODOS ||
    // Metodo para ahorrar un proceso de escritura de código futuro para poder ser utilizado llamando al metodo
    public String mostrarDetallesJ(boolean conSaltoLinea) {
        if (conSaltoLinea) {
            return "DATOS DEL JUGADOR #" + getIdJugador()
                    + "\nNombre: " + getNombreJugador()
                    + "\nEquipo: " + getEquipoPertenencia()
                    + "\nPosicion: " + getPosicion()
                    + "\nEstado: " + getEstado()
                    + "\nGoles Anotados: " + getGolesAnotados();

        }
        return "ID #: " + getIdJugador() + ", Nombre: " + getNombreJugador() + ", Equipo: " + getEquipoPertenencia()
                + ", Posición: " + getPosicion() + ", Estado: " + getEstado() + ", Goles Anotados: " + getGolesAnotados();
    }

    //Metodo para ahorrar un proceso de codigo futuro,funcion: pedirle al usuario que escoja la posicion
    //Metodo para ahorrar un proceso de codigo futuro,funcion: pedirle al usuario que escoja el estado
    public Estado asignarEstado() {
        String botonesEstado[] = {"Titular", "Suplente", "Libre"};
        int botonEstado = JOptionPane.showOptionDialog(null, "Seleccione un Estado para el Jugador.", "Seleccionar Estado", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesEstado, "Libre");

        switch (botonEstado) {
            case 0: //Titular
                setEstado(Estado.titular);
                break;
            case 1://Suplente
                setEstado(Estado.suplente);
                break;

            case 2://Libre
                setEstado(Estado.libre);
                break;
        }
        return getEstado();

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

    public String getEquipoPertenencia() {
        return equipoPertenencia;
    }

    public void setEquipoPertenencia(String equipoPertenencia) {
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
