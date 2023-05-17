package com.study.NGM301.sgjang11.service;

import com.study.NGM301.sgjang11.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    MemberMapper memberMapper;

    public List<MemberVO> getMemberList() {
        return memberMapper.getMemberList();
    }
}
