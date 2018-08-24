package com.mvcTest3.dao.impl;

import com.mvcTest3.dao.UserDao;
import com.mvcTest3.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

//    @Autowired
//    private ConnectConfig connectConfig;

//    @Autowired
//    private Connection connection;

//    @PostConstruct
//    public void init(){
//        connection = connectConfig.createConnection();
//    }

    @Override
    public void sddStudent(Student student) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(student);
    }

    @Override
    public Student getById(long theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.get(Student.class, theId);
    }

    @Override
    public List<Student> userList() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Student> theQuerry = currentSession.createQuery("from Student", Student.class);
        List<Student> students = theQuerry.getResultList();
        return students;

//        final String QUERY_SQL = "SELECT * FROM students_db5";
//
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//
//        List<Student> userList = new ArrayList<>();
//        try {
//            ps = connection.prepareStatement(QUERY_SQL);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                Student user = new Student();
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
//        return null;
    }




}
