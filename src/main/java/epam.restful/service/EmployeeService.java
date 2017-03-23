package epam.restful.service;

import epam.restful.dao.EmployeeDAO;
import epam.restful.entity.Employee;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/employees")
public class EmployeeService {

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Employee> getEmployees_JSON() {
        List<Employee> listOfCountries = EmployeeDAO.getAllEmployees();
        return listOfCountries;
    }

    @GET
    @Path("/{firstName}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Employee getEmployee(@PathParam("firstName") String firstName) {
        return EmployeeDAO.getEmployee(firstName);
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Employee addEmployee(Employee emp) {
        return EmployeeDAO.addEmployee(emp);
    }

    @PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Employee updateEmployee(Employee emp) {
        return EmployeeDAO.updateEmployee(emp);
    }

    @DELETE
    @Path("/{firstName}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteEmployee(@PathParam("firstName") String firstName) {
        EmployeeDAO.deleteEmployee(firstName);
    }
}
