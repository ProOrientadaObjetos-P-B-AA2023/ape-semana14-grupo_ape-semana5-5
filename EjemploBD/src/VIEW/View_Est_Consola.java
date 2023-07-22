package VIEW;

import CONTROLER.ConexionDB_Est;
import MODEL.Estudiante;

import javax.swing.*;
import java.util.ArrayList;

public class View_Est_Consola {
    public static void main(String[] args) {
        ConexionDB_Est obj= new ConexionDB_Est();
        System.out.println(obj.insertarEstudiante(new Estudiante("Mateo","110459937","ikestrella",6)));
        ArrayList<Estudiante> listaEst=obj.getListaEstudiantes();
        for(Estudiante est: listaEst){
            System.out.println(est);
        }
    }
}
