package fr.ece.tweetstats.core.serviceapi;

import fr.ece.tweetstats.core.domain.Search;
import fr.ece.tweetstats.core.exception.SearchNotFoundException;
import java.util.List;

/**
 * Generated interface for the Service SearchService.
 */
public interface SearchService {

	public final static String BEAN_ID = "searchService";

	public List<Search> getSearchByBrand(String brand);

	public Search findById(String id) throws SearchNotFoundException;

	public List<Search> findAll();

	public Search save(Search entity);

	public void delete(Search entity);

}
