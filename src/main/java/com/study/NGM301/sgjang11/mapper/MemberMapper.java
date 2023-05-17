package com.study.NGM301.sgjang11.mapper;

import com.study.NGM301.sgjang11.service.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    List<MemberVO> getMemberList();
}
