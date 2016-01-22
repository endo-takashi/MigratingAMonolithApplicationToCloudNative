package io.pivotal.springtrader.quotes.repositories.jpa;


import io.pivotal.springtrader.quotes.domain.jpa.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by cax on 28/11/2015.
 */
@Repository
public interface StockRepository extends CrudRepository<Stock, String> {

    List<Stock> findByNameContainingIgnoreCaseOrSymbol(String name, String symbol);
}
