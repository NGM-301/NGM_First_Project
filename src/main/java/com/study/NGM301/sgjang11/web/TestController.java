package com.study.NGM301.sgjang11.web;

import com.study.NGM301.sgjang11.service.MemberService;
import com.study.NGM301.sgjang11.service.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/sgjang11")
public class TestController {

    @Autowired
    MemberService memberService;

    @GetMapping("/test")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView();

        List<MemberVO> memberList = memberService.getMemberList();
        for (MemberVO memberVO : memberList) {
            System.out.println("memberVO = " + memberVO);
        }
        modelAndView.addObject(memberList);
        return modelAndView;
    }

}
