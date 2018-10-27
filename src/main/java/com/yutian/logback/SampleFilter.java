/*
package com.yutian.logback;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

public class SampleFilter extends Filter<ILoggingEvent> {


    public FilterReply decide(ILoggingEvent event) {
       if(event.getMessage().contains("ACCEPT")){
           return FilterReply.ACCEPT;
       }else if(event.getMessage().contains("DENY")){
           return FilterReply.DENY;
       }else if(event.getMessage().contains("NEUTRAL")){
           return FilterReply.NEUTRAL;
       }else{
           return FilterReply.ACCEPT;
       }
    }



}
*/
