package com.example.springdemo.rest;
import com.example.springdemo.data.Dao.PatenteInformacionDao;
import com.example.springdemo.logic.PatenteInformacion;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/patenteInformacion")
public class PatenteInformacionRest {

    @PostMapping
    public void create(@RequestBody PatenteInformacion p) {

        try {
            PatenteInformacionDao info = new PatenteInformacionDao();
            info.create(p.getIdPatenteInformacion(),
                    p.getPatente().getIdPatente(),
                    p.getNombreComercial(),
                    p.getTipo(),
                    p.getDescripcion(),
                    p.getSitioWeb(),
                    p.getEmail(),
                    p.getTelefono1(),
                    p.getTelefono2(),
                    p.getDireccionComercial(),
                    p.getUrlTwitter(),
                    p.getUrlFacebook(),
                    p.getUrlWhatsapp(),
                    p.getUrlInstagram(),
                    p.getCoordenadas());
            
        } catch (Exception ex) {
            //throw new NotAcceptableException();
            ex.printStackTrace();
        }
    }
}
