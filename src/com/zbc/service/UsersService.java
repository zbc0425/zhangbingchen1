package com.zbc.service;

import com.zbc.pojo.Users;
import java.util.List;
import java.util.Map;

/**
* Service Interface Users
*
* 2017-12-13
*/
public interface UsersService {
	 public Users Login(String username,String userpassword);
    /**
     * 通过主键Id查询Users
     */
    public Users getUsersById(Integer id)throws Exception;

    /**
     * 通过条件Map集合查询Users
     */
    public List<Users> getUsersListByMap(Map<String,Object> param)throws Exception;

	/**
	 * 通过条件Map集合查询Users记录总数
	 */
	public Integer getUsersRecCountByMap(Map<String,Object> param)throws Exception;

    /**
     * 添加Users新记录
     */
    public Integer insertUsers(Users users)throws Exception;

    /**
      * 更新Users记录
      */
    public Integer updateUsers(Users users)throws Exception;

    /**
      * 通过主键Id删除Users
      */
    public Integer deleteUsersById(Integer id)throws Exception;

}