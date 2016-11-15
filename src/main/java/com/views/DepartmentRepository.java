package com.views;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.models.Department;

@Repository
public interface DepartmentRepository extends PagingAndSortingRepository<Department, Long>{

	 List<Department> findAllDepartmentById(long id);

}
