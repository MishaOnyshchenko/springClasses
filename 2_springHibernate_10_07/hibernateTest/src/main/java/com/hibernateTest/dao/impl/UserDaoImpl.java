package com.hibernateTest.dao.impl;

import com.hibernateTest.dao.UserDao;
import com.hibernateTest.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository(value = "userMethodForDb")
public class UserDaoImpl implements UserDao {

//    @Autowired
//    private ConnectConfig connectConfig;

//    @Autowired
//    private Connection connection;

//    @PostConstruct
//    public void init(){
//        connection = connectConfig.createConnection();
//    }

    @Override
    public List<User> userList() {

//        final String QUERY_SQL = "SELECT * FROM students_db5";
//
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//
//        List<User> userList = new ArrayList<>();
//        try {
//            ps = connection.prepareStatement(QUERY_SQL);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                User user = new User();
//                user.setName(rs.getString(1));
//                user.setSurname(rs.getString(2));
//                userList.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                rs.close();
//                ps.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//
//        }
        return null;
    }

    @Override
    public User getByName() {
        return null;
    }

    @Override
    public User getBySurname() {
        return null;
    }
}
