package net.javaguide.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguide.springboot.model.LinkManager;


@Repository
public interface LinkRepository extends JpaRepository<LinkManager, Long> {

}