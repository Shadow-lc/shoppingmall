package com.yisen.shoppingmall.client.member.service.impl;

import com.yisen.shoppingmall.client.member.entity.Member;
import com.yisen.shoppingmall.client.member.mapper.MemberMapper;
import com.yisen.shoppingmall.client.member.service.MemberService;
import com.yisen.shoppingmall.commons.factory.Factory;
import org.apache.ibatis.session.SqlSession;

public class MemberServiceImpl implements MemberService {

    public MemberServiceImpl() {

    }

    @Override
    public Member queryNickAndPassword(String nick, String password) {
        SqlSession session = null;
        try {
            session = Factory.getSession();
            MemberMapper dao = session.getMapper(MemberMapper.class);
            return dao.queryNameandPass(nick, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
