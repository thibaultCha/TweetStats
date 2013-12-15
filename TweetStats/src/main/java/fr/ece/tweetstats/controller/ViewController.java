package fr.ece.tweetstats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.ece.tweetstats.core.domain.Fetch;
import fr.ece.tweetstats.core.serviceapi.FetchService;

@Component
public class ViewController {

	@Autowired
	private FetchService fetchService;
	
	public ViewController() {
		
	}
	
	// M�thode example! save dans mongodb (le serveur doit �tre lanc� sur localhost:27017 (adresse par d�faut)
	public void saveFetch(Fetch fetch) {
		fetchService.save(fetch);
	}
}
