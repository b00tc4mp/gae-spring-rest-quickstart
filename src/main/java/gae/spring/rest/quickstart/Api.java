package gae.spring.rest.quickstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(value = "/hellojson/get/{name}", method = RequestMethod.GET)
	public @ResponseBody Output jsonGet(@PathVariable String name) {
		return new Output("hello " + name);
	}

	@RequestMapping(value = "/hellojson/post", method = RequestMethod.POST)
	public @ResponseBody Output jsonPost(@RequestBody Input input) {
		return new Output("hello " + input.getMessage());
	}

	public static class Input {
		private String message;

		public void setMessage(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
	}

	public static class Output {
		private String message;

		public Output(String message) {
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