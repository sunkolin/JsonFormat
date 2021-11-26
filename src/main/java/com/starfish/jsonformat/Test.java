package com.starfish.jsonformat;

import cn.hutool.json.JSONUtil;

public class Test {


    public static void main(String[] args) {
        String text = "{\n" +
                "\"kind\": \"youtube#searchListResponse\",\n" +
                "\"etag\": \"\\\"k1sYjErg4tK7WaQQxvJkW5fVrfg/usRLzp_l5ss-L8Yb9ScY-VDAEOo\\\"\",\n" +
                "\"nextPageToken\": \"CAIQAA\",\n" +
                "\"pageInfo\": {\n" +
                "\"totalResults\": 1000000,\n" +
                "\"resultsPerPage\": 2\n" +
                "},\n" +
                "\"items\": [\n" +
                "{\n" +
                "\"kind\": \"youtube#searchResult\",\n" +
                "\"etag\": \"\\\"k1sYjErg4tK7WaQQxvJkW5fVrfg/D0nlqgSgFFEQnTduJtwcQZ3Hc78\\\"\",\n" +
                "\"id\": {\n" +
                "\"kind\": \"youtube#video\",\n" +
                "\"videoId\": \"5ixFWqZGZr8\"\n" +
                "},\n" +
                "\"snippet\": {\n" +
                "\"publishedAt\": \"2014-10-16T19:43:41.000Z\",\n" +
                "\"channelId\": \"UC9-3c4LzdzT_HvW3Xuti9wg\",\n" +
                "\"title\": \"Q&A WITH HARRY | PRANK CALLS!\",\n" +
                "\"description\": \"Can we smash 4000 likes for this Q&A!? My Flatmate Harold - http://www.youtube.com/W2S Buy Cheap and Instant Coins here: http://goo.gl/IZyNg2 Use code ...\",\n" +
                "\"thumbnails\": {\n" +
                "\"default\": {\n" +
                "\"url\": \"https://i.ytimg.com/vi/5ixFWqZGZr8/default.jpg\"\n" +
                "},\n" +
                "\"medium\": {\n" +
                "\"url\": \"https://i.ytimg.com/vi/5ixFWqZGZr8/mqdefault.jpg\"\n" +
                "},\n" +
                "\"high\": {\n" +
                "\"url\": \"https://i.ytimg.com/vi/5ixFWqZGZr8/hqdefault.jpg\"\n" +
                "}\n" +
                "},\n" +
                "\"channelTitle\": \"Calfreezy\",\n" +
                "\"liveBroadcastContent\": \"none\"\n" +
                "}\n" +
                "},\n" +
                "{\n" +
                "\"kind\": \"youtube#searchResult\",\n" +
                "\"etag\": \"\\\"k1sYjErg4tK7WaQQxvJkW5fVrfg/R5nmI-OBXmHyiXsGtMC3J6IUlBs\\\"\",\n" +
                "\"id\": {\n" +
                "\"kind\": \"youtube#video\",\n" +
                "\"videoId\": \"8KgzATFR0As\"\n" +
                "},\n" +
                "\"snippet\": {\n" +
                "\"publishedAt\": \"2014-09-03T12:49:15.000Z\",\n" +
                "\"channelId\": \"UC8_yRRDIGFaJEC7NOc1qTMw\",\n" +
                "\"title\": \"Harry at 30 Documentary\",\n" +
                "\"description\": \"In celebration of Prince Harry's 30th birthday, ITV have released a new documentary celebrating the past three decades of his life. Featuring archive footage...\",\n" +
                "\"thumbnails\": {\n" +
                "\"default\": {\n" +
                "\"url\": \"https://i.ytimg.com/vi/8KgzATFR0As/default.jpg\"\n" +
                "},\n" +
                "\"medium\": {\n" +
                "\"url\": \"https://i.ytimg.com/vi/8KgzATFR0As/mqdefault.jpg\"\n" +
                "},\n" +
                "\"high\": {\n" +
                "\"url\": \"https://i.ytimg.com/vi/8KgzATFR0As/hqdefault.jpg\"\n" +
                "}\n" +
                "},\n" +
                "\"channelTitle\": \"\",\n" +
                "\"liveBroadcastContent\": \"none\"\n" +
                "}\n" +
                "}\n" +
                "]\n" +
                "}";
        Object object = JSONUtil.parseObj(text);
        text = JSONUtil.toJsonPrettyStr(object);
        System.out.println(text);
    }
}
