@RestController
class ThisWillActuallyRun {

	@RequestMapping("/Groovy")
	String home() {
		"Hello Mr. T - Yet another change!"
	}
}