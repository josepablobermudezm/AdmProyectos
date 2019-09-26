/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.util;

import proyectos.model.AdministradorDto;
import proyectos.model.ProyectoDto;
import proyectos.model.ActividadesDto;
import proyectos.model.SeguimientoDto;

/**
 *
 * @author Jose Pablo Bermudez
 */
public class DtoCasting {
    
    //webservice es la carpeta de las clases que se generan solas
    //El proposito de esta clase de hacer como una copia del objeto
    public webservice.AdministradorDto castAdmin(AdministradorDto admin){
        webservice.AdministradorDto administrador = new webservice.AdministradorDto();
        administrador.setAdnCedula(admin.getAdnCedula());
        administrador.setAdnContrasena(admin.getAdnContrasena());
        administrador.setAdnCorreo(admin.getAdnCorreo());
        administrador.setAdnEstado(admin.getAdnEstado());
        administrador.setAdnId(admin.getAdnId());
        administrador.setAdnNombre(admin.getAdnNombre());
        administrador.setAdnPapellido(admin.getAdnPapellido());
        administrador.setAdnSapellido(admin.getAdnSapellido());
        administrador.setAdnUsuario(admin.getAdnUsuario());
        administrador.setAdnVersion((admin.getAdnVersion()!=null)?admin.getAdnVersion()+1:1);        
        return administrador;
    }
    
    
    
    
    
    public webservice.ActividadesDto castAct(ActividadesDto actividadDto){
        webservice.ActividadesDto actividad = new webservice.ActividadesDto();
        
        actividad.setDescripcion(actividadDto.getActDescripcion());
        actividad.setEncargado(actividadDto.getActEncargado());
        actividad.setEstado(actividadDto.getActEstado().equals("Planificada")?"P":
        actividadDto.getActEstado().equals("En Curso")?"C":actividadDto.getActEstado().equals("Postergada")?"M":"F");
        actividad.setFinalEsperado(actividadDto.getActFechafinal());
        actividad.setFinalReal(actividadDto.getActFechafinreal());
        actividad.setInicioEsperado(actividadDto.getActFechainicio());
        actividad.setInicioReal(actividadDto.getActFechainireal());
        actividad.setId(actividadDto.getActId());
        actividad.setOrden(actividadDto.getActNumorden());
        actividad.setProyecto(new DtoCasting().castPro((ProyectoDto)AppContext.getInstance().get("ProyectoDto")));
        actividad.setVersion((actividadDto.getActVersion()!=null)?actividadDto.getActVersion()+1:1);
        return actividad;
    }
    
    
    
    
    public webservice.SeguimientoDto castSeg(SeguimientoDto seg){
        webservice.SeguimientoDto seguimiento = new webservice.SeguimientoDto();
        seguimiento.setSegAvance(seg.getSegAvance());
        seguimiento.setSegFecha(seg.getSegFecha());
        seguimiento.setSegProyecto(new DtoCasting().castPro((ProyectoDto)AppContext.getInstance().get("ProyectoDto")));
        seguimiento.setSegVersion((seg.getSegVersion()!=null)?seg.getSegVersion()+1:1);
        seguimiento.setSegId(seg.getSegId());
        return seguimiento;
    }
    
    
    
    
    
    public webservice.ProyectoDto castPro(ProyectoDto pro){
        webservice.ProyectoDto proyectoDto = new webservice.ProyectoDto();
        proyectoDto.setProCorreopatrocinador(pro.getProCorreopatrocinador());
        proyectoDto.setProCorreotecnico(pro.getProCorreotecnico());
        proyectoDto.setProCorreousuario(pro.getProCorreousuario());
        proyectoDto.setProFechafinal(pro.getProFechafinal().toString());
        proyectoDto.setProFechafinreal(pro.getProFechafinreal().toString());
        proyectoDto.setProFechainicio(pro.getProFechainicio().toString());
        proyectoDto.setProFechainireal(pro.getProFechainireal().toString());
        proyectoDto.setProId(pro.getProId());
        proyectoDto.setProLidertecnico(pro.getProLidertecnico());
        proyectoDto.setProLiderusuario(pro.getProLiderusuario());
        proyectoDto.setProNombre(pro.getProNombre());
        proyectoDto.setProPatrocinador(pro.getProPatrocinador());
        proyectoDto.setProEstado(pro.getProEstado().equals("Planificado")?"P":
        pro.getProEstado().equals("En Curso")?"C":pro.getProEstado().equals("Finalizado")?"F":"S");
        proyectoDto.setProVersion((pro.getProVersion()!=null)?pro.getProVersion()+ 1:1);
        proyectoDto.setProAdmin(new DtoCasting().castAdmin((AdministradorDto)AppContext.getInstance().get("AdministradorDto")));
       
        return proyectoDto;
    }
    
}
