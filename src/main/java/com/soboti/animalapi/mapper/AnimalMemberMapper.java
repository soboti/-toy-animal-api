package com.soboti.animalapi.mapper;

import com.soboti.animalapi.vo.AnimalMemberVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnimalMemberMapper {
    List<AnimalMemberVo> selectAnimalMember();
}
