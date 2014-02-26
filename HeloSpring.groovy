
@RestController
class HelloSpring {

	@RequestMapping("/greet/{me}")
	def String greet(@PathVariable String me) {
		"Hello ${me}!"
	}

}
