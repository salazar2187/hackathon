package hackathon.envios.adapters.driven.jpa.mysql.adapter;

import hackathon.envios.adapters.driven.jpa.mysql.mappers.IRoleEntityMapper;
import hackathon.envios.adapters.driven.jpa.mysql.repositories.IRoleRepository;
import hackathon.envios.domain.model.Role;
import hackathon.envios.domain.spi.IRolePersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class RoleMysqlAdapter implements IRolePersistencePort {
    private final IRoleRepository roleRepository;
    private final IRoleEntityMapper roleEntityMapper;

    @Override
    public Role getRol(Long id) {
        return roleEntityMapper.toRole(roleRepository.findById(id).orElseThrow(RuntimeException::new));
    }
}
