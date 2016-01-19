package io.pivotal.springtrader.quotes.domain.mongodb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by cq on 1/12/15.
 */
//@Service
public class DataLoader {
    private static final Logger logger = LoggerFactory.getLogger(DataLoader.class);

//    private final StockRepository stockRepository;
//
//    @Autowired
//    public DataLoader(StockRepository repository) {
//        this.stockRepository = repository;
//    }

//    @PostConstruct
//    void init() {
//        ObjectMapper mapper = new ObjectMapper();
//
//        try {
//            logger.info("DatabaseLoader:init - Loading data into mongodb");
//            Stock[] arrayOfStocks = mapper.readValue(DataLoader.class.getResource("/data.json"),Stock[].class);
//            List<Stock> stocks = Arrays.asList(arrayOfStocks);
//            stockRepository.save(stocks);
//            logger.info(stockRepository.count() + " stocks loaded into the Quotes collection");
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}