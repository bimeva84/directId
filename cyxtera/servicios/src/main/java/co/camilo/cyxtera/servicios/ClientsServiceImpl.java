/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.camilo.cyxtera.servicios;

import co.camilo.cyxtera.modelo.Client;
import co.camilo.cyxtera.persistencia.TipoTrasladoRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author carojas
 */
@Repository
public class ClientsServiceImpl implements ClientsService {
    
    @Override
    public List<Client> getClients() {
        
        ArrayList<Client> clientes = new ArrayList<Client>();
        Client cliente = new Client();
        
        
        // Se ingresa los clientes
        cliente.setBusinessId("Jgutierrez");
        cliente.setBusinessId("Juan Gutierrez");
        cliente.setEmail("jgutierrez@netsecure.ci");
        cliente.setPhone("3106996767");
        cliente.setStartDate(new Date());
        
        clientes.add(cliente);
        
        
        
        return (List<Client>) new Client();
    }
    
}
