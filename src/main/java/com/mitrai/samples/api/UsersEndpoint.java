/**
 *
 */
package com.mitrai.samples.api;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.mitrai.samples.util.DataIntegrityViolationException;
import com.mitrai.samples.util.User;

/**
 * @author Methmal
 *
 */
@Controller
@RequestMapping(value = "/users")
public class UsersEndpoint {

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public User createUser(@RequestBody User user) {
		if (user != null && user.getAge() > 18) {
			user.setUserId(1);
			return user;
		} else {
			throw new DataIntegrityViolationException(user);
		}

	}

/*	@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Data Integrity costraints violating with this operation")
	@ExceptionHandler(DataIntegrityViolationException.class)
	public void conflict() {
		// Nothing to do
	}*/

}
