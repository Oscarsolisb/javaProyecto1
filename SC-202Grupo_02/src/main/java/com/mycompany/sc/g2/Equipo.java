package com.mycompany.sc.g2;

import java.util.Random;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

/*
CODIGO DE CLASE: SC-202
GRUPO: 02
INTEGRANTES: OSCAR SOLÍS BARRIENTOS, ANTHONY AZOFEIFA RAMÍREZ, ALESSANDRO BOGANTES CALERO
|| PROYECTO FÚTBOL CINCO ||


*/

public class Equipo {
    // || ATRIBUTOS ||
    private int idEquipo;
    private String nombreEquipo;
    GestionJ jugadores[]; //cambiar por listado
    private int partidosJugados;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    public  int golesFavor;
    public int golesContra;
    public int posesionBalon;
    public static int consecutivoIdEquipo = 100;
    public static int cantidadEquipos = 0;
    Random random = new Random();
    private boolean disponible;
    private Jugador titulares[]; 
    private Jugador suplentes[];
    

    
    
    
    
    
    
    
    
    // || CONSTRUCTORES ||
    
    public Equipo (String nombreEquipo){
        this.idEquipo = consecutivoIdEquipo;
        this.nombreEquipo = nombreEquipo;
        this.disponible = true;
        this.titulares = new Jugador[5];
        this.suplentes = new Jugador[2];
        this.partidosJugados = partidosJugados;
        this.partidosGanados = partidosGanados;
        this.partidosPerdidos = partidosPerdidos;
        this.partidosEmpatados = partidosEmpatados;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.posesionBalon = posesionBalon;
        consecutivoIdEquipo++;
        cantidadEquipos++;
    }
    
    
    
    
    
    
    
    
    
    // || METODOS ||
     
    
    
    
    public String mostrarDetallesE (boolean conSaltoLinea){
        if (conSaltoLinea) {
            return "DATOS DEL Equipo #"+getIdEquipo()+
                    "\nNombre: "+getNombreEquipo()+
                    
                    "\nPartidos Jugados: "+getPartidosJugados()+
                    "\nPartidos Ganados: "+ getPartidosGanados()+
                    "\nPartidos Perdidos "+ getPartidosPerdidos()+
                    "\nPartidos Empatados: " + getPartidosEmpatados()+
                    "\nGoles a Favor: "+ golesFavor+
                    "\nGoles en Contra: "+ golesContra+
                    "\nPosesión del Balón: "+ posesionBalon;
            
            
            
        }
        return "Equipo #: "+getIdEquipo()+ ", Nombre: "+getNombreEquipo()+ 
                ", Partidos Jugados: "+getPartidosJugados()+ ", Partidos Ganados: "+ getPartidosGanados()+", Partidos Perdidos "+ getPartidosPerdidos()+
                ", Partidos Empatados: " + getPartidosEmpatados()+", Goles a Favor: "+ golesFavor+", Goles en Contra: "+ golesContra+", Posesión del Balón: "+ posesionBalon;
    }
    
    
    
    
   public boolean agregarJugador(Jugador jugador) {
        if (!disponible) {
            return false; // El equipo no está disponible
        }

        // Primero se agregan los titulares
        for (int i = 0; i < titulares.length; i++) {
            if (titulares[i] == null) {
                titulares[i] = jugador;
                if (i == 4) {
                    disponible = false;  // El equipo deja de estar disponible cuando tiene 5 titulares
                }
                return true;
            }
        }

        // Luego, si no hay espacio en titulares, se agregan a los suplentes
        for (int i = 0; i < suplentes.length; i++) {
            if (suplentes[i] == null) {
                suplentes[i] = jugador;
                return true;
            }
        }
        return false; // El equipo está lleno
    }
    
    // Verificar si el equipo está disponible (menos de 7 jugadores)
    public boolean estaDisponible() {
        return disponible;
    }
    
    public void mostrarJugadores() {
        
        mostrarJugadoresEquipo();
    }
    
    public  void mostrarJugadoresEquipo() {
        System.out.println(" Titulares:");
        for (int i = 0; i < titulares.length; i++) {
            if (titulares[i] != null) {
                System.out.println(titulares[i].getNombreJugador());
            }
        }
        System.out.println("\n Suplentes:");
        for (int i = 0; i < suplentes.length; i++) {
            if (suplentes[i] != null) {
                System.out.println(suplentes[i].getNombreJugador());
            }
        }
        
    }
    
    // || GETS AND SETS ||

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

 
    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

   
    
    
    
    
}
