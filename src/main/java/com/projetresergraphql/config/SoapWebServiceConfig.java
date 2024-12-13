package com.projetresergraphql.config;

import com.projetresergraphql.service.ReservationSoapService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoapWebServiceConfig {

    @Bean(name = "cxfBus")
    public Bus cxfBus() {
        return new SpringBus(); // Ensure Bus is instantiated here directly
    }

    @Bean
    public EndpointImpl reservationEndpoint(Bus cxfBus, ReservationSoapService reservationSoapService) {
        if (cxfBus == null || reservationSoapService == null) {
            throw new IllegalStateException("Bus or ReservationSoapService is not injected correctly");
        }
        EndpointImpl endpoint = new EndpointImpl(cxfBus, reservationSoapService);
        endpoint.publish("/reservation");
        return endpoint;
    }
}
