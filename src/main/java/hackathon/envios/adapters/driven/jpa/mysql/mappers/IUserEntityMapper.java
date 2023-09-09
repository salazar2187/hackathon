package hackathon.envios.adapters.driven.jpa.mysql.mappers;


import hackathon.envios.adapters.driven.jpa.mysql.entity.UserEntity;
import hackathon.envios.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserEntityMapper {
    UserEntity toEntity(User user);
    User toUser(UserEntity userEntity);
}

