package co.kr.humankdh.service;


import java.util.List;

import co.kr.humankdh.domain.BlackListVo;
import co.kr.humankdh.domain.Criteria;
import co.kr.humankdh.domain.SalesVo;

/*
 * 한수빈
 * 블랙리스트 서비스
 */

public interface BlackListService {
	List<BlackListVo> getList(Criteria cri);
	
	 int getTotal(Criteria criteria);
	 
	 void register(BlackListVo blackListVo);
	 
	 boolean remove(Long blackno);


}
