package com.example.websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class Config implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");  //subscribe to /topic/return-to for receiving message
        registry.setApplicationDestinationPrefixes("/app"); //to send message /app/message
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        System.out.println("Printing registry");
        registry.addEndpoint("/server1").setAllowedOrigins("http://localhost:4200", "http://localhost:4200/", "http://localhost:62053", "http://localhost:62053/", "https://st.jiovcip.jiolabs.com/vcip-customer/", "https://st.jiovcip.jiolabs.com/vcip-demo/").withSockJS();  //to connect with server /server1
    }
}
