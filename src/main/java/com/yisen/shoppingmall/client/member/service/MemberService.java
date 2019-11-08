package com.yisen.shoppingmall.client.member.service;

import com.yisen.shoppingmall.client.member.entity.Member;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by Mr.Lu on 2019/11/8.
 */
public interface MemberService {
    Member queryNickAndPassword(String nick, String password);
}
