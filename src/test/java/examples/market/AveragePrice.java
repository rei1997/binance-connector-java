package examples.market;

import com.binance.connector.client.impl.SpotClientImpl;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AveragePrice {
    private static final Logger logger = LoggerFactory.getLogger(AveragePrice.class);
    public static void main(String[] args) {
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();

        SpotClientImpl client = new SpotClientImpl();

        parameters.put("symbol","BNBUSDT");
        String result = client.createMarket().averagePrice(parameters);
        logger.info(result);
    }
}
