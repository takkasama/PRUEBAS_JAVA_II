//package cr.ac.una.t_marks_ws.webservice;
//
//import cr.ac.una.t_marks_ws.model.MarkDTO;
//import cr.ac.una.t_marks_ws.service.MarkService;
//import cr.ac.una.t_marks_ws.util.Respuesta;
//import cr.ac.una.t_marks_ws.model.Wrapper;
//
//import jakarta.ejb.EJB;
//import jakarta.jws.WebMethod;
//import jakarta.jws.WebParam;
//import jakarta.jws.WebService;
//
///**
// *
// * @author takkasama
// */
//
//@WebService(serviceName = "MarkWS")
//public class MarkWS {
//
//    @EJB
//    private MarkService markService;
//    
//    @WebMethod(operationName = "saveMark")
//    public Wrapper saveMark(@WebParam(name = "markDTO")MarkDTO markDTO){
//        Respuesta res = markService.saveMark(markDTO);
//        
//        Wrapper wrapper = new Wrapper(res.getEstado(), res.getMensaje(), res.getMensajeInterno());
//        if(wrapper.getState())
//            wrapper.setContent(res.getResultado("Mark"));
//        
//        return wrapper;
//    }
//        
//    @WebMethod(operationName = "deleteMark")
//    public Wrapper deleteMark(@WebParam(name = "idMark")Long id){
//        Respuesta res = markService.deleteMark(id);
//        
//        Wrapper wrapper = new Wrapper(res.getEstado(), res.getMensaje(), res.getMensajeInterno());
//        
//        return wrapper;
//
//    }
//}
