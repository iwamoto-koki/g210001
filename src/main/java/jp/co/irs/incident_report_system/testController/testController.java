package jp.co.irs.incident_report_system.testController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
	@RequestMapping(path = "/")
	public String index() {
		return "index";
		}
}
