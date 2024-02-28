package com.group5.Restaurant.controllers;

import com.group5.Restaurant.commons.constants.endpoints.IClientEndpoints;
import com.group5.Restaurant.commons.domains.ObjectResponseDTO;
import com.group5.Restaurant.commons.domains.dtos.ClientDTO;
import com.group5.Restaurant.services.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller of the ClientService
 * Heard to the url "/client"
 */
@RestController
@RequestMapping(IClientEndpoints.CLIENT_END_POINT)
@AllArgsConstructor
public class ClientControllerImpl implements IClientController{

    final IClientService service;//Service dependency injected

    /**
     * Create a client
     * @param clientDTO Data reference object of the client
     * @return createClient of the service
     */
    @Override
    @GetMapping(IClientEndpoints.CLIENT_CREATE)
    public ResponseEntity<ObjectResponseDTO> createClient(ClientDTO clientDTO) {
        return this.service.createClient(clientDTO);
    }
}