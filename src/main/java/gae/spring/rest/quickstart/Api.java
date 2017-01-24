package gae.spring.rest.quickstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Api {

	@RequestMapping(value = "/helloworld", method = RequestMethod.GET)
	public @ResponseBody String helloworld() {
		return "hello world";
	}

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public @ResponseBody String hello(@PathVariable String name) {
		return "hello " + name;
	}

	// jackson is required in classpath for this method, as it returns json data
	// (spring automatically processes it)
	@RequestMapping(value = "/hellojson", method = RequestMethod.GET)
	public @ResponseBody Result json() {
		return new Result("hello json");
	}

	public static class Result {
		private String message;

		public Result(String message) {
			this.message = message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
	}

}