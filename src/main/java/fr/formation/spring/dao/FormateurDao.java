package fr.formation.spring.dao;

import java.util.Collection;

import fr.formation.spring.model.Formateur;

public interface FormateurDao {

	void create(Formateur f);

	void update(Formateur f);

	void delete(Formateur f);

	Collection<Formateur> findAll();

	Formateur find(Long id);
}
