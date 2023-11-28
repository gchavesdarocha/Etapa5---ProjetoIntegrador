package com.projetointegrador.service;

import com.projetointegrador.data.ClienteEntity;
import com.projetointegrador.repositorio.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienterepository;

     public List<ClienteEntity> listarTodosClientes() {

        return clienterepository.findAll();
    }

    public ClienteEntity criarCliente(ClienteEntity cliente) {
        cliente.setDataCadastro(LocalDateTime.now());
        clienterepository.save(cliente);

        return cliente;
    }

    public ClienteEntity atualizarCliente(Integer clienteId, ClienteEntity clienteDto) {
        ClienteEntity cliente = getCliente(clienteId);

        if (cliente != null) {

            cliente.setNome(clienteDto.getNome());
            cliente.setCpf(clienteDto.getCpf());
            cliente.setIdade(clienteDto.getIdade());

            clienterepository.save(cliente);
        }
        return cliente;
    }

    public void deletarCliente(Integer clienteId) {
        var cliente = getCliente(clienteId);

        if (cliente != null) {
            clienterepository.deleteById(cliente.getId());
        }
    }

    public ClienteEntity getCliente(Integer clienteId) {
        Optional<ClienteEntity> clienteOptional = clienterepository.findById(clienteId);

        if (clienteOptional.isPresent()) {
            ClienteEntity cliente = clienteOptional.get();
            return cliente;
        } else {
            return null;
        }
    }
}
