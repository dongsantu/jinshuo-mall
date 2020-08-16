package com.jinshuo.mall.admin.infra.config.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.impl.DefaultClock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Created by Administrator on 2020/7/2.
 */
@Slf4j
@Component
public class JwtTokenUtil implements Serializable {
    private static final long serialVersionUID = -3301605591108950415L;

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;

    @Value("${jwt.token}")
    private String tokenHeader;

    private Clock clock = DefaultClock.INSTANCE;

    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        return doGenerateToken(claims, userDetails.getUsername());
    }

    private String doGenerateToken(Map<String, Object> claims, String subject) {
        final Date createdDate = clock.now();
        final Date expirationDate = calculateExpirationDate(createdDate);

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(createdDate)
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    private Date calculateExpirationDate(Date createdDate) {
        return new Date(createdDate.getTime() + expiration);
    }

    public Boolean validateToken(String token, UserDetails userDetails) {
        SecurityUserDetails user = (SecurityUserDetails) userDetails;
        final String username = getUsernameFromToken(token);
        if (!username.equals(user.getUsername())) {
            return false;
        }
        return (!isTokenExpired(token));
    }

    public String getUsernameFromToken(String token) {
        return getClaimFromToken(token, Claims::getSubject);
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    private Claims getAllClaimsFromToken(String token) {
        return Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();
    }

    private Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        Date date = clock.now();
        return expiration.before(date);
    }

    public Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    public String createNewToken(String username) {
        final Date createdDate = clock.now();
        final Date expirationDate = calculateExpirationDate(createdDate);
        String token = Jwts.builder()
                .setSubject(username)
                .setExpiration(expirationDate)
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
        return token;
    }

    public boolean validateToken(String token) {
        String VALIDATE_FAILED = "validate failed : ";
        //ExpiredJwtException, UnsupportedJwtException, MalformedJwtException, SignatureException, IllegalArgumentException
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public String getUsernameFromJwt(String token) {
        Jwt jwt = Jwts.parser().setSigningKey(secret).parse(token);
        Object object = Jwts.parser().setSigningKey(secret).parse(token).getBody();
        return Jwts.parser().setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

}
