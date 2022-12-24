package com.management.metrics.entity;

import lombok.*;

/**
 * Basic implementation of the Metric abstraction
 */

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Metric {

	private final String name;
	private final long timestamp;
}
