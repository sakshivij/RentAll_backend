package com.example.Rent;

import java.util.List;

public interface ProfileDAL {

	List<Profile> getAllProfiles();
	Profile getProfileByEmail(String email);
	Profile addProfile(Profile profile);
	void deleteProfile(String email);
}
