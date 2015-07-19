@RestController
class ThisWillActuallyRun {

	@RequestMapping("/")
	String home() {
		"Hello Mr. T!"
	}
}