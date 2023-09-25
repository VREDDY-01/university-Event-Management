package com.vishnu.universityEventManagement.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Event {
	@Id
	private Integer eventId;
	private String eventName;
	private String locationOfEvent;
	private LocalDate date;
	@JsonFormat(pattern = "HH:mm:ss",shape = JsonFormat.Shape.STRING)
	private LocalTime startTime;
	@JsonFormat(pattern = "HH:mm:ss",shape = JsonFormat.Shape.STRING)
	private LocalTime endTime;
}
