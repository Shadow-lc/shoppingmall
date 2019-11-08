package com.yisen.shoppingmall.client.member.service;

import com.yisen.shoppingmall.client.member.entity.Member;
import org.apache.ibatis.session.SqlSession;

public interface MemberService {
    Member queryNickAndPassword(String nick, String password);
}
