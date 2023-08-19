package Pkg;

import java.util.List;
import java.util.ArrayList;

public class ArrayListSample {

    public void ejemplo1(){
        List<String> takList = new ArrayList<>();
        takList.add("Sacar al perro");
        takList.add("ir de compras");
        takList.add("hacer la cama");
        takList.add("ir a votar");


        //iterar
        //iteracion
        int pos = 0;
        for (String tarea : takList) {
            System.out.println(pos+ "Tarea: "+tarea);
            pos++;
        }

        //String primerElemento = takList.get(0);
        //System.out.println("Primer Elemento= "+primerElemento);

        //System.out.println("Elimina pos 0: ");
        //takList.remove(0);
        //primerElemento = takList.get(0);
        //System.out.println("Primer Elemento= "+primerElemento);
    }

    public void ejemplo2() {
        List<String> listaEnteros = new ArrayList<>();
        listaEnteros.add("1000");
        listaEnteros.add("2000");
        listaEnteros.add("3000");
        listaEnteros.add("4000");


        //iterar
        //iteracion
        int pos = 0;
        for (String tarea : listaEnteros) {
            System.out.println(pos + "Cantidad: " + tarea);
            pos++;
        }
        //suma
        int suma = 0;
        for (String tarea : listaEnteros) {
            suma = suma + Integer.parseInt(tarea);
        }

    }

    public void listaTareas(){

        List<ClsTaskList> tl = new ArrayList<>();
        ClsTaskList tarea = new ClsTaskList();
        tarea.setTaskName("ir a votar");
        tarea.setTaskDescription("escuela, mesa 5");
        tarea.setDone(false);
        tl.add(tarea);

        tarea.setTaskName("Sacar al chucho");
        tarea.setTaskDescription("Llevar a firulais al parque");
        tarea.setDone(false);
        tl.add(tarea);

        tarea.setTaskName("hacer la cama");
        tarea.setTaskDescription("mi mamá me regaña");
        tarea.setDone(false);
        tl.add(tarea);

        for (ClsTaskList t : tl) {
            System.out.println("Tarea: "+t.getTaskName());
            System.out.println("Descripcion: "+t.getTaskDescription());
            System.out.println("Estado: "+t.isDone());
        }

    }





}


