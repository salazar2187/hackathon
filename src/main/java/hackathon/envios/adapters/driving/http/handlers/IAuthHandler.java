package hackathon.envios.adapters.driving.http.handlers;



import hackathon.envios.adapters.driving.http.dto.request.LoginRequestDto;
import hackathon.envios.adapters.driving.http.dto.response.JwtResponseDto;

import java.text.ParseException;

public interface IAuthHandler {
    JwtResponseDto login(LoginRequestDto loginRequestDto);
    JwtResponseDto refresh(JwtResponseDto jwtResponseDto) throws ParseException;

}
