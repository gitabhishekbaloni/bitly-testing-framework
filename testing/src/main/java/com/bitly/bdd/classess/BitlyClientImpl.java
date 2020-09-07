package com.bitly.bdd.classess;

import com.bitly.constants.Constants;
import com.bitly.http.ExtractedResponse;
import com.bitly.rest.BasicRestConfigurationImpl;
import com.bitly.utilities.ResponseTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BitlyClientImpl extends BasicRestConfigurationImpl implements BitlyClient {

    private static final Logger LOG = LoggerFactory.getLogger(BitlyClientImpl.class);

    @Autowired
    protected Configuration conf1;

    @Autowired
    public BitlyClientImpl(final ResponseTransformer transformer, final Configuration conf1) {
        super(transformer, conf1.getUrl());
    }


    public ExtractedResponse generateAccessToken() {
        TokenPayload tokenPayload = TokenPayload.builder().api_auth_header(conf1.getApi_auth_header()).build();
        Map<String, String> headers = new HashMap<>();
        headers.put(Constants.HEADER_AUTHORIZATION, new StringBuilder().append(tokenPayload.getApi_auth_header()).toString());
        //HTTP basic authentication flow
        return sendPost(conf1.getApiPaths().getAccess_token_path(), headers);

    }

    public ExtractedResponse createBitlyLinks(Object payload, String authorisedToken) {
        Map<String, String> headers = new HashMap<>();
        headers.put(Constants.HEADER_AUTHORIZATION, new StringBuilder().append(Constants.BEARER).append(authorisedToken).toString());
        return sendPost(new StringBuilder().append(conf1.getUrl_version()).append(conf1.getApiPaths().getCreate_bitlinks()).toString(), payload, headers);
    }

    public ExtractedResponse getGroups(String authorisedToken) {
        Map<String, String> headers = new HashMap<>();
        headers.put(Constants.HEADER_AUTHORIZATION, new StringBuilder().append(Constants.BEARER).append(authorisedToken).toString());
        return sendGet(new StringBuilder().append(conf1.getUrl_version()).append(conf1.getApiPaths().getGet_groups()).toString(), headers);
    }

    private Map<String, String> createParamForGroupId(String groupId) {
        return Collections.singletonMap(Constants.GROUP_ID, groupId);
    }

    public ExtractedResponse getGroupByGroupId(String groupId, String authorisedToken) {
        Map<String, String> headers = new HashMap<>();
        headers.put(Constants.HEADER_AUTHORIZATION, new StringBuilder().append(Constants.BEARER).append(authorisedToken).toString());
        return sendGet(new StringBuilder().append(conf1.getUrl_version()).append(conf1.getApiPaths().getGet_group_by_group_id()).toString(), headers, createParamForGroupId(groupId));
    }

    public ExtractedResponse getSortedBitlinksForGroupId(String groupId, String sort,Map<String,String> queryParams, String authorisedToken) {
        Map<String, String> headers = new HashMap<>();
        headers.put(Constants.HEADER_AUTHORIZATION, new StringBuilder().append(Constants.BEARER).append(authorisedToken).toString());
        Map<String, String> pathParam = new HashMap();
        pathParam.put(Constants.GROUP_ID, groupId);
        pathParam.put(Constants.SORT,sort);
        return sendGet(new StringBuilder().append(conf1.getUrl_version()).append(conf1.getApiPaths().getGet_sorted_path()).toString(), headers, pathParam,queryParams);
    }

    public ExtractedResponse getSomething(Object getObject) {
        return null;
    }

    @Override
    public String baseUrl() {
        return this.getUrl();
    }
}