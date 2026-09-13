package cr.ac.una.pruebas_java_ii.service;

import java.util.logging.Level ;
import java.util.logging.Logger;

import cr.ac.una.pruebas_java_ii.model.MarkDTO;
import cr.ac.una.pruebas_java_ii.model.TransportHelper;
import cr.ac.una.pruebas_java_ii.util.Respuesta;
import cr.ac.una.t_marks.webservice.TMarksWS_Service;
import cr.ac.una.t_marks.webservice.Wrapper;

/**
 *
 * @author takkasama
 */
public class MarkService {
    private static final Logger LOG = Logger.getLogger(EmployeeService.class.getName());

    private TMarksWS_Service markservice;


    public void initService(){
        if(markservice == null){
            markservice = new TMarksWS_Service();
        }
    }
    
    public Respuesta getMark(Long id){
        initService();
        
        try{
            Wrapper wrapper = markservice.getTMarksWSPort().getMark(id);
            
            if(!wrapper.isState())
                return new Respuesta(false, wrapper.getMessage(), wrapper.getInternalMessage());
            
            return new Respuesta(true, "" , "" , "mark",
            TransportHelper.transportMarkDTO(wrapper.getMark()));
                
        }catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error consultando el servicio web", ex);
            return new Respuesta(false, "No se pudo conecctar con el servidor", "getMark" + ex.getMessage());
        }
        
    }
    
    public Respuesta saveMark(MarkDTO markDTO){
        try{
            initService();
            
            Wrapper wrapper = markservice.getTMarksWSPort().saveMark(TransportHelper.transportMarkDTOWS(markDTO));
            if(!wrapper.isState())
                return new Respuesta(false, wrapper.getMessage(), wrapper.getInternalMessage());
            
            return new Respuesta(true, "", "", "Mark", 
                    TransportHelper.transportMarkDTO(wrapper.getMark()));
            
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error consultando el servicio web", ex);
            return new Respuesta(false, "No se pudo conecctar con el servidor", "saveMark" + ex.getMessage());
        }
        
    }

    
    public Respuesta deleteMark(Long id){
        try{
            initService();
            
            Wrapper wrapper = markservice.getTMarksWSPort().deleteMark(id);
             if(!wrapper.isState())   
                return new Respuesta(false, wrapper.getMessage(), wrapper.getInternalMessage());
            
             return new Respuesta(true, "", "");
        }catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error consultando el servicio web", ex);
            return new Respuesta(false, "No se pudo conecctar con el servidor", "deleteMark" + ex.getMessage());
        }
    }
    


    
}
