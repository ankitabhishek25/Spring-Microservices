package com.cognizant.treatment.offerings.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cognizant.treatment.offerings.Entity.PackageDetails;

public interface PackgeRepository extends CrudRepository<PackageDetails, Integer> {

	@Query(value = "select * from packagedetails p where p.packageName=:packageName", nativeQuery = true)
	List<PackageDetails> findByPackageName(@Param("packageName") String packageName);

	@Query(value = "SELECT * FROM PACKAGEDETAILS P WHERE  P.PACKAGENAME=:packageName AND P.AILMENT_ID=(SELECT ID FROM AILMENT WHERE NAME=:name)", nativeQuery = true)
	PackageDetails findByPackageNameandAilment(@Param("name") String name,
			@Param("packageName") String packageName);

}
