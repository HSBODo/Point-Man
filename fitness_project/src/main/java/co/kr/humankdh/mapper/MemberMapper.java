package co.kr.humankdh.mapper;

import java.util.List;


import java.util.Map;

import org.apache.ibatis.annotations.Param;

import co.kr.humankdh.domain.Criteria;
import co.kr.humankdh.domain.MemberVo;
import co.kr.humankdh.domain.SalesVo;


public interface MemberMapper {
	// 회원가입
	public void insertMember(MemberVo member);
	
	// 로그인
	int memberLogin(@Param("userid") String userid, @Param("userpw") String userpw);
	
	void insertAuth(@Param("userid") String userid, @Param("auth") String auth);
	
	/*
	 *한수빈
	 *관리자가 회원 권한부여 
	 */
	void insertAuthByAdmin(MemberVo memberVo);
	
	/*
	 * 한수빈
	 * 관리자가 회원등록
	 */
	void insertMemberbyAdmin(MemberVo memberVo);
	
	
	/*
	 * 한수빈
	 * 관리자가 회원권한 삭제
	 */
	void authdeletebyAdmin(String userid);
	/*
	 * 한수빈
	 * 회원의 모든 게시글 조회
	 */
	public List<Integer> findBNObyALL(String userid);
	
	MemberVo read (String userid);
	
	void delete(String userid);
	
	void deletereplyAll(int bno);
	
	void deleteboardAll(String userid);
	
	void update(Object object);
	
	void authupdate(Object object);
	
	public List<MemberVo> getList();
	
	
	public List<MemberVo> getListWithPaging(Criteria cri);
	
//	int getTotalCount(Criteria cri);
	
	// 아이디중복체크
	int idChk(String id);

	int getTotalCount(Criteria cri);
	
	// 아이디 찾기
	int findId(String id);
	
	// 비밀번호 초기화
	String updatePw(String pwd);
}
