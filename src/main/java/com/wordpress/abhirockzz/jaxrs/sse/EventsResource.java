package com.wordpress.abhirockzz.jaxrs.sse;

import java.util.Date;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.sse.OutboundSseEvent;
import javax.ws.rs.sse.Sse;
import javax.ws.rs.sse.SseEventSink;

@Stateless
@Path("events")
public class EventsResource {

    @GET
    @Produces("text/event-stream")
    public void fetch(@Context Sse sse, @Context SseEventSink eSink) {
        
        OutboundSseEvent stringEvent = sse.newEventBuilder()
                .name("stringEvent")
                .data(new Date().toString()).build();
        eSink.send(stringEvent);

        OutboundSseEvent primitiveTypeEvent = sse.newEventBuilder()
                .name("primitiveTypeEvent")
                .data(System.currentTimeMillis()).build();
        eSink.send(primitiveTypeEvent);

        OutboundSseEvent jsonbType = sse.newEventBuilder()
                .name("jsonbType")
                .data(new Employee("test@test", "test", 42))
                .mediaType(MediaType.APPLICATION_JSON_TYPE)
                .build();
        eSink.send(jsonbType);
        
        OutboundSseEvent jaxbType = sse.newEventBuilder()
                .name("jaxbType")
                .data(new Customer("testcut@test", "king"))
                .mediaType(MediaType.APPLICATION_XML_TYPE)
                .build();
        eSink.send(jaxbType);
        
        OutboundSseEvent customObjWithMBW = sse.newEventBuilder()
                .name("customObjWithMBW")
                .data(new Student("stud@test", "stud-007")).build();
        eSink.send(customObjWithMBW);

        System.out.println("events sent");
        eSink.close();
        System.out.println("sink closed");
    }

}
