package me.chadthompson.splunkdemo.logging;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.contrib.json.classic.JsonLayout;

import java.util.Map;

public class SplunkDemoLayout extends JsonLayout {

    @Override
    protected void addCustomDataToJsonMap(Map<String, Object> map, ILoggingEvent event) {
        map.put("application", "splunk-demo");
    }
}

/*
public class CustomJsonLayout extends JsonLayout {
    @Override
    protected void addCustomDataToJsonMap(Map<String, Object> map, ILoggingEvent event) {
        map.put("application", "log-odyssey");
        try {
            map.put("host", InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException e) {
        }
    }
}
 */
