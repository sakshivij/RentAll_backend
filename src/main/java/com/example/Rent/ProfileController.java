package com.example.Rent;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.jar.Pack200;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class ProfileController {

	
	private final ProfileRepository profileRepository;
	//private final ProfileDALImpl profileDALImpl;
	
	public ProfileController(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}
	
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public List<Profile> getAllProfiles() {
		//LOG.info("Getting all users.");
		return profileRepository.findAll();
	}
	
	@RequestMapping(value = "/profile/{id}", method = RequestMethod.GET)
	public Profile getProfile(@PathVariable String id) {

		return profileRepository.findById(id).get();
	}
	
	@RequestMapping(value ="/profile/create", method= RequestMethod.POST)
	public Profile addProfile(@RequestBody Profile profile) {
		return profileRepository.save(profile);
	}
	
	@RequestMapping(value ="/profile/delete", method= RequestMethod.POST)
	public void deleteProfile(@RequestBody Profile profile) {
		profileRepository.delete(profile);
	}
}