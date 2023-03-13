package web.springboot.PP_3_1.service;


import web.springboot.PP_3_1.model.User;

import java.util.List;

public interface UserService {

    public List<User> getList();

    public void save(User user);
    public void delete(Long id);

    public User get(Long id);

    public User update(User user);

}
