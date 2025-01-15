package com.in28minutes.rest.webservices.restfulwebservices.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // 하나 이상의 @Bean 메서드를 선언한다.
public class SpringSecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//      요청되지 않은 인증이라면 인증을 요구하는 페이지를 보여준다
        http.httpBasic(Customizer.withDefaults());
//      CSRF 체크 해제
        http.csrf(AbstractHttpConfigurer::disable)
//      모든 요청은 인증되어야 한다.
                .authorizeHttpRequests(auth -> auth.anyRequest().authenticated());

        return http.build();
    }
}
