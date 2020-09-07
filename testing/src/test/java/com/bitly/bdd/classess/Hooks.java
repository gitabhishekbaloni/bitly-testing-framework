package com.bitly.bdd.classess;

import com.bitly.Application;
import com.bitly.constants.Constants;
import com.bitly.dependencies.ContainerModel;
import com.bitly.dependencies.ContainerUtilities;
import com.bitly.http.ExtractedResponse;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import dependencies.Container;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Application.class, Container.class, ContainerModel.class, ContainerUtilities.class})
public class Hooks {

    private static final Logger LOG = LoggerFactory.getLogger(Hooks.class);

    @Autowired
    public BitlyClient bitlyClient;

    @Autowired
    public Configuration configuration;

    @Autowired
    public ScenarioContext scenarioContext;

    private boolean hasNoAccessToken() {
        return  (!scenarioContext.hasKey(Constants.ACCESS_TOKEN)) ||
                scenarioContext.getContext(Constants.ACCESS_TOKEN).toString().trim().isEmpty();
    }

    @Before
    public void beforeScenario() {
        LOG.info(Constants.RUN_BEFORE_SCENARIO);
        if (hasNoAccessToken()) {
            //set access token if not available
            if(configuration.getIs_access_token_available()){
                scenarioContext.setContext(Constants.ACCESS_TOKEN, configuration.getAccess_token());
            }else {
                ExtractedResponse accessTokenResponse = bitlyClient.generateAccessToken();
                assertThat(accessTokenResponse.getStatusCode(), equalTo(200));
                scenarioContext.setContext(Constants.ACCESS_TOKEN, accessTokenResponse.getBody());
            }
        }
    }

    @After
    public void afterScenario() {
        LOG.info(Constants.RUN_AFTER_SCENARIO);
        scenarioContext.getKeys().removeIf(key -> !(key.equals(Constants.ACCESS_TOKEN)));
    }
}
