/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.app to edit this template
 */
package rest;

import data.Dao.VerificacionDao;
import logic.Verificacion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dell
 */


@RestController
@RequestMapping("api/verificacion")
public class Verificaciones {

    @PostMapping
    public ResponseEntity<String> insertar(@RequestBody Verificacion verificacion) throws Exception {
            VerificacionDao verificacionDao=new VerificacionDao();
            try {

                verificacionDao.create(
                        verificacion.getNombre(), verificacion.getCedula(),
                        verificacion.getCorreo(), verificacion.getTelefono(), 
                        verificacion.getNombreEmpresa(), 
                        verificacion.getTelefonoEmpresa(), 
                        verificacion.getDireccionEmpresa());
                
                return ResponseEntity.ok(null);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
    }
}
