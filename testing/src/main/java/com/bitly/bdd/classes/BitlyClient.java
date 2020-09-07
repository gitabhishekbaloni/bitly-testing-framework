package com.bitly.bdd.classes;

import com.bitly.http.ExtractedResponse;

import java.util.Map;

public interface BitlyClient {

    ExtractedResponse generateAccessToken();

    ExtractedResponse createBitlyLinks(Object payload, String authorisedToken);

    ExtractedResponse createBitlyLinks(Object payload, String authorisedToken, String userDefinedPath);

    ExtractedResponse getGroups(String authorisedToken);

    ExtractedResponse getGroupByGroupId(String groupId, String authorisedToken);

    ExtractedResponse getSortedBitlinksForGroupId(String groupId, String sort, Map<String,String> sortParams , String authorisedToken);
}