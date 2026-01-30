package org.joonzis.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CrawlingVO {
	private String guide_title;
	private String gudie_watering_schedule;
	private String guide_watering_humiditylevel;
	private String guide_watering_content;
	private String guide_sunlight_requirements;
	private String guide_sunlight_tolerance;
	private String guide_sunlight_content;
	private int guide_temperature_imin;
	private int guide_temperature_imax;
	private int guide_temperature_tmin;
	private int guide_temperature_tmax;
	private String guide_temperature_content;
	private String guide_soil_composition;
	private String guide_soil_type;
	private String guide_soil_ph;
	private String guide_soil_content;
	private String guide_fertilizing_content;
	private String guide_pruning_time;
	private String guide_pruning_benefits;
	private String guide_pruning_content;
	private String guide_propagation_time;
	private String guide_propagation_type;
	private String guide_propagation_content;
	private String guide_transplanting_time;
	private String guide_transplanting_content;
	private String guide_planting_time;
	private String guide_planting_content;
	private String guide_repotting_schedule;
	private String guide_repotting_content;
	private String guide_harvest_time;
	private String guide_harvest_content;
	
	
	
	
}
