package com.joji.l00144702;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joji.l00144702.model.StdUser;
import com.joji.l00144702.model.StdUserInterface;

@RestController
public class StdRegistrationController {
	
	@Autowired
	private StdUserInterface stdUserInterface;
	
	@RequestMapping("/check-status")
	public String stdregistercheck() {
		return "Check Register...";
	}
	
		
	@RequestMapping("/stdregister-User/{stdname}/{stdpassword}")
	public String stdregisterUser(@PathVariable("stdname") String stdname,
			@PathVariable("stdpassword") String stdpassword) {
		System.out.println("********************In registration microservice from login microservice start****************");
		StdUser ur=new StdUser();
		ur.setId(3);
		ur.setName(stdname);
		ur.setPassword(stdpassword);
		stdUserInterface.save(ur);
		System.out.println("********************In registration microservice from login microservice ends****************");
		return "Successfully Registered...";
	}
	

}
