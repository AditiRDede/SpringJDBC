package com.traini8.trainingcenters.Repository;
import com.traini8.trainingcenters.model.TrainingCenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.util.List;
@Repository
public class TrainingCenterRepository
{
    //jdbcTemplate creation
    private final JdbcTemplate jdbc;

    @Autowired
    public TrainingCenterRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }


    public void save(TrainingCenter trainingCenter)
    {
        String sql="INSERT INTO TRAININGCENTER (CenterCode, CenterName, StudentCapacity, CreatedON, ContactEmail, ContactPhone) Values(?,?,?,?,?,?)";
       int rows= jdbc.update(sql,trainingCenter.getCenterCode(),trainingCenter.getCenterName(),trainingCenter.getSutudentCapacity(),trainingCenter.getCreatedOn(),trainingCenter.getContactEmail(),trainingCenter.getContactPhone());
        System.out.println("training center saved-->rows affeacted "+rows);
    }
    public List<TrainingCenter> findAll()
    {

        String sql="Select * From TRAININGCENTER";
        RowMapper<TrainingCenter> mapper=new RowMapper<TrainingCenter>() {
            @Override
            public TrainingCenter mapRow(ResultSet rs, int rowNum) throws SQLException
            {

                TrainingCenter trainingCenter=new TrainingCenter();
                trainingCenter.setCenterCode(rs.getString("CenterCode"));
                trainingCenter.setCenterName(rs.getString("CenterName"));
                trainingCenter.setSutudentCapacity(rs.getInt("StudentCapacity"));
                trainingCenter.setCreatedOn(rs.getString("CreatedOn"));
                trainingCenter.setContactEmail(rs.getString("ContactEmail"));
                trainingCenter.setContactPhone(rs.getString("ContactPhone"));
                return trainingCenter;
            }
        };
        return jdbc.query(sql,mapper);

      //  return trainingCenterList;
    }
}
