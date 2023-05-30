package org.example;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

public class ManejadorDeEmpleados {
    public static void guardarEmpleadosTxt(List<Empleado> empleados) {
        //necesito guardar empleados no usando ObjectOutStream
        //Escribo en un archivo de salida
        FileOutputStream fos = null;
        try {
            //instanciar el objeto fos
            fos = new FileOutputStream("empleados.txt");
            //buffer
            //Buffer  guardo "x" cantidad de cosas y mando. + eficiente un morral con cartas, almacena y envia.
            //envia pero en paquetes
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            for (Empleado empleado : empleados) {
                //voy a preparar la linea para enviar, seria como convertirlo a un to string y enviarlo al txt
                String lineaAEnviar = empleado.getNombre() + ";" + empleado.getApellido() + ";"
                        + empleado.getLegajo() + ";" + empleado.getSueldo() + "\n";
                //toma esa cadena y empeza a enviar
                bos.write(lineaAEnviar.getBytes());
            }
            bos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
