package com.everyone.everyoneswebshop.Entity.Repository;

import com.everyone.everyoneswebshop.Entity.Model.InitialData;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InitialDataRepository extends CassandraRepository<InitialData,Long> {

    @Query("Select * FROM Initial_data")
    Iterable<InitialData> findAllInitialData(String companyData);
}
