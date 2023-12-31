package hackathon.envios.adapters.driven.jpa.mysql.adapter;


import hackathon.envios.adapters.driven.jpa.mysql.entity.PrincipalUser;
import hackathon.envios.adapters.driven.jpa.mysql.entity.RoleEntity;
import hackathon.envios.adapters.driven.jpa.mysql.entity.UserEntity;
import hackathon.envios.adapters.driven.jpa.mysql.repositories.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserEntity usuario = userRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

        if (usuario.getRol() == null) {
            throw new UsernameNotFoundException("User not found with email: " + email);
        }

        List<RoleEntity> roleEntityList = new ArrayList<>();
        roleEntityList.add(usuario.getRol());

        return PrincipalUser.build(usuario, roleEntityList);
    }
}
