package com.bitly.bdd.classess;

import com.bitly.http.ExtractedResponse;

import java.util.Map;

public interface BitlyClient {

//    ExtractedResponse postSomething(Object postObject);

 //   ExtractedResponse getSomething(Object getObject);

    ExtractedResponse generateAccessToken();

    ExtractedResponse createBitlyLinks(Object payload, String authorisedToken);

    ExtractedResponse getGroups(String authorisedToken);

    ExtractedResponse getGroupByGroupId(String groupId, String authorisedToken);

    ExtractedResponse getSortedBitlinksForGroupId(String groupId, String sort, Map<String,String> sortParams , String authorisedToken);
}