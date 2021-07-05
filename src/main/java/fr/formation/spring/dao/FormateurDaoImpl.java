package fr.formation.spring.dao;

import fr.formation.spring.model.Formateur;

import java.util.ArrayList;
import java.util.List;


public class FormateurDaoImpl implements FormateurDao {

	public FormateurDaoImpl() {
		System.out.println("FormationDaoImpl : constructeur par défaut ");

	}

 	public String quiSuisJe() {
		return " je suis une implémentation de FormationDao ";
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
	public List<Formateur> findAll() { // public Formateur(final Long id, final String nom, final String prenom, final Integer age)
		// on va exécuter une requete pour récupérer la liste des formations en BD
		Formateur formation1 = new Formateur(1L, "Adem", "Zayati",30);
		Formateur formation2 = new Formateur(1L, "Anis", "Zitouni",30);
		Formateur formation3 = new Formateur(1L, "Zou", "Hamdi",30);
		Formateur formation4 = new Formateur(1L, "Nidhal", "Yousfi",30);

		List<Formateur> formations = new ArrayList();
		formations.add(formation1);
		formations.add(formation2);
		formations.add(formation3);
		return formations;
	}

	@Override
	public Formateur find(Long id) {
		return null;
	}

}