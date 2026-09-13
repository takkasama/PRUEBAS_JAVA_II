package cr.ac.una.pruebas_java_ii.service;

import cr.ac.una.pruebas_java_ii.model.RegisterDTO;
import cr.ac.una.pruebas_java_ii.model.TransportHelper;
import cr.ac.una.pruebas_java_ii.util.Respuesta;
import cr.ac.una.t_marks.webservice.TMarksWS_Service;
import cr.ac.una.t_marks.webservice.Wrapper;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author takkasama
 */
public class RegisterService {

    private final static Logger LOG = Logger.getLogger(RegisterService.class.getName()); 
    
    private TMarksWS_Service registerService;
    
    
    private void initService(){ 
        if(this.registerService == null)
            this.registerService = new TMarksWS_Service();
    }

    
    public Respuesta getRegister(Long id){
       
        initService();
        
        try{
            Wrapper wrapper = registerService.getTMarksWSPort().getRegister(id);
            
            
            if(!wrapper.isState())
                return new Respuesta(false,wrapper.getMessage(), wrapper.getInternalMessage());
            
            return new Respuesta(true, "" , "" ,"Register", 
                    TransportHelper.transportRegisterDTO(wrapper.getRegister()));            
            
        }catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error consultando el servicio web", ex);
            return new Respuesta(false, "No se pudo conecctar con el servidor", "getRegister" + ex.getMessage());
        }
        
    }
    
    
    
    public Respuesta saveRegister(RegisterDTO registerDTO){
        initService();
        try{
            
            Wrapper wrapper = registerService.getTMarksWSPort().
                    saveRegister(TransportHelper.transportRegisterDTOWS(registerDTO));
            
            if(!wrapper.isState())
                return new Respuesta(false, wrapper.getMessage(), wrapper.getInternalMessage());
         
            return new Respuesta(true, "","","Register", 
                    TransportHelper.transportRegisterDTO(wrapper.getRegister()));            
            
                
        }catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error consultando el servicio web", ex);
            return new Respuesta(false, "No se pudo conecctar con el servidor", "saveRegister" + ex.getMessage());
        }
        
    }


    public Respuesta deleteRegister(Long id){
        initService();
        try{
            Wrapper wrapper = registerService.getTMarksWSPort().deleteRegister(id);
            
            if(!wrapper.isState())
                return new Respuesta(false, wrapper.getMessage() , wrapper.getInternalMessage());
            
            return new Respuesta(true, "" , "");
        }catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error consultando el servicio web", ex);
            return new Respuesta(false, "No se pudo conecctar con el servidor", "deleteRegister" + ex.getMessage());
        }

        
        
    }
}
