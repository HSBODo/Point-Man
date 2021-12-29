package co.kr.humankdh.mapper;






import java.util.List;
import java.util.Map;

import co.kr.humankdh.domain.Criteria;
import co.kr.humankdh.domain.SalesVo;
/*
 * 한수빈
 * 매출 메퍼
 */

public interface SalesMapper {

	public List<SalesVo> getList();
	
	public List<SalesVo> getListWithPaging(Criteria cri);
	
	int getTotalCount(Criteria cri);
	
	void insert(SalesVo sales);
	
	void insertSelectKey(SalesVo sales);
	
	SalesVo read(Long sno);
		
	int delete(Long sno);
	
	int update(SalesVo salesVo);
	/*
	 * 한수빈
	 * 그래프 사용하기 위해
	 * 날짜 : 총매출 
	 */
	List<Map<String, Object>> getSalesListby(String year);
	

}
