package com.example.bookStore.BookStore.Service;


import com.example.bookStore.BookStore.Exception.UserException;
import com.example.bookStore.BookStore.Module.User;
import com.example.bookStore.BookStore.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }
    
    @Override
    public List<User> getUsers(){
    	return this.userRepository.findAll();
    	
    }
    
    @Override
    public User updateUser(User user){
        Optional<User> userObj = this.userRepository.findById((long) user.getUser_id());

        if(userObj.isPresent()) {
            User userUpdate = userObj.get();
            userUpdate.setUser_id((int) user.getUser_id());
            userUpdate.setFirst_name(user.getFirst_name());
            userUpdate.setPhone_no(user.getPhone_no());
            userUpdate.setEmail_id(user.getEmail_id());
            userUpdate.setWallet(user.getWallet());
            userUpdate.setIs_suspended(user.getIs_suspended());

            return this.userRepository.save(userUpdate);
        }else{
            throw new UserException("User not found with ID: " + user.getUser_id());
        }
    }

    @Override
    public User suspendUser(User user){
        Optional<User> userObj = this.userRepository.findById((long) user.getUser_id());
        if(userObj.isPresent()) {
            User userUpdate = userObj.get();
            userUpdate.setIs_suspended(1);
            return this.userRepository.save(userUpdate);
        }else{
            throw new UserException("User not found with ID: " + user.getUser_id());
        }
    }
	@Override
	public User addMoney(User user, int money) {
		Optional<User> userObj=this.userRepository.findById((long) user.getUser_id());
		if(userObj.isPresent()) {
			User userUpdate=userObj.get();
			if((money!=0) && money%500==0) {
				int tempMoney=money+user.getWallet();
				userUpdate.setWallet(tempMoney);
				return this.userRepository.save(userUpdate);
			}
			else {
				throw new UserException("Please money in multiples of 500");
			}
		}
		else{
            throw new UserException("User not found with ID: " + user.getUser_id());
        }
	}
    }





