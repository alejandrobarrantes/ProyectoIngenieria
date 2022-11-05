package com.example.springdemo.pruebasjinge;

import com.example.springdemo.data.Dao.VerificacionDao;
import com.example.springdemo.logic.Verificacion;


/**
 *
 * @author adsc9
 */
public class PruebasJInge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Patente p=new Patente(5, 5, "Sarchi", "4567");
        Verificacion verificacion=new Verificacion(1,"Ale", "222", "22", "22", "22", "22", "22");

        try {
            //errr
            VerificacionDao verificacionDao = new VerificacionDao();
         
            try {
                verificacionDao.create(
                        verificacion.getNombre(), verificacion.getCedula(),
                        verificacion.getCorreo(), verificacion.getTelefono(), 
                        verificacion.getNombreEmpresa(), 
                        verificacion.getTelefonoEmpresa(), 
                        verificacion.getDireccionEmpresa());
            } catch (Exception e) {
                e.printStackTrace();
            }

         
        } catch (Exception ex) {

        }
        
    }
    
}
