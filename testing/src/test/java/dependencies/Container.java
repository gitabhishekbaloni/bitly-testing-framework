package dependencies;

import com.bitly.bdd.classess.BitlyClient;
import com.bitly.bdd.classess.BitlyClientImpl;
import com.bitly.bdd.classess.Configuration;
import com.bitly.bdd.classess.ScenarioContext;
import com.bitly.utilities.ResponseTransformer;
import org.springframework.context.annotation.Bean;

public class Container {
    @Bean
    public ScenarioContext testContext(){return new ScenarioContext();}

    @Bean
    public BitlyClient getBitlyClient(ResponseTransformer transformer, Configuration conf1) {
     return new BitlyClientImpl(transformer, conf1);
    }
}
