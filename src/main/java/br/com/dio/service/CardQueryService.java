package br.com.dio.service;

import br.com.dio.dto.CardDetailsDTO;
import br.com.dio.persistence.dao.CardDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

public record CardQueryService(Connection connection) {

    public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
        var dao = new CardDAO(connection);
        return dao.findById(id);
    }

}
