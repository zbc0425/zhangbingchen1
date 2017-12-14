package com.zbc.service;

import com.zbc.pojo.Users;
import com.zbc.dao.UsersMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* Service Class Users
*
* 2017-12-13
*/

@Service
@Transactional
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;
    public Users Login(String userName,String password){
    	try {
    	    HashMap<String, Object> param =new HashMap<String,Object>();
    	    param.put("userName", userName);
			List<Users> users =usersMapper.getUsersListByMap(param);
			if(users.size()>0){
				Users user =users.get(0);
				if(user!=null&user.getPassword().equals(password)){
					return user;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
    @Transactional(readOnly = true)
    public Users getUsersById(Integer id)throws Exception{
        return usersMapper.getUsersById(id);
    }

    @Transactional(readOnly = true)
    public List<Users> getUsersListByMap(Map<String,Object> param)throws Exception {
        return usersMapper.getUsersListByMap(param);
    }
    
    @Transactional(readOnly = true)
    public Integer getUsersRecCountByMap(Map<String,Object> param)throws Exception {
    	return usersMapper.getUsersRecordCount(param);
    }
    

    public Integer insertUsers(Users users)throws Exception {
        return usersMapper.insertUsers(users);
    }

    public Integer updateUsers(Users users)throws Exception {
        return usersMapper.updateUsers(users);
    }

    public Integer deleteUsersById(Integer id)throws Exception {
        return usersMapper.deleteUsersById(id);
    }

}