package co.kr.humankdh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.kr.humankdh.domain.MemberVo;
import co.kr.humankdh.domain.TrainerCareerVo;
import co.kr.humankdh.service.PTreserveService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller @Log4j
@RequestMapping("/PTreserve/*")
@AllArgsConstructor  //생성자를 이용해서 autowired자동 주입
public class PT_ReserveController {
	private PTreserveService service;
	
	@GetMapping("calendar")
	public void calendar() {
		log.info("calendar");
	}
	
	@GetMapping("trainers")
	public void trainers() {
		log.info("trainers");
	}
	
	
	@ResponseBody @PostMapping(value="getTrainers")
	public Map<String, List<TrainerCareerVo>> getTrainers(){
		List<MemberVo> trainers = service.getTrainerList();
		Map<String, List<TrainerCareerVo>> careers = new HashMap<>();
		trainers.forEach( t -> {
			careers.put( t.getUserName(), service.getCareers(t.getUserid())); 
		});
		return careers;
	}
	
	@GetMapping("careerWrite")
	public void careerWrite(Model model) {
		log.info("careerWrite");
		model.addAttribute("list", service.getTrainerList());
	}
	
	@ResponseBody @PostMapping("careerWrite")
	public String careerWrite(@RequestBody List<TrainerCareerVo> list) {
		if(!list.isEmpty()){
			list.forEach(service::insertCareer);
			// 저장완료후 페이지에서 저장한 트레이너가 선택되어 있을것.(작성후 확인차원에서)
			return list.get(0).getTrainerId();
		}
		return "default";
	}
	
	@ResponseBody @PostMapping("getCareers")
	public List<TrainerCareerVo> getCareers(@RequestBody String id) {
//		List<TrainerCareerVo> list = new ArrayList<>(service.getCareers(id));
		log.info(id);
		return service.getCareers(id);
	}
	
	// 한글이 깨지는 현상 때문에 produces를 설정, 데이터를 보낼때 인코딩해서 보내야함
	@ResponseBody @PostMapping(value="getComments", produces="text/plain; charset=utf-8")
	public String getComments(@RequestBody String id) {
		return service.getLastComments(id);
	}
	
	@ResponseBody @PostMapping(value="updateCareer", produces="text/plain; charset=utf-8")
	public String updateCareer(@RequestBody TrainerCareerVo vo){
		log.info(vo);
		service.updateCareer(vo);
		return "수정되었습니다";
	}
	
	@ResponseBody @PostMapping(value="deleteCareer", produces="text/plain; charset=utf-8")
	public String deleteCareer(@RequestBody Long cno){
		log.info(cno);
		service.deleteCareer(cno);
		return "삭제되었습니다";
	}
	
	@ResponseBody @PostMapping(value="deleteAllCareer", produces="text/plain; charset=utf-8")
	public String deleteAllCareer(@RequestBody String id){
		log.info(id);
		List<TrainerCareerVo> list = service.getCareers(id);
		if(list.isEmpty()) {
			return "삭제할 데이터가 없습니다!";
		}
		else {
			service.deleteAllCareer(id);
			return "모두 삭제되었습니다";
		}
	}

}
