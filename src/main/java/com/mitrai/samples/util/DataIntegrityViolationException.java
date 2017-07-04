/**
 *
 */
package com.mitrai.samples.util;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Data Integrity costraints violating with this operation")
public class DataIntegrityViolationException extends RuntimeException {
	private static final long serialVersionUID = -3332292346834265371L;

	public DataIntegrityViolationException(Object entity) {
		super("DataIntegrityViolationException with entity= " + entity);
	}
}
