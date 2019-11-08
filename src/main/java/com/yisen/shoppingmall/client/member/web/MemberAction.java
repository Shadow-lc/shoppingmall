package com.yisen.shoppingmall.client.member.web;

import com.yisen.shoppingmall.client.member.entity.Member;
import com.yisen.shoppingmall.client.member.service.MemberService;
import com.yisen.shoppingmall.client.member.service.impl.MemberServiceImpl;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

public class MemberAction {
    private String name;
    private String password;
    private String yzm;
    private String loginMessage;
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setYzm(String yzm) {
        this.yzm = yzm;
    }

    public String getLoginMessage() {
        return loginMessage;
    }

    public String login() {
        HttpSession session = ServletActionContext.getRequest().getSession();
        String code = (String)session.getAttribute("checkCode");
        if(code.equalsIgnoreCase(yzm)){
            MemberService service = new MemberServiceImpl();
            Member member = service.queryNickAndPassword(name, password);
            if(member != null) {
                loginMessage = "suc";
                session.setAttribute("member", member);
            } else {
                loginMessage = "用户名或密码错误";
            }
        } else {
            loginMessage = "验证码错误";
        }
        return "login_success";
    }
}
