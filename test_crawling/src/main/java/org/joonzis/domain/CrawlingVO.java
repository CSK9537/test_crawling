package org.joonzis.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CrawlingVO {
	// 물 주기
	private String gudie_watering_schedule;
	// 습도 수준
	private String guide_watering_humiditylevel;
	// 물 내용
	private String guide_watering_content;
	// 햇빛 요건
	private String guide_sunlight_requirements;
	// 햇빛 허용 오차
	private String guide_sunlight_tolerance;
	// 햇빛 내용
	private String guide_sunlight_content;
	// 이상적 온도 최저 최고
	private int guide_temperature_imin;
	private int guide_temperature_imax;
	// 온도 허용 오차 최저 최고
	private int guide_temperature_tmin;
	private int guide_temperature_tmax;
	// 온도 내용
	private String guide_temperature_content;
	// 토양 구성
	private String guide_soil_composition;
	// 토양 종류
	private String guide_soil_type;
	// 토양 ph
	private String guide_soil_ph;
	// 토양 내용
	private String guide_soil_content;
	// 비료 내용
	private String guide_fertilizing_content;
	// 가지치기 시기
	private String guide_pruning_time;
	// 가지치기 장점
	private String guide_pruning_benefits;
	// 가지치기 내용
	private String guide_pruning_content;
	// 번식 시기
	private String guide_propagation_time;
	// 번식 유형
	private String guide_propagation_type;
	// 번식 내용
	private String guide_propagation_content;
	// 옮겨심기 시기
	private String guide_transplanting_time;
	// 옮겨심기 내용
	private String guide_transplanting_content;
	// 심는 시기
	private String guide_planting_time;
	// 심기 내용
	private String guide_planting_content;
	// 분갈이 일정
	private String guide_repotting_schedule;
	// 분갈이 내용
	private String guide_repotting_content;
	// 수확 시기
	private String guide_harvest_time;
	// 수확 내용
	private String guide_harvest_content;
	
	
	
	
}
