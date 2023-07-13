package ru.pKrasnov.telegrambot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.pKrasnov.telegrambot.entities.Client;


@RepositoryRestResource(collectionResourceRel = "clients", path = "clients")
public interface ClientRepository  extends JpaRepository<Client, Long> {
}
