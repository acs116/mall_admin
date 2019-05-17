package cafe.jjdev.mall.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cafe.jjdev.mall.admin.mapper.MemberMapper;
import cafe.jjdev.mall.admin.vo.Member;

@Service
@Transactional
public class MemberService {
	@Autowired
	private MemberMapper memberMapper;
	
	public Member getMember(Member member) {
		return memberMapper.getLoginMember(member);
	}
	
	public int addMember(Member member) {
		return memberMapper.addAllMember(member);
	}
}
