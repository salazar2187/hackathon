package hackathon.envios.adapters.driving.http.jwt;

import hackathon.envios.domain.api.MailExtractor;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class JwtMailExtractor implements MailExtractor {

    @Value("${jwt.secret}")
    String secret;

    @Override
    public String extractEmail(String token) {
        if (token.startsWith("Bearer ")) {
            token = token.substring(7);
        }

        return Jwts.parser()
                .setSigningKey(secret.getBytes())
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
}
