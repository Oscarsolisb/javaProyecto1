package com.mycompany.sc.g2;

import static com.mycompany.sc.g2.GestionJ.jugadores;
import javax.swing.JOptionPane;

/*
CODIGO DE CLASE: SC-202
GRUPO: 02
INTEGRANTES: OSCAR SOLÍS BARRIENTOS, ANTHONY AZOFEIFA RAMÍREZ, ALESSANDRO BOGANTES CALERO
|| PROYECTO FÚTBOL CINCO ||


 */
public class GestionE {

    // || ATRIBUTOS ||
    
    public static Equipo equipos[] = new Equipo[10];

    public static void MostrarEquipo() {
        System.out.println("---Lista de Equipos---");
        
        
        if (equipos[0] == null) {
            JOptionPane.showMessageDialog(null, "¡No hay equipos en el Sistema! ");
            
        }
        for (int i = 0; i < Equipo.cantidadEquipos; i++) {
            System.out.println((i+1)+ "-"+ equipos[i].mostrarDetallesE(false));
            System.out.println("[Jugadores]");
            equipos[i].mostrarJugadores();
            JOptionPane.showMessageDialog(null, (i+1)+ "-"+ equipos[i].mostrarDetallesE(true));
            
        }
    }

    public static void AgregarEquipo() {

        if (Equipo.cantidadEquipos < equipos.length) {
            
                
                    String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del Equipo #" + (Equipo.cantidadEquipos + 1) + ": ");
                    equipos[Equipo.cantidadEquipos] = new Equipo(nombreEquipo);
                    JOptionPane.showMessageDialog(null, "¡Equipo agregado con éxito!");
                
            
        }else{
            JOptionPane.showMessageDialog(null, "Este Sistema solo puede gestionar 10 Equipos.");
        }
        
        
        
        
        
    }

    public static Equipo seleccionEquipo() {
        if (Equipo.cantidadEquipos == 0) {
            JOptionPane.showMessageDialog(null, "No hay equipos registrados\nPor favor vuelva al menu principal y agregue equipos");
            return null;
            
        }
        String[] opciones = new String[Equipo.cantidadEquipos];
        for (int i = 0; i < Equipo.cantidadEquipos; i++) {
            opciones[i] = equipos[i].getNombreEquipo();
        }

        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione un equipo", "Seleccionar Equipo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (seleccion == -1) {
            return null;  // Si se cancela
        }
        return equipos[seleccion];  // Retorna el equipo seleccionado
    
    }
   
    public static void agregarJugadorAEquipo() {
        // Mostrar equipos disponibles
        boolean equipoDisponible = false;
        String equiposDisponibles = "Equipos disponibles:\n";
        for (int i = 0; i < equipos.length; i++) {
            if (equipos[i] != null && equipos[i].estaDisponible()) {
                equiposDisponibles += (i + 1) + "- " + equipos[i].getNombreEquipo() + "\n";
                equipoDisponible = true;
            }
        }

        if (!equipoDisponible) {
            JOptionPane.showMessageDialog(null, "No hay equipos disponibles.");
            return;
        }

        int seleccion = Integer.parseInt(JOptionPane.showInputDialog(equiposDisponibles + "Seleccione un equipo para agregar al jugador:"));
        Equipo equipoSeleccionado = equipos[seleccion - 1];

        // Elegir jugador
        String jugadoresLibresDisponibles = "Jugadores libres:\n";
        for (Jugador jugador : GestionJ.jugadoresLibres) {
            if (jugador != null) {
                jugadoresLibresDisponibles += jugador.getIdJugador() + "- " + jugador.getNombreJugador()+ "\n";
            }
        }

        if (jugadoresLibresDisponibles.equals("Jugadores libres:\n")) {
            JOptionPane.showMessageDialog(null, "No hay jugadores libres disponibles.");
            return;
        }

        int idJugadorSeleccionado = Integer.parseInt(JOptionPane.showInputDialog(jugadoresLibresDisponibles + "Seleccione el ID del jugador:"));
        Jugador jugadorSeleccionado = null;

        for (int i = 0; i < GestionJ.jugadoresLibres.length; i++) {
            if (GestionJ.jugadoresLibres[i] != null && GestionJ.jugadoresLibres[i].getIdJugador() == idJugadorSeleccionado) {
                jugadorSeleccionado = GestionJ.jugadoresLibres[i];
                GestionJ.jugadoresLibres[i] = null; // Eliminar de libres
                break;
            }
        }

        if (jugadorSeleccionado == null) {
            JOptionPane.showMessageDialog(null, "Jugador no encontrado.");
            return;
        }

        if (equipoSeleccionado.agregarJugador(jugadorSeleccionado)) {
            JOptionPane.showMessageDialog(null, "Jugador agregado al equipo " + equipoSeleccionado.getNombreEquipo());
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el jugador.");
        }
    }

    // || CONSTRUCTORES ||
    // || METODOS ||
    // || GETS AND SETS ||
    

   
   

}
