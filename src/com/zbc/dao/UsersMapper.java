package com.zbc.dao;

import com.zbc.pojo.Users;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
* Mapper Interface Users
*
* 2017-12-13
*/
public interface UsersMapper {

    public Users getUsersById(@Param(value = "id") Integer id)throws Exception;

    public List<Users> getUsersListByMap(Map<String,Object> param)throws Exception;

	public Integer getUsersRecordCount(Map<String,Object> param)throws Exception;

    public Integer insertUsers(Users users)throws Exception;

    public Integer updateUsers(Users users)throws Exception;

    public Integer deleteUsersById(@Param(value = "id") Integer id)throws Exception;

}