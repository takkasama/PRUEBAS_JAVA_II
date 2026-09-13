package cr.ac.una.pruebas_java_ii.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/*
    ESTA CLASE TENDRA EL OBJETIVO DE SER UN INTERMEDIARIO PARA EL TRASPORTE DE LOS DATOS 
    OBTENIDOS DEL TRASPORTE DE WS AL CLIENTE, YA QUE EL CLIENTE NO RECONECE LOS DTO DEL WS
    POR LO QUE ESTE CLASE AYUDARA COMO INTERMEDIARIO PARA DICHO TRASPORTE.


    TRASPORTA LAS SIGUIENTES CLASES:
    - EmployeeDTO
    - RegisterDTO
    - MarkDTO

    EN UN PRINCIPIO SE PENSABA CAMBIAR LA INSTANCIAS DE UN CLASE DTO A OTRA POR UN ID LONG, PERO GENERA PROBLEMAS EN EL WS A LA HORA DE 
    LLAMAR A LA CLASE DE ESTA PARA UN MODIFICACION, POR LO QUE SE TRASPORTARA LA CLASE COMPLETA, YA QUE EL WS NO RECONOCE LOS DTO DEL CLIENTE, 
    POR LO QUE SE DEBE TRASPORTAR A DTO DEL WS PARA QUE ESTE RECONOZCA LA CLASE Y PUEDA MODIFICARLA.
*/


public class TransportHelper {


    // trasporte de EmployeeDTO del WS a EmployeeDTO del cliente
    public static EmployeeDTO transportEmployeeDTO(cr.ac.una.t_marks.webservice.EmployeeDTO dto) {
        EmployeeDTO employe = new EmployeeDTO();
        if (dto == null) 
            return employe;  

        employe.setId(dto.getId() != null ? String.valueOf(dto.getId()) : null);
        
        employe.setName(dto.getName());
        employe.setLastName(dto.getLastName());
        employe.setBirthdate(LocalDate.parse(dto.getBirthdate()));
        employe.setIdCard(dto.getIdCard());
        
        employe.setFolio(dto.getFolio());
        employe.setIsAdministrator(dto.isIsAdministrator());
        employe.setPassword(dto.getPassword());
        
        employe.setAvatar(dto.getAvatar());
        employe.setHourValue(dto.getHourValue() != null ? dto.getHourValue() : 0.0);
        employe.setAvatarType(dto.getAvatarType());

        
        employe.setVersion(dto.getVersion());

        return employe;
    }

    public static cr.ac.una.t_marks.webservice.EmployeeDTO transportEmployeeDTOWS(EmployeeDTO dto) {
        cr.ac.una.t_marks.webservice.EmployeeDTO employe = new cr.ac.una.t_marks.webservice.EmployeeDTO();
        if (dto == null) 
            return employe;  

        employe.setId(dto.getId());
        
        employe.setName(dto.getName());
        employe.setLastName(dto.getLastName());
        employe.setBirthdate(dto.getBirthdate().toString());
        employe.setIdCard(dto.getIdCard());
        
        employe.setFolio(dto.getFolio());
        employe.setIsAdministrator(dto.getIsAdministrator());
        employe.setPassword(dto.getPassword());
        
        employe.setAvatar(dto.getAvatar());
        employe.setHourValue(dto.getHourValue());
        employe.setAvatarType(dto.getAvatarType());

        
        //employe.setVersion(dto.getVersion());

        return employe;
    }


    

    // trasporte de RegisterDTO del WS a RegisterDTO del cliente
    public static RegisterDTO transportRegisterDTO(cr.ac.una.t_marks.webservice.RegisterDTO dto) {
        RegisterDTO register = new RegisterDTO();
        if (dto == null)
            return register;

        register.setId(dto.getId() != null ? String.valueOf(dto.getId()) : null);
        register.setDescription(dto.getDescription());
        register.setEmployeeList(dto.getEmployeeList() != null ? dto.getEmployeeList().stream().
        map(e -> transportEmployeeDTO(e)).distinct().toList() : null);
        
        register.setVersion(dto.getVersion());
        return register;
    }


    public static cr.ac.una.t_marks.webservice.RegisterDTO transportRegisterDTOWS(RegisterDTO dto) {
        cr.ac.una.t_marks.webservice.RegisterDTO register = new cr.ac.una.t_marks.webservice.RegisterDTO();
        if (dto == null)
            return register;
        
        register.setId(dto.getId());
        register.setDescription(dto.getDescription());

        register.getEmployeeList().addAll(dto.getEmployeeList().stream().map(e -> transportEmployeeDTOWS(e)).toList());
        
       // register.setVersion(dto.getVersion());
        
        return register;
    }
    



    //trasporte de MarkDTO del WS a MarkDTO del cliente
    public static MarkDTO transportMarkDTO(cr.ac.una.t_marks.webservice.MarkDTO dto) {
        MarkDTO mark = new MarkDTO();
        if (dto == null)
            return mark;
        
        mark.setId(dto.getId() != null ? String.valueOf(dto.getId()): null);
        
        mark.setDayShift(dto.isDayShift());
        mark.setInconsistent(dto.isInconsistent());
        
        mark.setEntrance(LocalDateTime.parse(dto.getEntrance()));
        mark.setExit(dto.getExit() != null ? LocalDateTime.parse(dto.getExit()) : null);
        
        //mark.setVersion(dto.getVersion());
        
        return mark;
    }
    
    public static cr.ac.una.t_marks.webservice.MarkDTO transportMarkDTOWS(MarkDTO dto){
        cr.ac.una.t_marks.webservice.MarkDTO mark = new cr.ac.una.t_marks.webservice.MarkDTO();
        
        if(dto == null)
            return mark;
        
        mark.setDayShift(dto.getDayShift());
        mark.setInconsistent(dto.getInconsistent());
        mark.setEntrance(dto.getEntrance().toString());
        mark.setExit(dto.getExit() !=  null ? dto.getExit().toString() : null);
        mark.setEmployee(transportEmployeeDTOWS(dto.getEmployee()));
        //mark.setVersion(dto.getVersion());
        
        return mark;

    }
}
