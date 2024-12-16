package com.mycompany.sc.g2;

import javax.swing.JOptionPane;

/*
CODIGO DE CLASE: SC-202
GRUPO: 02
INTEGRANTES: OSCAR SOLÍS BARRIENTOS, ANTHONY AZOFEIFA RAMÍREZ, ALESSANDRO BOGANTES CALERO
|| PROYECTO FÚTBOL CINCO ||
*/

public class Gestion {

    // || MÉTODOS ||
    // Métodos de gestión para agregar, editar y mostrar elementos del submenu

    public static void MenuGestionJ(){
        int opt;
        
        
        do {
            opt = Integer.parseInt((JOptionPane.showInputDialog("* MENÚ GESTIÓN DE JUGADORES *"
                    + "\n1- Mostrar Jugadores.\n"
                    + "2- Agregar Nuevo Jugador.\n"
                    + "3- Editar Jugador.\n"
                    + "4- Eliminar Jugador.\n"
                    + "5- Salir al Menú Principal.\n")));

            switch (opt) {
                case 1: //Mostrar Jugadores
                    GestionJ.MostrarJugador();
                    break;
                case 2: //Agregar Nuevo Jugador
                    GestionJ.AgregarJugador();
                    break;
                case 3: //Editar Jugador
                    //Gestion.MostrarCliente();
                    break;
                case 4: //Eliminar Jugador
                    //Gestion.SolicitarPedido();

                    break;
                case 5: //Salir
                    JOptionPane.showMessageDialog(null, "Gracias por usar el Menú Gestión de Jugadores.");

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción del Menú No Válida.");
            }

        } while (opt != 5);
        
    }
    
    public static void MenuGestionE(){
        int opt;
        
        
        do {
            opt = Integer.parseInt((JOptionPane.showInputDialog("* MENÚ GESTIÓN DE EQUIPOS *"
                    + "\n1- Mostrar Equipos.\n"
                    + "2- Agregar Nuevo Equipo.\n"
                    + "3- Agregar Jugador a un Equipo.\n"
                    + "4- Eliminar Jugador de un Equipo.\n"
                    + "5- Salir al Menú Principal.\n")));

            switch (opt) {
                case 1: //Mostrar Equipos
                    GestionE.MostrarEquipo();
                    break;
                case 2: //Agregar Nuevo Equipo
                    GestionE.AgregarEquipo();
                    break;
                case 3: //Agregar Jugador a un Equipo
                    GestionE.agregarJugadorAEquipo();
                    break;
                case 4: //Eliminar Jugador de un Equipo
                    //Gestion.SolicitarPedido();

                    break;
                
                case 5: //Salir
                    JOptionPane.showMessageDialog(null, "Gracias por usar el Menú Gestión de Equipos.");

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción del Menú No Válida.");
            }

        } while (opt != 5);
        
    }
    
    public static void SimulacionPartidos(){
        int opt;
        
        
        do {
            opt = Integer.parseInt((JOptionPane.showInputDialog("* MENÚ SIMULACIÓN PARTIDOS *"
                    + "\n1- Selección de Equipos.\n"
                    + "2- Opciones de Salida de Mensajes*.\n"
                    + "3- Configuración de Jugadores en el Partido.\n"
                    + "4- Gestión de Desempate en Penales*.\n"
                    + "5- Resultados Finales de la Simulación.\n"
                    + "6- Salir del Menú.\n")));

            switch (opt) {
                case 1: //Selección de Equipos
                    //Gestion.AgregarCliente();
                    break;
                case 2: //Opciones de Salida de Mensajes
                    //Gestion.EditarCliente();
                    break;
                case 3: //Configuración de Jugadores en el Partido
                    //Gestion.MostrarCliente();
                    break;
                case 4: //Gestión de Desempate en Penales
                    //Gestion.SolicitarPedido();

                    break;
                case 5: //Resultados Finales de la Simulación
                    //Gestion.SolicitarPedido();

                    break;
                case 6: //Salir
                    JOptionPane.showMessageDialog(null, "Gracias por usar el Menú Simulación Partidos.");

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción del Menú No Válida.");
            }

        } while (opt != 6);
    }    
    
    public static void Reportes(){
        int opt;
        
        
        do {
            opt = Integer.parseInt((JOptionPane.showInputDialog("* MENÚ REPORTES *"
                    + "\n1- Tabla Estadísticas de Equipos.\n"
                    + "2- Reporte de Goleadores.\n"
                    + "3- Reporte de Equipos con + Goles a Favor.\n"
                    + "4- Reporte de Resultados del Último Partido.\n"
                    + "5- Posesión del Balón Promedio por Equipo.\n"
                    + "6- Jugador más Destacado.\n"
                    + "7- Salir del Menú.\n")));

            switch (opt) {
                case 1: //Tabla Estadísticas de Equipos
                    //Gestion.AgregarCliente();
                    break;
                case 2: //Reporte de Goleadores
                    //Gestion.EditarCliente();
                    break;
                case 3: //Reporte de Equipos con + Goles a Favor
                    //Gestion.MostrarCliente();
                    break;
                case 4: //Reporte de Resultados del Último Partido
                    //Gestion.SolicitarPedido();

                    break;
                case 5: //Posesión del Balón Promedio por Equipo
                    //Gestion.SolicitarPedido();

                    break;
                case 6: //Jugador más Destacado
                    //Gestion.SolicitarPedido();

                    break;
                case 7: //Salir
                    JOptionPane.showMessageDialog(null, "Gracias por usar el Menú de Reportes.");

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción del Menú No Válida.");
            }

        } while (opt != 7);
    }
        
    
    
    
    
}
