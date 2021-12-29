package co.kr.humankdh.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data @Alias("career")
public class TrainerCareerVo {
	private Long cno;
	private String trainerId;
	private String careerName;
	private String startDate;
	private String endDate;
	private String comments;
}
