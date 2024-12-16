package com.mycompany.sc.g2;

import javax.swing.JOptionPane;

/*
CODIGO DE CLASE: SC-202
GRUPO: 02
INTEGRANTES: OSCAR SOLÍS BARRIENTOS, ANTHONY AZOFEIFA RAMÍREZ, ALESSANDRO BOGANTES CALERO
|| PROYECTO FÚTBOL CINCO ||


 */
public class GestionJ {
    //Se crea el arreglo estatico y se inicializa
    public static Jugador[] jugadoresLibres = new Jugador[10]; // Lista de jugadores libres
    public static Jugador jugadores[] = new Jugador[70];
    public static Jugador jugadoresEquipoAT[] = new Jugador[5];
    public static Jugador jugadoresEquipoBT[] = new Jugador[5];
    public static Jugador jugadoresEquipoAS[] = new Jugador[5];
    public static Jugador jugadoresEquipoBS[] = new Jugador[5];

    // || MÉTODOS PARA EL SUBMENÚ ||
    //Metodo que va ser llamado por la clase correspondiente para mostrar los jugadores
    //PENDIENTE DE TERMINAR
    public static void MostrarJugador() {
        if (Jugador.cantidadJugador == 0  ) {
            JOptionPane.showMessageDialog(null, "¡No hay jugadores en el Sistema! \nPor favor agregar jugadores ");
            return;
        }else if (Equipo.cantidadEquipos == 0){
            JOptionPane.showMessageDialog(null, "¡No hay equipos en el Sistema! \nPor favor volver al menú de equipos y agregar equipos ");
            return;
        }
        GestionE.seleccionEquipo();
        System.out.println("---Lista de Jugadores---");
        
        
        if (jugadores[0] == null) {
            JOptionPane.showMessageDialog(null, "¡No hay jugadores en el Sistema! ");
            
        }
        for (int i = 0; i < Jugador.cantidadJugador; i++) {
            System.out.println((i+1)+ "-"+ jugadores[i].mostrarDetallesJ(false));
            JOptionPane.showMessageDialog(null, (i+1)+ "-"+ jugadores[i].mostrarDetallesJ(true));
            
        }
        System.out.println();
        
        
        

    }

    //Metodo que va ser llamado por la clase correspondiente para agregar jugadores
    //Metodo Temporal
    public static void AgregarJugador() {

        if (Jugador.cantidadJugador < jugadores.length) {
            int valorBtn = 0;

            valorBtn = JOptionPane.showOptionDialog(null, "Como desea agregar al jugador", "Seleccione", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Agregarlo con equipo", "Agregarlo sin equipo"}, "Agregarlo sin equipo");
            if (Equipo.cantidadEquipos == 0) {
                JOptionPane.showMessageDialog(null, "No hay equipos registrados\nPor favor vuelva al menu principal y agregue equipos");
                return;

            }
            if (valorBtn == 0) {//Agregar con Equipo 

                GestionE.seleccionEquipo();
                if (GestionE.seleccionEquipo() == GestionE.equipos[0]) {//Equipo 1
                    cargarJugadoresLista(jugadoresEquipoAT, Estado.titular);

                }
            } else if (valorBtn == 1) {
                agregarJugadorLibre(jugador);
                
            }

            

        } else {
            JOptionPane.showMessageDialog(null, "Este Sistema solo puede gestionar 70 Jugadores.");
        }

    }

    public static Posicion asignarPosicion() {
        Posicion posicion = null;

        String botonesPosicion[] = {"Delantero", "Mediocampista", "Defensa", "Portero"};
        int botonPosicion = JOptionPane.showOptionDialog(null, "Seleccione una Posición", "Seleccionar Posición", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesPosicion, "Delantero");

        switch (botonPosicion) {
            case 0: //Delantero
                posicion = Posicion.delantero;
                break;
            case 1://Mediocampista
                posicion = Posicion.medioCampista;
                break;

            case 2://Defensa
                posicion = Posicion.defensa;
                break;

            case 3://Portero
                posicion = Posicion.portero;
                break;

        }
        return posicion;
    }
    
    
    private static void agregarJugadorLibre(Jugador jugador) {
        for (int i = 0; i < jugadoresLibres.length; i++) {
            if (jugadoresLibres[i] == null) {
                jugadoresLibres[i] = jugador;
                JOptionPane.showMessageDialog(null, "¡Jugador registrado como libre!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se pueden agregar más jugadores libres.");
    }
     public static void cargarJugadoresLista (Jugador jugadores[], Estado estado){
        
        String nombreJugador = JOptionPane.showInputDialog("Ingrese el nombre del Jugador #" + (Jugador.cantidadJugador + 1) + ": ");

                    jugadores[Jugador.cantidadJugador] = new Jugador(nombreJugador, Estado.titular, GestionJ.asignarPosicion());
                    JOptionPane.showMessageDialog(null, "¡Jugador agregado con éxito!");
        
    }
    
    
    
    
}



// || ATRIBUTOS ||
// || GETS AND SETS ||

