package fr.formation.spring.service;


import fr.formation.spring.dao.FormateurDao;
import fr.formation.spring.model.Formateur;

import java.util.Collection;

public class FormateurServiceImpl implements FormateurService {

	private FormateurDao formateurDao;

	public FormateurServiceImpl() {
		System.out.println("FormateurServiceImpl : constructeur par défaut");
	}

	public FormateurServiceImpl(final FormateurDao formateurDao) {
		super();
		this.formateurDao = formateurDao;
		System.out.println("FormateurServiceImpl : constructeur avec arguements : formationDao");
	}

	public void setFormationDao(final FormateurDao formateurDao) {
		this.formateurDao = formateurDao;
		System.out.println("FormateurServiceImpl :le setter de formationDao");
	}

	@Override
	public void create(Formateur f) {

	}

	@Override
	public void update(Formateur f) {

	}

	@Override
	public void delete(Formateur f) {

	}

	@Override
	public Collection<Formateur> findAll() {
		return null;
	}

	@Override
	public Formateur find(Long id) {
		return null;
	}
}
